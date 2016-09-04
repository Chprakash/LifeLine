package com.business.webservice.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.UserDAO;
import com.business.webservice.DTO.UserRegistrationDTO;
import com.business.webservice.converter.ModelToDTO;
import com.business.webservice.model.AuditInfo;
import com.business.webservice.model.User;
import com.business.webservice.service.UserService;




@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;

	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ModelToDTO modelToDTO;
	
	public User findById(Long id) {
		return dao.findById(id);
	}

	public User findByEmailId(String emailId) {
		User user = dao.findByEmailId(emailId);
		return user;
	}

	public void saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		dao.save(user);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateUser(User user) {
		User entity = dao.findById(user.getId());
		if(entity!=null){
			entity.setEmailId(user.getEmailId());
			if(!user.getPassword().equals(entity.getPassword())){
				entity.setPassword(passwordEncoder.encode(user.getPassword()));
			}
			AuditInfo auditInfo=new AuditInfo();
			//entity.setCreatedDate(new Date());//required only while creating
			entity.setLastUpdatedDate(new Date());
			entity.setUpdatedBy(user.getId());
			//entity.setCreatedBy(user.getId());//required only while creating
			
			//entity.setUserRoles(user.getUserRoles());
		}
	}

	@Override
	public void deleteUserByEmailId(String emailId) {
		dao.deleteByEmailId(emailId);
	}

	public List<UserRegistrationDTO> findAllUsers() {
		List<User> userList=dao.findAllUsers();
		List<UserRegistrationDTO> userRegistrationListDTO= new ArrayList<UserRegistrationDTO>();
		Iterator<User> users= userList.iterator();
		while(users.hasNext())
		{
			userRegistrationListDTO.add(modelToDTO.userConvertor(users.next()));
		}
		return userRegistrationListDTO;
	}

	@Override
	public boolean isUserEmailIdUnique(Long id, String emailId) {
		User user = findByEmailId(emailId);
		return ( user == null || ((id != null) && (user.getId() == id)));
	}

}
