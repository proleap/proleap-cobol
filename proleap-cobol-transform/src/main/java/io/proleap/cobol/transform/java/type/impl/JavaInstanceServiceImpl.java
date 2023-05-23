package io.proleap.cobol.transform.java.type.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntryGroup;
import io.proleap.cobol.commons.datadescription.CobolPictureStringService;
import io.proleap.cobol.transform.java.type.JavaInstanceService;
import io.proleap.cobol.transform.java.type.JavaTypeService;

@Singleton
public class JavaInstanceServiceImpl implements JavaInstanceService {

	@Inject
	private JavaTypeService javaTypeService;

	@Inject
	private CobolPictureStringService pictureStringService;

	@Override
	public String mapToInstance(final DataDescriptionEntryGroup dataDescriptionEntryGroup) {
		final String typeName = javaTypeService.mapToType(dataDescriptionEntryGroup);
		final int numberOfOccurrs = pictureStringService.getMaxOccurs(dataDescriptionEntryGroup);
		final String result;

		if (numberOfOccurrs > 1) {
			result = String.format("ArrayList<%s>", typeName);
		} else {
			result = typeName;
		}

		return result;
	}
}
