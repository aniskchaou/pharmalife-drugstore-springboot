package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Supplier;
import com.dev.delta.repositories.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	SupplierRepository  supplierRepository;
	
	public Supplier saveOrUpdate(Supplier supplier)
	{
		
		return supplierRepository.save(supplier);
	}
	
	public Iterable<Supplier> findAll()
	{
		return supplierRepository.findAll();
	}
	
	public Supplier findById(Long id)
	{
		return supplierRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Supplier supplier=findById(id);
		supplierRepository.delete(supplier);
	}
}
