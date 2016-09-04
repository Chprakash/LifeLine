package com.business.webservice.DAOImpl	;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.webservice.DAO.AdminDAO;
import com.business.webservice.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public AdminDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public AdminDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Override
	@Transactional
	public List<Admin> getAdminList() {
		@SuppressWarnings("unchecked")
		List<Admin> listAdmin = (List<Admin>) sessionFactory.getCurrentSession()
				.createCriteria(Admin.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listAdmin;
	}

	@Override
	//@Transactional("transactionManager2")
	@Transactional
	public Admin getAdmin(int id) {
		String hql = "from Admin where adminid=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Admin> listAdmin = (List<Admin>) query.list();
		
		if (listAdmin != null && !listAdmin.isEmpty()) {
			return listAdmin.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdateAdmin(Admin admin) {
		sessionFactory.getCurrentSession().saveOrUpdate(admin);
	}

	@Override
	@Transactional
	public void deleteAdmin(int id) {
		Admin adminToDelete = new Admin();
		adminToDelete.setAdminid(id);
		sessionFactory.getCurrentSession().delete(adminToDelete);

	}

}
