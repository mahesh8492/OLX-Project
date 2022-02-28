package com.zensar.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.bean.AdvertismentStatus;
import com.zensar.olx.db.AdvertisementStatusDAO;

@Service
public class AdvertismentStatusService {
	@Autowired
	AdvertisementStatusDAO dao;
	
	public AdvertismentStatus addAdvertismentStatus(AdvertismentStatus advertismentStatus) {
		return this.dao.save(advertismentStatus);
	}
	
	public List<AdvertismentStatus> getAllAdvertismentStatus(){
		return this.dao.findAll();
	}
	
	public AdvertismentStatus findAdvertismentStatus(int id) {
		Optional<AdvertismentStatus> optional;
		optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
}
