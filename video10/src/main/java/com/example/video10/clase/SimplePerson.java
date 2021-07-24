package com.example.video10.clase;

public class SimplePerson {

	
	private String nume;
	private int salariu;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	@Override
	public String toString() {
		return "SimplePerson [nume=" + nume + ", salariu=" + salariu + "]";
	}
	
	
}
