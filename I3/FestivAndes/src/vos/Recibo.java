package vos;

import java.util.ArrayList;

public class Recibo {

	int id;
	
	Persona duenio;
	
	ArrayList<Compra> boletas;

	public ArrayList<Compra> getBoletas() {
		return boletas;
	}

	public void setBoletas(ArrayList<Compra> boletas) {
		this.boletas = boletas;
	}

	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	
	
}
