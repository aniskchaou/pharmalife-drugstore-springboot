package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Medicament;
import com.dev.delta.repositories.MedicamentRepository;

@Service
public class MedicamentService {
	@Autowired
	MedicamentRepository  medicamentRepository;
	
	public Medicament saveOrUpdate(Medicament medicament)
	{
		
		return medicamentRepository.save(medicament);
	}
	
	public Iterable<Medicament> findAll()
	{
		return medicamentRepository.findAll();
	}
	
	public Medicament findById(Long id)
	{
		return medicamentRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Medicament medicament=findById(id);
		medicamentRepository.delete(medicament);
	}
}
