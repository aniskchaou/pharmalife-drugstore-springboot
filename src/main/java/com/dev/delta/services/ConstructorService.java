package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Constructor;
import com.dev.delta.repositories.ConstructorRepository;

@Service
public class ConstructorService {
	@Autowired
	ConstructorRepository  constructorRepository;
	
	public Constructor saveOrUpdate(Constructor constructor)
	{
		
		return constructorRepository.save(constructor);
	}
	
	public Iterable<Constructor> findAll()
	{
		return constructorRepository.findAll();
	}
	
	public Constructor findById(Long id)
	{
		return constructorRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Constructor constructor=findById(id);
		constructorRepository.delete(constructor);
	}
}
