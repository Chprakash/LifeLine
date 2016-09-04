package com.business.webservice.converter;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.webservice.DTO.BusinesssrcDTO;
import com.business.webservice.DTO.UserRegistrationDTO;
import com.business.webservice.model.Businesssrc;
import com.business.webservice.model.User;
import com.business.webservice.model.UserRole;

@Service
public class ModelToDTO {
	
	@Autowired
	private BusinesssrcDTO businesssrcDTO;
	
	@Autowired
	private UserRegistrationDTO userRegistrationDTO;
	
	public BusinesssrcDTO businesssrcConvertor(Businesssrc businesssrc)
	{
		businesssrcDTO.setAcstatus(businesssrc.getAcstatus());
		businesssrcDTO.setAdharCardNo(businesssrc.getAdharCardNo());
		businesssrcDTO.setAppid(businesssrc.getApplogincredentials().getAppid());
		businesssrcDTO.setBusiName(businesssrc.getBusiName());
		businesssrcDTO.setBusiSrcId(businesssrc.getBusiSrcId());
		businesssrcDTO.setBusiTypeid(businesssrc.getBusiTypeid());
		businesssrcDTO.setPancardNo(businesssrc.getPancardNo());
		businesssrcDTO.setUserid(businesssrc.getUser().getId());
		return businesssrcDTO;
		
	}
	
	public UserRegistrationDTO userConvertor(User user)
	{
		userRegistrationDTO.setActive(user.getActive());
		userRegistrationDTO.setEmailId(user.getEmailId());
		userRegistrationDTO.setId(user.getId());
		userRegistrationDTO.setLocked(user.getLocked());
		userRegistrationDTO.setPassword(user.getPassword());
		Set<UserRole> userRoles=user.getUserRoles();
		Iterator<UserRole> roles= userRoles.iterator();
		while(roles.hasNext())
		{
			//System.out.println(roles.next().getRole());
			userRegistrationDTO.setRole(roles.next().getRole());
		}
		
		return userRegistrationDTO;
	}

}
