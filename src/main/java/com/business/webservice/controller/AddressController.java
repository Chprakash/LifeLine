package com.business.webservice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.webservice.DAO.AddressDAO;
import com.business.webservice.model.Addresses;


@RestController
@RequestMapping("/d2dshopping")
public class AddressController {

	@Autowired
	private AddressDAO addressDAO;
	
	//address controller
	@RequestMapping(value = "/address", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody Addresses createAddress(@RequestBody Addresses address) {

		address.setCreateddate(new Date());
		address.setLastupdateddate(new Date());
		addressDAO.saveOrUpdateAddress(address);
		return address;  
	}

	@RequestMapping(value="/address/{id}", method = RequestMethod.GET, produces="application/json")
	public Addresses getAddress(@PathVariable("id")Integer id) {
		Addresses address = addressDAO.getAddress(id);
		return address;
	}

	@RequestMapping(value = "/address/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody Addresses updateAddress(@RequestBody Addresses address,@PathVariable("id")Integer id) {

		address.setLastupdateddate(new Date());
		if(addressDAO.getAddress(id) instanceof Addresses)
			addressDAO.saveOrUpdateAddress(address);
		return address;  
	}

	@RequestMapping(value = "/deleteaddress/{id}", method = RequestMethod.PUT, produces="application/json")
	public @ResponseBody Addresses deleteAddress(@PathVariable("id")Integer id) 
	{
		Addresses address=addressDAO.getAddress(id);
		address.setLastupdateddate(new Date());
		address.setStatus(0);
		addressDAO.saveOrUpdateAddress(address);
		return address;
	}

	@RequestMapping("/addresses")
	public List<Addresses> getAdminList() {
		List<Addresses> addresses = addressDAO.getAddressList();
		return addresses;
	}

	
}
