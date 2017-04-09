package vos;

import java.util.ArrayList;

public class Boleta {

	int id;
	
	double costo;
	
	private Silla silla;
	
	private Compra pertence;

	public Boleta(double costo, int id,Silla silla) {
		super();
		this.costo = costo;
		this.id = id;
		this.silla = silla;
		
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Silla getSilla() {
		return silla;
	}
	public void agregarSilla(Silla mSillas) {
		this.silla = silla;;
	}
	public Compra getCompra(){
		return pertence;
	}
	
	public void setPertenece(Compra duenio){
		this.pertence = duenio;
	}
	
	
}
