package com.business.webservice.service;

import java.util.List;

import com.business.webservice.model.Role;




public interface UserProfileService {

	Role findById(int id);

	Role findByType(String type);
	
	List<Role> findAll();
	
}
