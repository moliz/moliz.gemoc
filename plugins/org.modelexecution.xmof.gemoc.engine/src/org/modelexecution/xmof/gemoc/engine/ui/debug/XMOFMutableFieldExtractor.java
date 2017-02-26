package org.modelexecution.xmof.gemoc.engine.ui.debug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gemoc.executionframework.engine.ui.debug.IMutableFieldExtractor;
import org.gemoc.executionframework.engine.ui.debug.MutableField;

public class XMOFMutableFieldExtractor implements IMutableFieldExtractor {

	private Map<EClass, Integer> counters = new HashMap<EClass, Integer>();

	public XMOFMutableFieldExtractor() {

	}

	@Override
	public List<MutableField> extractMutableField(EObject configurationObject) {
		List<MutableField> mutableFields = new ArrayList<MutableField>();

		// We find the original class (i.e. class of the corresponding static object)
		EClass originalEClass = retrieveOriginalEClass(configurationObject);

		if (originalEClass != null) {
			for (EStructuralFeature feature : configurationObject.eClass().getEAllStructuralFeatures()) {

				// We check whether the original class has the feature or not
				boolean isInOriginal = originalEClass.getEAllStructuralFeatures().stream()
						.anyMatch((f) -> f.getName().equals(feature.getName()));

				if (!isInOriginal) {
					mutableFields.add(createMutableField(configurationObject, feature));
				}

			}
		}

		return mutableFields;
	}

	private EClass retrieveOriginalEClass(EObject configurationObject) {
		for (EClass superType : configurationObject.eClass().getEAllSuperTypes()) {
			if (configurationObject.eClass().getName().equals(superType.getName() + "Configuration")) {
				return superType;
			}
		}
		return null;
	}

	private MutableField createMutableField(EObject eObject, EStructuralFeature feature) {
		String objectName = getObjectName(eObject);
		String className = eObject.eClass().getName();
		String fieldName = feature.getName() + " (" + objectName + " :" + className + ")";
		Supplier<Object> getter = () -> {
			return eObject.eGet(feature);
		};
		Consumer<Object> setter = (Object t) -> {
		};
		return new MutableField(fieldName, eObject, feature, getter, setter);
	}

	private String getObjectName(EObject eObject) {
		String objectName = "";
		String objectID = getObjectID(eObject);
		if (objectID != null) {
			objectName = objectID;
		} else {
			String objectNameValue = getObjectNameValue(eObject);
			if (objectNameValue != null) {
				objectName = objectNameValue;
			} else {
				objectName = createObjectName(eObject);
			}
		}
		return objectName;
	}

	private static String getObjectID(EObject eObject) {
		String objectId = null;
		EAttribute idAttribute = eObject.eClass().getEIDAttribute();
		if (idAttribute != null) {
			Object id = eObject.eGet(idAttribute);
			if (id != null) {
				objectId = id.toString();
			}
		}
		return objectId;
	}

	private static String getObjectNameValue(EObject eObject) {
		String objectNameValue = null;
		EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
		if (nameFeature != null) {
			Object nameValue = eObject.eGet(nameFeature);
			if (nameValue instanceof String) {
				objectNameValue = (String) nameValue;
			}
		}
		return objectNameValue;
	}

	private String createObjectName(EObject eObject) {
		String className = eObject.eClass().getName();
		int objectCounter = getObjectCounter(eObject);
		return className + "_" + objectCounter;
	}

	private int getObjectCounter(EObject eObject) {
		EClass eClass = eObject.eClass();
		if (!counters.containsKey(eClass)) {
			counters.put(eClass, 0);
		}
		int counter = counters.get(eClass);
		counters.put(eClass, counter + 1);
		return counter;
	}
}
