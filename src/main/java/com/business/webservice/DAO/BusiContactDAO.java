package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.Businesscontact;

public interface BusiContactDAO {
	public List<Businesscontact> getContactList();
	public Businesscontact getContact(int id);
	public void saveOrUpdateContact(Businesscontact contact);
	public void deleteContact(int id);
}
