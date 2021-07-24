package com.example.video10.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.video10.Service.ServicePerson;
import com.example.video10.clase.Person;
import com.example.video10.clase.SimplePerson;

@RestController
@RequestMapping(path = "/person")
public class PersonController {
	
	
	@Autowired
	private ServicePerson servicePerson;

	@GetMapping(path = "/getall")
	public List<Person> getall() {
		return servicePerson.getall();
	}
	
	@PostMapping(path="/addOne")
	public void addOne(@RequestBody Person p)
	{
		servicePerson.addOne(p);
	}
	
	@PutMapping(path = "/update/{id}")
	public void updateOne(@RequestBody SimplePerson p,@PathVariable int id) {
		servicePerson.updateOne(id,p);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteOne(@PathVariable int id) {
		servicePerson.deleteOne(id);
	}
	
}
