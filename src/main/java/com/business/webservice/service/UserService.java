package com.business.webservice.service;

import java.util.List;

import com.business.webservice.DTO.UserRegistrationDTO;
import com.business.webservice.model.User;




public interface UserService {
	
	User findById(Long id);
	
	User findByEmailId(String emailId);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserByEmailId(String emailId);

	List<UserRegistrationDTO> findAllUsers(); 
	
	boolean isUserEmailIdUnique(Long id, String EmailId);

}