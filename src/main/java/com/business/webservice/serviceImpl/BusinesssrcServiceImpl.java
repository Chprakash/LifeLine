package com.business.webservice.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.webservice.DAO.BusiSRCDAO;
import com.business.webservice.DTO.BusinesssrcDTO;
import com.business.webservice.converter.ModelToDTO;
import com.business.webservice.model.Businesssrc;
import com.business.webservice.service.BusinesssrcService;

@Service
@Transactional
public class BusinesssrcServiceImpl implements BusinesssrcService{

	@Autowired
	private BusiSRCDAO busiSRCDAO;
	@Autowired
	private ModelToDTO modelToDTO;
	
	@Override
	public List<BusinesssrcDTO> getBusiSRCList() {
		List<BusinesssrcDTO> businesssrcDTOs=new ArrayList<BusinesssrcDTO>();
		List<Businesssrc> busiSRCList = busiSRCDAO.getBusiSRCList();
		Iterator<Businesssrc> busiSRCs = busiSRCList.iterator();
		while (busiSRCs.hasNext()) {
			BusinesssrcDTO businesssrcDTO=modelToDTO.businesssrcConvertor(busiSRCs.next());
			businesssrcDTOs.add(businesssrcDTO);
		}
		return businesssrcDTOs;
	}

	@Override
	public BusinesssrcDTO getBusiSRC(int id) {
		Businesssrc businesssrc=busiSRCDAO.getBusiSRC(id);
		BusinesssrcDTO businesssrcDTO=modelToDTO.businesssrcConvertor(businesssrc);
		return businesssrcDTO;
	}

	@Override
	public void saveOrUpdateBusiSRC(BusinesssrcDTO busiSRCDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBusiSR(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaxAppID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
