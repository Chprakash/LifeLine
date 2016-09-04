package com.business.webservice.DAOImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.business.webservice.DAO.AbstractDAO;
import com.business.webservice.DAO.UserProfileDAO;
import com.business.webservice.model.Role;





@Repository("userProfileDao")
public class UserProfileDAOImpl extends AbstractDAO<Integer, Role>implements UserProfileDAO{

	public Role findById(int id) {
		return getByKey(id);
	}

	public Role findByType(String type) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("type", type));
		return (Role) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Role> findAll(){
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("type"));
		return (List<Role>)crit.list();
	}
	
}
