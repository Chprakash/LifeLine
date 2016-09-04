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

import com.business.webservice.DAO.BusiContactDAO;
import com.business.webservice.model.Businesscontact;


@RestController
@RequestMapping("/d2dshopping")
public class BusiContactController {
	@Autowired
	private BusiContactDAO busiContactDAO;
	
	//BusiContact controller
	
		@RequestMapping(value = "/contact", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
		public @ResponseBody Businesscontact createContact(@RequestBody Businesscontact busicontact) {
			
			busicontact.setCreatedDate(new Date());
			busicontact.setLastUpdateddate(new Date());
			busiContactDAO.saveOrUpdateContact(busicontact);
			return busicontact;  
		}
		
		@RequestMapping(value="/contact/{id}", method = RequestMethod.GET, produces="application/json")
		public Businesscontact getContact(@PathVariable("id")Integer id) {
			Businesscontact busicontact = busiContactDAO.getContact(id);
			return busicontact;
		}
		
		@RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
		public @ResponseBody Businesscontact updateContact(@RequestBody Businesscontact busicontact,@PathVariable("id")Integer id) {
			
			if(busiContactDAO.getContact(id) instanceof Businesscontact)
				busiContactDAO.saveOrUpdateContact(busicontact);
			return busicontact;  
		}
		
		@RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT, produces="application/json")
		public @ResponseBody Businesscontact deleteContact(@PathVariable("id")Integer id) 
		{
			return null;
		}
		
		@RequestMapping(value="/contacts", method = RequestMethod.GET, produces="application/json")
		public List<Businesscontact> getBusis() {
			List<Businesscontact> busicontact = busiContactDAO.getContactList();
			return busicontact;
		}

}
