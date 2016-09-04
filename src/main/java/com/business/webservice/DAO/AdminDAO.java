package com.business.webservice.DAO;

import java.util.List;

import com.business.webservice.model.Admin;

public interface AdminDAO {
	public List<Admin> getAdminList();
	public Admin getAdmin(int id);
	public void saveOrUpdateAdmin(Admin admin);
	public void deleteAdmin(int id);
}
