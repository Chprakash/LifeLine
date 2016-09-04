package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.Applogincredentials;



public interface AppLoginDAO {
	public List<Applogincredentials> getAppLoginList();
	public Applogincredentials getAppLogin(int id);
	public void saveOrUpdateAppLogin(Applogincredentials appLogin);
	public void deleteAppLogin(int id);
}
