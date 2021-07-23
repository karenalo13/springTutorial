package com.example.demo.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Persoanee.Persoana;
@RestController
public class Clase {

	@GetMapping(path="/salut")
	public String salut() {
		return "salut";
	}
	@GetMapping(path="/salut/{name}")
	public String salut(@PathVariable("name") String name) {
		return "salut, "+name+"!";
	}
	
	@PostMapping(path="/salut")
	public String salutt(@RequestBody Persoana p) {
	return "Salut"+p.toString();
	
	}
	@GetMapping(path="/getOne")
	public Persoana getOne() {
		Persoana persoana= new Persoana();
		persoana.nume="Nume frumos";
		persoana.varsta=70;
		return persoana;
	}
	
	@GetMapping(path="/getAll")
	public List<Persoana> getAll() {
		Persoana persoana= new Persoana();
		persoana.nume="Nume frumos";
		persoana.varsta=70;
		Persoana persoana2= new Persoana();
		persoana2.nume="Nume frumos 2";
		persoana2.varsta=71;
		
		List<Persoana> lista = new ArrayList();;
		lista.add(persoana);
		lista.add(persoana2);
		return lista;
	}
}
