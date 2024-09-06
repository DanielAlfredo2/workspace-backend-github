package com.microservice.store.service;

import java.util.List;

import com.microservice.store.models.Store;

public interface StoreService {
	public List<Store> findAll();
	
	public Store findById(Long id, Integer cantidad);
}
