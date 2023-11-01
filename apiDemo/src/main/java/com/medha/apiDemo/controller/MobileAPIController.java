package com.medha.apiDemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medha.apiDemo.entity.MobileStore;
import com.medha.apiDemo.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileAPIController {
	
	MobileService mobileService;
	
	
	public MobileAPIController(MobileService mobileService) {
		this.mobileService = mobileService;
	}
    
	//To get specific Mobile details from DB
	@GetMapping("{mobile_id}")
	public MobileStore getMobileDetails(@PathVariable("mobile_id") String mobile_id) {
	    return mobileService.getMobileStore(mobile_id);
	}
	
	//To get all Mobile Details from DB
	@GetMapping
	public List<MobileStore> getAllMobileDetails() {
	    return mobileService.getAllMobileStore();
	}
	
	@PostMapping
	public String createMobileDetails(@RequestBody MobileStore mobileStore) {
		
		mobileService.createMobileStore(mobileStore);
		return "Mobile details Created Successfully";
		
	}
	
	@PutMapping
	public String updateMobileDetails(@RequestBody MobileStore mobileStore) {
		
		mobileService.updateMobileStore(mobileStore);
		return "Mobile details Updated Successfully";
		
	}
	
	@DeleteMapping("{mobile_id}")
	public String deleteCloudVendorDetails(@PathVariable("mobile_id") String mobile_id) {
		mobileService.deleteMobileStore(mobile_id);
		return "Mobile Details Deleted Successfully..";
	}


}
