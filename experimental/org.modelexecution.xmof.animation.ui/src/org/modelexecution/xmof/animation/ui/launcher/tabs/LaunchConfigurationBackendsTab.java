package org.modelexecution.xmof.animation.ui.launcher.tabs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtensionPoint;

public class LaunchConfigurationBackendsTab
		extends org.modelexecution.xmof.gemoc.engine.ui.launcher.tabs.LaunchConfigurationBackendsTab {
	private static String XMOF_ADDONGROUP_ID = "org.modelexecution.xmof.addongroup";

	@Override
	public void createControl(Composite parent) {
		Composite mainControl = createMainControl(parent);
		Map<String, Group> extensionGroups = createExtensionGroups(mainControl);
		extensionGroups.remove(XMOF_ADDONGROUP_ID).dispose();
		extensionControls = createExtensionControls(extensionGroups, mainControl);

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		for (String extension : extensionControls.keySet()) {
			try {
				boolean value = configuration.getAttribute(extension, false);
				Button checkbox = extensionControls.get(extension);
				checkbox.setSelection(value);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected Collection<EngineAddonSpecificationExtension> getExtensionSpecifications() {
		ArrayList<EngineAddonSpecificationExtension> result = new ArrayList<EngineAddonSpecificationExtension>();
		for (EngineAddonSpecificationExtension extension : EngineAddonSpecificationExtensionPoint.getSpecifications()) {
			if (!extension.getAddonGroupId().equals(XMOF_ADDONGROUP_ID)) {
				result.add(extension);
			}
		}
		return result;
	}

}
