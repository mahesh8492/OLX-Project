package com.zensar.olx.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.bean.OLXUser;
import com.zensar.olx.db.OLXUserDAO;

@Service
public class OLXUserService {
	
	@Autowired
	OLXUserDAO dao;
	
	public OLXUser addOlxUser(OLXUser olxUser) {
		return this.dao.save(olxUser);
	}
	
	public OLXUser updateOlxUser(OLXUser olxUser) {
		return this.dao.save(olxUser);
	}
	public  OLXUser findOlxUser(int id) {
		Optional<OLXUser>optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
	public OLXUser findOlxUserByName(String name) {
		OLXUser olxUser=this.dao.findByUserName(name);
		return olxUser;
	}
}
