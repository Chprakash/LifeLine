package com.business.webservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.UserProfileDAO;
import com.business.webservice.model.Role;
import com.business.webservice.service.UserProfileService;




@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDAO dao;
	
	public Role findById(int id) {
		return dao.findById(id);
	}

	public Role findByType(String type){
		return dao.findByType(type);
	}

	public List<Role> findAll() {
		return dao.findAll();
	}
}
