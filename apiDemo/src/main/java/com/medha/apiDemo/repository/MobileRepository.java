package com.medha.apiDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medha.apiDemo.entity.MobileStore;

public interface MobileRepository extends JpaRepository<MobileStore, String> {

}
