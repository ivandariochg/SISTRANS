package vos;

import java.util.ArrayList;

public class Categoria {

	int id;
	
	String nombre;
	
	private ArrayList<Espectaculo> espectaculos;

	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		espectaculos= new ArrayList<>();
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
	public ArrayList<Espectaculo> getEspectaculos() {
		return espectaculos;
	}
	public void agregarEspectaculos(Espectaculo mEspectaculos) {
		espectaculos.add(mEspectaculos);
	}
}
