package vos;

import java.util.ArrayList;

public class Compra {

	int id;
	
	Persona duenio;
	
	ArrayList<Boleta> boletas;

	public ArrayList<Boleta> getBoletas() {
		return boletas;
	}

	public void setBoletas(ArrayList<Boleta> boletas) {
		this.boletas = boletas;
	}

	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	
	
}
