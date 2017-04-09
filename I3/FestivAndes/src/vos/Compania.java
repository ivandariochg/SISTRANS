package vos;

import java.util.ArrayList;

public class Compania {
	
	String nombre;
	
	Persona representante;
	
	String pais;
	
	String web;
	
    int id;
    
    private ArrayList<Espectaculo> espectaculos;

	public Compania(String nombre, Persona representante, String pais, String web, int id) 
	{
		super();
		this.nombre = nombre;
		this.representante = representante;
		this.pais = pais;
		this.web = web;
		this.id = id;
		espectaculos= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getRepresentante() {
		return representante;
	}

	public void setRepresentante(Persona representante) {
		this.representante = representante;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Espectaculo> getEspectaculos() {
		return espectaculos;
	}
	public void agregarEspectaculos(Espectaculo mEspectaculos) {
		espectaculos.add(mEspectaculos);
	}
    
    
}
