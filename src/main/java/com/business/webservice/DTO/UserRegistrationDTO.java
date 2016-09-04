package com.business.webservice.DTO;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.business.webservice.model.Role;
import com.business.webservice.model.UserRole;

@Component
public class UserRegistrationDTO {
	
	private Long id;
	private String emailId;
	private String password;
	private Boolean active;//active inactive is done by user
	private Boolean locked;//lock unlock is done by admin
	private Role role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getLocked() {
		return locked;
	}
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
		
}
