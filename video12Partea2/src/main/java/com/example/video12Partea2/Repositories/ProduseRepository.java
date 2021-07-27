package com.example.video12Partea2.Repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.video12Partea2.clase.Produse;

public interface ProduseRepository extends CrudRepository<Produse, Integer> {

	
	@Query("select * from produse where nume=:nume")
	List<Produse> findAllProduseByName(String nume);
}
