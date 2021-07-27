package com.example.video12Partea2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.video12Partea2.Repositories.ProduseRepository;
import com.example.video12Partea2.clase.Produse;

@RestController
@RequestMapping("/produse")
public class ProduseController {

	
	@Autowired
	private ProduseRepository produseRepository;
	
	@GetMapping(path = "/getAll")
	public Iterable<Produse> getAll(){
		return produseRepository.findAll();
	}
	
	@GetMapping(path = "/getByName/{nume}")
	public List<Produse> getProduseByName(@PathVariable String nume){
		return produseRepository.findAllProduseByName(nume);
	}


}
