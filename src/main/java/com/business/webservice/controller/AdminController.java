/*package com.prakash.busi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dao.AdminDAO;
import com.prakash.busi.model.Admin;


@RestController
@RequestMapping("/d2dshopping")
public class AdminController {

	@Autowired
	private AdminDAO adminDAO;
	//admin controller
	@RequestMapping(value = "/admin", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody Admin createAdmin(@RequestBody Admin admin) {

		admin.setCreateddate(new Date());
		admin.setLastupdateddate(new Date());
		adminDAO.saveOrUpdateAdmin(admin);
		return admin;  
	}

	@RequestMapping(value="/admin/{id}", method = RequestMethod.GET, produces="application/json")
	public Admin getAdmin(@PathVariable("id")Integer id) {
		Admin admin = adminDAO.getAdmin(id);
		System.out.println(admin);
		return admin;
	}

	@RequestMapping(value = "/admin/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody Admin updateAdmin(@RequestBody Admin admin,@PathVariable("id")Integer id) {

		admin.setLastupdateddate(new Date());
		if(adminDAO.getAdmin(id) instanceof Admin)
			adminDAO.saveOrUpdateAdmin(admin);
		return admin;  
	}

	@RequestMapping(value = "/deleteadmin/{id}", method = RequestMethod.PUT, produces="application/json")
	public @ResponseBody Admin deleteAdmin(@PathVariable("id")Integer id) 
	{
		Admin admin=adminDAO.getAdmin(id);
		admin.setLastupdateddate(new Date());
		admin.setStatus(0);
		adminDAO.saveOrUpdateAdmin(admin);
		return admin;
	}

	@RequestMapping("/admins")
	public List<Admin> getAdminList() {
		List<Admin> admins = adminDAO.getAdminList();
		return admins;
	}
}
*/