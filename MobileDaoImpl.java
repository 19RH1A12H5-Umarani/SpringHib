package com.pt.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pt.entities.Mobile;
@Repository
public class MobileDaoImpl implements MobileDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(Mobile mobile) {
		sessionFactory.getCurrentSession().save(mobile);
	}
	/*public void delete(long num) {
		Mobile m=new Mobile();
		m.setM_num(num);
		sessionFactory.getCurrentSession().delete(m);
	}*/
	public void delete(Mobile mobile) {
		sessionFactory.getCurrentSession().delete(mobile);
	}
	public void update(Mobile mobile) {
		sessionFactory.getCurrentSession().update(mobile);
	}
	@SuppressWarnings("unchecked")
	public List<Mobile> selection(){
		//Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Mobile.class);
		List<Mobile> listUser = (List<Mobile>) sessionFactory.getCurrentSession()
                .createCriteria(Mobile.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listUser; //criteria.list();
	}
}
