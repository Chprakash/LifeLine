package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.Role;




public interface UserProfileDAO {

	List<Role> findAll();
	
	Role findByType(String type);
	
	Role findById(int id);
}
