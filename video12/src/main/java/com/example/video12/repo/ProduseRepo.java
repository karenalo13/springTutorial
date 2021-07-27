package com.example.video12.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import com.example.video12.clase.Produse;

public interface ProduseRepo extends JpaRepository<Produse,Integer> {

	
	
	List<Produse> findProdusesByNume( String name);
}
