package com.zensar.olx.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.bean.AdvertismentStatus;
import com.zensar.olx.service.AdvertismentStatusService;

@RestController
public class AdvertismentStatusController {
		
	@Autowired
	AdvertismentStatusService service;
		
	@PostMapping("/advertise/addStatus")
	public AdvertismentStatus addAdvertismentStatus(@RequestBody AdvertismentStatus advertismentStatus) {
		return this.service.addAdvertismentStatus(advertismentStatus);
	}
	
	@GetMapping("/advertise/getAllStatus")
	public List<AdvertismentStatus> getAdvertismentStatus(){
		return this.service.getAllAdvertismentStatus();
	}
	
	@GetMapping("/advertise/status/{id}")
	public AdvertismentStatus getAdvertismentStatusById(@PathVariable(name="id") int id) {
		return this.service.findAdvertismentStatus(id);
	}
}
