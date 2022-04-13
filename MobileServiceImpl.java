package com.pt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pt.dao.MobileDao;
import com.pt.entities.Mobile;
@Service
public class MobileServiceImpl implements MobileService{
	@Autowired
	public MobileDao mobileDao;
	@Transactional
	
	public void add(Mobile mobile) {
		mobileDao.add(mobile);
	}
	@Transactional
	public void delete(Mobile mobile) {
		mobileDao.delete(mobile);
		//return r;
	}
	@Transactional
	public void update(Mobile mobile) {
		mobileDao.update(mobile);
	}
	@Transactional
	public List<Mobile> selection(){
		return mobileDao.selection();
	}
}
