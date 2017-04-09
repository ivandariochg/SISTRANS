package vos;

import java.util.ArrayList;

public class Condicion {

	int id;
	
	String nombre;
	
    private ArrayList<Sitio> sitios; 

	public Condicion(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		sitios= new ArrayList<>();
		
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
	public ArrayList<Sitio> getSitios() {
		return sitios;
	}
	public void agregarSitios(Sitio mSitios) {
		sitios.add(mSitios);
	}
	
}
