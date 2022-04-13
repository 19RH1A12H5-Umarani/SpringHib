package com.pt.dao;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.pt.entities.Mobile;
@Repository
public interface MobileDao {
	
	void add(Mobile mobile);
	void delete(Mobile mobile);
	void update(Mobile mobile);
	List<Mobile> selection();
}
