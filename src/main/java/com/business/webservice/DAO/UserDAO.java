package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.User;




public interface UserDAO {

	User findById(Long id);
	
	User findByEmailId(String emailId);
	
	void save(User user);
	
	void deleteByEmailId(String emailId);
	
	List<User> findAllUsers();

}

