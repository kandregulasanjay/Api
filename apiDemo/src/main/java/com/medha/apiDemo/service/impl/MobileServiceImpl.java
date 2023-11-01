package com.medha.apiDemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medha.apiDemo.entity.MobileStore;
import com.medha.apiDemo.repository.MobileRepository;
import com.medha.apiDemo.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	MobileRepository mobileRepository;

	public MobileServiceImpl(MobileRepository mobileRepository) {
		this.mobileRepository = mobileRepository;
	}

	@Override
	public List<MobileStore> getAllMobileStore() {
		return mobileRepository.findAll();
	}

	@Override
	public String createMobileStore(MobileStore mobileStore) {
		mobileRepository.save(mobileStore);
		return "succesfully created";
	}

	@Override
	public String updateMobileStore(MobileStore mobileStore) {
		mobileRepository.save(mobileStore);
		return "succesfully updated";
	}

	@Override
	public String deleteMobileStore(String mobile_id) {
		mobileRepository.deleteById(mobile_id);
		return "succesfully deleted";
	}

	@Override
	public MobileStore getMobileStore(String mobile_id) {
		return mobileRepository.findById(mobile_id).get();
		
	}

}
