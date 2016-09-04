package com.business.webservice.DAOImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.BusiSRCDAO;
import com.business.webservice.model.Businesssrc;

@Repository
public class BusiSRCDAOImpl implements BusiSRCDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public BusiSRCDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public BusiSRCDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	
	@Override
	@Transactional
	public List<Businesssrc> getBusiSRCList() {
		@SuppressWarnings("unchecked")
		List<Businesssrc> listBusiSRC = (List<Businesssrc>) sessionFactory.getCurrentSession()
				.createCriteria(Businesssrc.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listBusiSRC;
	}

	@Override
	@Transactional
	public Businesssrc getBusiSRC(int id) {
		String hql = "from Businesssrc where busiSrcId=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Businesssrc> listBusiSRC = (List<Businesssrc>) query.list();
		
		if (listBusiSRC != null && !listBusiSRC.isEmpty()) {
			return listBusiSRC.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdateBusiSRC(Businesssrc busiSRC) {
		sessionFactory.getCurrentSession().saveOrUpdate(busiSRC);
		
	}

	@Override
	@Transactional
	public void deleteBusiSRC(int id) {
		Businesssrc busiSRCToDelete = new Businesssrc();
		busiSRCToDelete.setBusiSrcId(id);
		sessionFactory.getCurrentSession().delete(busiSRCToDelete);
	}

	@Override
	@Transactional
	public int getMaxAppID() {
		String hql = "select max(appid) from Businesssrc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List <Integer> maxApi=(List<Integer>)query.list();
		if(maxApi.isEmpty())
		{
			return 0;
		}
		return maxApi.get(0);
	}

}
