package com.medha.apiDemo.service;

import java.util.List;

import com.medha.apiDemo.entity.MobileStore;

public interface MobileService {
	
	public String createMobileStore(MobileStore mobileStore);
	
	public String updateMobileStore(MobileStore mobileStore);
	
	public String deleteMobileStore(String mobile_id);
	
	public MobileStore getMobileStore(String mobile_id);
	
	public List<MobileStore> getAllMobileStore();

}
