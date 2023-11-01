package com.medha.apiDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobile_info")
public class MobileStore {
	
    @Id
	private String mobile_id;
	private String mobile_company;
	private String mobile_model;
	private int mobile_price;
	
	public MobileStore() {
		
	}
	
	public MobileStore(String mobile_id, String mobile_company, String mobile_model, int mobile_price) {
		//super();
		this.mobile_id = mobile_id;
		this.mobile_company = mobile_company;
		this.mobile_model = mobile_model;
		this.mobile_price = mobile_price;
	}
	
	public String getMobile_id() {
		return mobile_id;
	}

	public void setMobile_id(String mobile_id) {
		this.mobile_id = mobile_id;
	}

	public String getMobile_company() {
		return mobile_company;
	}

	public void setMobile_company(String mobile_company) {
		this.mobile_company = mobile_company;
	}

	public String getMobile_model() {
		return mobile_model;
	}

	public void setMobile_model(String mobile_model) {
		this.mobile_model = mobile_model;
	}

	public int getMobile_price() {
		return mobile_price;
	}

	public void setMobile_price(int mobile_price) {
		this.mobile_price = mobile_price;
	}


}
