package com.business.webservice.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.webservice.DAO.AppLoginDAO;
import com.business.webservice.model.Applogincredentials;

@RestController
@RequestMapping("/d2dshopping")
public class AppLoginController {
	
	@Autowired
	private AppLoginDAO appLoginDAO;
	
	@RequestMapping(value = "/newAppLogin", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody Applogincredentials newAppLogin(@RequestBody Applogincredentials applogincredentials) {
		
		applogincredentials.setCreateddate(new Date());
		applogincredentials.setLastupdateddate(new Date());
		appLoginDAO.saveOrUpdateAppLogin(applogincredentials);
		return applogincredentials;  
	}
	
	@RequestMapping(value="/getAppLogin/{id}", method = RequestMethod.GET, produces="application/json")
	public Applogincredentials getAppLogin(@PathVariable("id")Integer id) {
		Applogincredentials AppLogin = appLoginDAO.getAppLogin(id);
		return AppLogin;
	}
}
