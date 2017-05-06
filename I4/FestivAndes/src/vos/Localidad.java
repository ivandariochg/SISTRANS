package vos;

import java.util.ArrayList;

public class Localidad {

	 int id;
	 
	 String nombre;
	 
	 double precio;
	 
	 int capacidad;
	 
	 private ArrayList<Localidad> localidades;
	 
	 private ArrayList<Silla> sillas;

	public Localidad(int id, String nombre, double precio, int capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.capacidad = capacidad;
		localidades= new ArrayList<>();
		sillas= new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public ArrayList<Localidad> getLocalidades() {
		return localidades;
	}
	public void agregarLocalidades(Localidad mLocalidades) {
		localidades.add(mLocalidades);
	}
	public ArrayList<Silla> getSillas() {
		return sillas;
	}
	public void setSillas(Silla mSillas) {
		sillas.add(mSillas);
	}
}
