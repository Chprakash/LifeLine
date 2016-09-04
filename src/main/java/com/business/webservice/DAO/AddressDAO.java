package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.Addresses;

public interface AddressDAO 
{
	public List<Addresses> getAddressList();
	public Addresses getAddress(int id);
	public void saveOrUpdateAddress(Addresses address);
	public void deleteAddress(int id);
}
