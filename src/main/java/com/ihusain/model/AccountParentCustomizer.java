package com.ihusain.model;

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.mappings.OneToManyMapping;
import org.eclipse.persistence.queries.DataModifyQuery;

public class AccountParentCustomizer implements DescriptorCustomizer {

	@Override
	public void customize(ClassDescriptor descriptor) throws Exception {
		OneToManyMapping mapping = (OneToManyMapping) descriptor
				.getMappingForAttributeName("accounts");
		mapping.setCustomRemoveAllTargetsQuery(new DataModifyQuery("update account set id = id where id = 84"));
	}
}
