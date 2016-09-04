package com.business.webservice.DAOImpl	;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.AppLoginDAO;
import com.business.webservice.model.Applogincredentials;


@Repository
public class AppLoginDAOImpl implements AppLoginDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AppLoginDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public AppLoginDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Override
	@Transactional
	public List<Applogincredentials> getAppLoginList() {
		@SuppressWarnings("unchecked")
		List<Applogincredentials> listAppLogin = (List<Applogincredentials>) sessionFactory.getCurrentSession()
				.createCriteria(Applogincredentials.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listAppLogin;
	}

	@Override
	@Transactional
	public Applogincredentials getAppLogin(int id) {
		String hql = "from Applogincredentials where appid=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Applogincredentials> listAppLogin = (List<Applogincredentials>) query.list();
		
		if (listAppLogin != null && !listAppLogin.isEmpty()) {
			return listAppLogin.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdateAppLogin(Applogincredentials appLogin) {
		sessionFactory.getCurrentSession().saveOrUpdate(appLogin);
	}

	@Override
	@Transactional
	public void deleteAppLogin(int id) {
		// TODO Auto-generated method stub
	}

}
