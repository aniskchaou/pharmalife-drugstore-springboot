package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Buy;
@RepositoryRestResource
public interface BuyRepository extends JpaRepository<Buy, Long>  {

}
