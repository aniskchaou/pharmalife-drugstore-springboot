package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Buy;
import com.dev.delta.repositories.BuyRepository;

@Service
public class BuyService {
	@Autowired
	BuyRepository  categoryRepository;
	
	public Buy saveOrUpdate(Buy category)
	{
		
		return categoryRepository.save(category);
	}
	
	public Iterable<Buy> findAll()
	{
		return categoryRepository.findAll();
	}
	
	public Buy findById(Long id)
	{
		return categoryRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Buy category=findById(id);
		categoryRepository.delete(category);
	}
}
