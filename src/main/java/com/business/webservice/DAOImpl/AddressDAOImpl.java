package com.business.webservice.DAOImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.AddressDAO;
import com.business.webservice.model.Addresses;

@Repository
public class AddressDAOImpl implements AddressDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public AddressDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Override
	@Transactional
	public List<Addresses> getAddressList() {
		@SuppressWarnings("unchecked")
		List<Addresses> listAddress = (List<Addresses>) sessionFactory.getCurrentSession()
				.createCriteria(Addresses.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listAddress;
	}

	@Override
	@Transactional
	public Addresses getAddress(int id) {
		String hql = "from Addresses where addressId=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Addresses> listAddress = (List<Addresses>) query.list();
		
		if (listAddress != null && !listAddress.isEmpty()) {
			return listAddress.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdateAddress(Addresses address) {
		sessionFactory.getCurrentSession().saveOrUpdate(address);
	}

	@Override
	@Transactional
	public void deleteAddress(int id) {
		Addresses addressToDelete = new Addresses();
		addressToDelete.setStateid(id);
		sessionFactory.getCurrentSession().delete(addressToDelete);
	}
}
