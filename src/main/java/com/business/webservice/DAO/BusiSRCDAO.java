package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.Businesssrc;

public interface BusiSRCDAO {
	public List<Businesssrc> getBusiSRCList();
	public Businesssrc getBusiSRC(int id);
	public void saveOrUpdateBusiSRC(Businesssrc busiSRC);
	public void deleteBusiSRC(int id);
	public int getMaxAppID();
}
