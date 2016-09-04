package com.business.webservice.DAOImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.BusiContactDAO;
import com.business.webservice.model.Businesscontact;

@Repository
public class BusiContactDAOImpl implements BusiContactDAO{

	
	@Autowired
	private SessionFactory sessionFactory;

	public BusiContactDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public BusiContactDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Override
	@Transactional
	public List<Businesscontact> getContactList() {
		@SuppressWarnings("unchecked")
		List<Businesscontact> listBusiContact = (List<Businesscontact>) sessionFactory.getCurrentSession()
				.createCriteria(Businesscontact.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listBusiContact;
	}

	@Override
	@Transactional
	public Businesscontact getContact(int id) {
		String hql = "from Businesscontact where contactid=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Businesscontact> listBusiContact = (List<Businesscontact>) query.list();
		
		if (listBusiContact != null && !listBusiContact.isEmpty()) {
			return listBusiContact.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdateContact(Businesscontact contact) {
		sessionFactory.getCurrentSession().saveOrUpdate(contact);
	}

	@Override
	@Transactional
	public void deleteContact(int id) {
		Businesscontact busiContact = new Businesscontact();
		busiContact.setContactid(id);
		sessionFactory.getCurrentSession().delete(busiContact);		
	}
}
