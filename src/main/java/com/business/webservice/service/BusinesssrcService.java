package com.business.webservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.business.webservice.DTO.BusinesssrcDTO;
import com.business.webservice.model.Businesssrc;


public interface BusinesssrcService {
	public List<BusinesssrcDTO> getBusiSRCList();
	public BusinesssrcDTO getBusiSRC(int id);
	public void saveOrUpdateBusiSRC(BusinesssrcDTO busiSRCDTO);
	public void deleteBusiSR(int id);
	public int getMaxAppID();
}
