package com.business.webservice.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.business.webservice.model.Role;
import com.business.webservice.service.UserProfileService;



/**
 * A converter class used in views to map id's to actual userProfile objects.
 */
@Component
public class UserToRoleConverter implements Converter<Object, Role>{

	static final Logger logger = LoggerFactory.getLogger(UserToRoleConverter.class);
	
	@Autowired
	UserProfileService userProfileService;

	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public Role convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		Role profile= userProfileService.findById(id);
		logger.info("Profile : {}",profile);
		return profile;
	}
	
}