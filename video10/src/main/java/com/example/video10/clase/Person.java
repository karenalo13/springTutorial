package com.example.video10.clase;

public class Person {

	
	private int id;
	private String nume;
	private double salariu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public double getSalariu() {
		return salariu;
	}
	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", nume=" + nume + ", salariu=" + salariu + "]";
	}
	
	
}
