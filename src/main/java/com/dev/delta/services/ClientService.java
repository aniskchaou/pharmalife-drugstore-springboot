package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Client;
import com.dev.delta.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository  clientRepository;
	
	public Client saveOrUpdate(Client client)
	{
		
		return clientRepository.save(client);
	}
	
	public Iterable<Client> findAll()
	{
		return clientRepository.findAll();
	}
	
	public Client findById(Long id)
	{
		return clientRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Client client=findById(id);
		clientRepository.delete(client);
	}
}
