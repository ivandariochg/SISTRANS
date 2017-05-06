package vos;

import java.util.ArrayList;

public class Compra {

	int id;
	
	double costo;
	
	private Silla silla;
	
	private Recibo pertence;

	public Compra(double costo, int id,Silla silla) {
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
	public Recibo getDuenio(){
		return pertence;
	}
	
	public void setPertenece(Recibo duenio){
		this.pertence = duenio;
	}
	
	
}
