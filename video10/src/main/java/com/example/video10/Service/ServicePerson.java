package com.example.video10.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.video10.Repo.RepoPerson;
import com.example.video10.clase.Person;
import com.example.video10.clase.SimplePerson;


@Service
public class ServicePerson {

	@Autowired
	private RepoPerson repoPerson;
	
	
	public List<Person> getall() {
		return repoPerson.getAll();
		
	}


	public void addOne(Person p) {
		repoPerson.addOne(p);
		
	}


	public void updateOne(int id, SimplePerson p) {
		repoPerson.updateOne(id,p);
		
	}
	
	
	public void deleteOne(int id) {
		repoPerson.deleteOne(id);
	}

}
