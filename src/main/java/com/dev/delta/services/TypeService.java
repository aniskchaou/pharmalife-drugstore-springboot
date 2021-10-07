package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Type;
import com.dev.delta.repositories.TypeRepository;

@Service
public class TypeService {
	@Autowired
	TypeRepository  typeRepository;
	
	public Type saveOrUpdate(Type type)
	{
		
		return typeRepository.save(type);
	}
	
	public Iterable<Type> findAll()
	{
		return typeRepository.findAll();
	}
	
	public Type findById(Long id)
	{
		return typeRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Type type=findById(id);
		typeRepository.delete(type);
	}
}
