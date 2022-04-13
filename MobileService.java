package com.pt.services;

import java.util.List;

import com.pt.entities.Mobile;

public interface MobileService {
	void add(Mobile mobile);
	void delete(Mobile mobile);
	void update(Mobile mobile);
	List<Mobile> selection();
}
