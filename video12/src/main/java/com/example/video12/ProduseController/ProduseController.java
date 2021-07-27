package com.example.video12.ProduseController;

import java.util.List;

import org.apache.catalina.LifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.video12.clase.Produse;
import com.example.video12.repo.ProduseRepo;
@RestController
@RequestMapping("/produse")
public class ProduseController {

	@Autowired
	private ProduseRepo produseRepo;
	
	
	@GetMapping(path ="/getAll" )
	public List<Produse> getAll(){
	return produseRepo.findAll(Sort.by("nume").descending());	
	}
	
	@GetMapping(path = "getPage/{number}")
	public List<Produse> getProduseByPage(@PathVariable int number){
	return produseRepo.findAll(PageRequest.of(number, 3)).getContent();	
	}
	
	@GetMapping(path = "getByName/{name}")
	public List<Produse> getProduseByName(@PathVariable String name){
		return produseRepo.findProdusesByNume(name);
	}
	
	
}
