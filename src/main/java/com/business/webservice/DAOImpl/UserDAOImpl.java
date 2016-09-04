package com.business.webservice.DAOImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.business.webservice.DAO.AbstractDAO;
import com.business.webservice.DAO.UserDAO;
import com.business.webservice.model.User;
import com.business.webservice.model.UserRole;

@Repository("userDao")
public class UserDAOImpl extends AbstractDAO<Long, User> implements UserDAO {

	static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	public User findById(Long id) {
		User user = getByKey(id);
		if(user!=null){
			Hibernate.initialize(user.getUserRoles());
		}
		return user;
	}

	public User findByEmailId(String emailId) {
		logger.info("Email : {}", emailId);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("emailId", emailId));
		User user = (User)crit.uniqueResult();
		if(user!=null){
			Hibernate.initialize(user.getUserRoles());
		}
		return user;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("emailId"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<User> users = (List<User>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		
		for(User user : users){
			Hibernate.initialize(user.getUserRoles());
			Set<UserRole> userRoles=user.getUserRoles();
			Iterator<UserRole> roles= userRoles.iterator();
			while(roles.hasNext())
			{
				System.out.println(roles.next().getRole().getType());
			}
		}
		return users;
	}

	public void save(User user) {
		persist(user);
	}

	@Override
	public void deleteByEmailId(String emailId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("emailId", emailId));
		User user = (User)crit.uniqueResult();
		delete(user);
	}

}
