package com.business.webservice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.webservice.DAO.BusiSRCDAO;
import com.business.webservice.DTO.BusinesssrcDTO;
import com.business.webservice.model.Businesssrc;
import com.business.webservice.service.BusinesssrcService;
import com.business.webservice.validator.Validator;



@RestController
@RequestMapping("/d2dshopping")
public class BusiSRCController {
	@Autowired
	private BusiSRCDAO busiSRCDAO;
	
	@Autowired
	private BusinesssrcService businsesssrcService;
	
	@Autowired
	private Validator validator;
	
	@RequestMapping(value = "/busiSRC", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody ResponseEntity<Businesssrc> createBusi(@RequestBody Businesssrc busiSRC) {
		
		busiSRC.setAcstatus(1);
		busiSRC.setCreateddate(new Date());
		busiSRC.setLastupdateddate(new Date());
		busiSRCDAO.saveOrUpdateBusiSRC(busiSRC);
		return new ResponseEntity<Businesssrc>(busiSRC,HttpStatus.CREATED);  
	}
	
	@RequestMapping(value="/busiSRC/{id}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<BusinesssrcDTO> getBusi(@PathVariable("id")Integer id) {
		try{
			validator.numericNullCheck(id);
		}
		catch(Exception e)
		{
			return new ResponseEntity<BusinesssrcDTO>(new BusinesssrcDTO(), HttpStatus.BAD_REQUEST);
		}
		BusinesssrcDTO busiSRC = businsesssrcService.getBusiSRC(id);
		return new ResponseEntity<BusinesssrcDTO>(busiSRC, HttpStatus.OK);
	}
	
	@RequestMapping(value="/maxAppID", method = RequestMethod.GET, produces="application/json")
	public int getMaxAppID() {
			int maxAppid= busiSRCDAO.getMaxAppID();
		return maxAppid;
	}
	
	@RequestMapping(value = "/busiSRC/{id}", method = RequestMethod.PATCH,  consumes="application/json", produces="application/json")
	public @ResponseBody ResponseEntity<Businesssrc> updateBusi(@RequestBody Businesssrc busiSRC,@PathVariable("id")Integer id) {
		
		busiSRC.setLastupdateddate(new Date());
		if(busiSRCDAO.getBusiSRC(id) instanceof Businesssrc)
			busiSRCDAO.saveOrUpdateBusiSRC(busiSRC);
		return new ResponseEntity<Businesssrc>(busiSRC, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletebusiSRC/{id}", method = RequestMethod.PATCH, produces="application/json")
	public @ResponseBody ResponseEntity<Businesssrc> deleteBusi(@PathVariable("id")Integer id) 
	{
		Businesssrc busiSRC=busiSRCDAO.getBusiSRC(id);
		busiSRC.setAcstatus(0);
		busiSRC.setLastupdateddate(new Date());
		busiSRCDAO.saveOrUpdateBusiSRC(busiSRC);
		return new ResponseEntity<Businesssrc>(busiSRC, HttpStatus.OK);
	}
	
	@RequestMapping(value="/busiSRCs", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<BusinesssrcDTO>> getBusiSRCs() {
		List<BusinesssrcDTO> busiSRCList=businsesssrcService.getBusiSRCList();
		
		return new ResponseEntity<List<BusinesssrcDTO>>(busiSRCList,HttpStatus.OK);
	}
}
