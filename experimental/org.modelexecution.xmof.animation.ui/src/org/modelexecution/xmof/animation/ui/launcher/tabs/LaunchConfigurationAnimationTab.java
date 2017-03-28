package org.modelexecution.xmof.animation.ui.launcher.tabs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.gemoc.commons.eclipse.emf.URIHelper;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtensionPoint;
import org.gemoc.xdsmlframework.ui.utils.dialogs.SelectAIRDIFileDialog;
import org.modelexecution.xmof.animation.ui.Activator;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;
import org.modelexecution.xmof.gemoc.engine.ui.launcher.tabs.LaunchConfigurationTab;

import fr.obeo.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI;

public class LaunchConfigurationAnimationTab extends LaunchConfigurationTab {
	private static String XMOF_ADDONGROUP_ID = "org.modelexecution.xmof.addongroup";
	protected Composite parent;
	protected Text siriusRepresentationLocationText;
	protected Button animationFirstBreak;
	protected Map<String, Button> extensionControls;
	protected Text delayText;

	public LaunchConfigurationAnimationTab() {
		super();
		extensionControls = new HashMap<>();
	}

	@Override
	public void createControl(Composite parent) {
		this.parent = parent;
		Composite area = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);

		Group debugArea = createGroup(area, "Syntax Animation:");
		createAnimationLayout(debugArea, null);

		Group addonArea = createGroup(area, "xMOF Addons:");
		createXMOFAddonLayout(addonArea, null);

	}

	private void createXMOFAddonLayout(Composite parent, Font font) {
		for (EngineAddonSpecificationExtension extension : getXMOFAddons()) {
			createExtensionControls(extension, parent);
		}
	}

	private void createExtensionControls(EngineAddonSpecificationExtension extension, Composite parent2) {
		Button checkbox = createCheckButton(parent2, extension.getName());
		if (extension.getShortDescription() != null) {
			checkbox.setToolTipText(extension.getShortDescription());
		}
		checkbox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		extensionControls.put(extension.getName(), checkbox);

	}

	private Collection<EngineAddonSpecificationExtension> getXMOFAddons() {
		Collection<EngineAddonSpecificationExtension> addons = new ArrayList<>();
		for (EngineAddonSpecificationExtension addon : EngineAddonSpecificationExtensionPoint.getSpecifications()) {
			if (addon.getAddonGroupId().equals(XMOF_ADDONGROUP_ID)) {
				addons.add(addon);
			}
		}
		return addons;
	}

	private Composite createAnimationLayout(Composite parent, Font font) {
		createTextLabelLayout(parent, "Animator:");

		siriusRepresentationLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		siriusRepresentationLocationText.setLayoutData(createStandardLayout());
		siriusRepresentationLocationText.setFont(font);
		siriusRepresentationLocationText.addModifyListener(fBasicModifyListener);
		Button siriusRepresentationLocationButton = createPushButton(parent, "Browse", null);
		siriusRepresentationLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAIRDIFileDialog dialog = new SelectAIRDIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0]).getFullPath().toPortableString();
					siriusRepresentationLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});

		createTextLabelLayout(parent, "Delay");
		delayText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		delayText.setLayoutData(createStandardLayout());
		delayText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		createTextLabelLayout(parent, "(in milliseconds)");

		new Label(parent, SWT.NONE).setText("");
		animationFirstBreak = new Button(parent, SWT.CHECK);
		animationFirstBreak.setText("Break at start");
		animationFirstBreak.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				updateLaunchConfigurationDialog();
			}
		}

		);

		return parent;
	}

	private GridData createStandardLayout() {
		return new GridData(SWT.FILL, SWT.CENTER, true, false);
	}

	private ModifyListener fBasicModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();
		}
	};

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(RunConfiguration.LAUNCH_DELAY, 1000);
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			RunConfiguration runConfiguration = new RunConfiguration(configuration);

			if (runConfiguration.getAnimatorURI() != null)
				siriusRepresentationLocationText
						.setText(URIHelper.removePlatformScheme(runConfiguration.getAnimatorURI()));
			else
				siriusRepresentationLocationText.setText("");

			delayText.setText(Integer.toString(runConfiguration.getAnimationDelay()));
			animationFirstBreak.setSelection(runConfiguration.getBreakStart());
			for (String extension : extensionControls.keySet()) {
				try {
					boolean value = configuration.getAttribute(extension, true);
					Button checkbox = extensionControls.get(extension);
					checkbox.setSelection(value);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(AbstractDSLLaunchConfigurationDelegateUI.SIRIUS_RESOURCE_URI,
				this.siriusRepresentationLocationText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_DELAY, Integer.parseInt(delayText.getText()));
		configuration.setAttribute(RunConfiguration.LAUNCH_BREAK_START, animationFirstBreak.getSelection());
		for (Entry<String, Button> entry : extensionControls.entrySet()) {
			configuration.setAttribute(entry.getKey(), entry.getValue().getSelection());
		}

	}

	@Override
	public String getName() {
		return "Animation";
	}

}
