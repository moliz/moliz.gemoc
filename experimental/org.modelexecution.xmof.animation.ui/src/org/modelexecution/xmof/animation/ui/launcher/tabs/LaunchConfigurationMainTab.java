package org.modelexecution.xmof.animation.ui.launcher.tabs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.gemoc.commons.eclipse.emf.URIHelper;
import org.modelexecution.xmof.animation.ui.Activator;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;

public class LaunchConfigurationMainTab
		extends org.modelexecution.xmof.gemoc.engine.ui.launcher.tabs.LaunchConfigurationMainTab {

	@Override
	public void createControl(Composite parent) {
		this.parent = parent;
		Composite area = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);

		Group modelArea = createGroup(area, "Model:");
		createModelLayout(modelArea, null);

		Group languageArea = createGroup(area, "Language:");
		createLanguageLayout(languageArea, null);
		nodewiseStepping.setVisible(false);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		super.setDefaults(configuration);
		configuration.setAttribute(RunConfiguration.LAUNCH_NODEWISE_STEP, true);
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			RunConfiguration runConfiguration = new RunConfiguration(configuration);
			modelLocationText.setText(URIHelper.removePlatformScheme(runConfiguration.getExecutedModelURI()));
			ignoreSteps.setSelection(runConfiguration.getIgnoreSteps());

			languageCombo.setText(runConfiguration.getLanguageName());

			modelInitializationModelText.setText(runConfiguration.getModelInitializationModel());

		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI,
				this.modelLocationText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_SELECTED_LANGUAGE, languageCombo.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_MELANGE_QUERY, melangeQueryText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_INITIALIZATION_MODEL,
				modelInitializationModelText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_IGNORE_STEPS, ignoreSteps.getSelection());
	}

}
