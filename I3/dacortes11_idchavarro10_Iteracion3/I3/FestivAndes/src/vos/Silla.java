package vos;

import java.util.ArrayList;

public class Silla {

	int id;
	
	int numero;
	
	String fila;
	
	private ArrayList<Localidad> localidades;
	
	private ArrayList<Boleta> compras;

	public Silla(int id, int numero, String fila) {
		super();
		this.id = id;
		this.numero = numero;
		this.fila = fila;
		localidades= new ArrayList<>();
		compras= new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}
	public ArrayList<Localidad> getLocalidades() {
		return localidades;
	}
	public void agregarLocalidades(Localidad mLocalidades) {
		localidades.add(mLocalidades);
	}
	public ArrayList<Boleta> getCompras() {
		return compras;
	}
	public void agregarCompras(Boleta mCompras) {
		compras.add(mCompras);
	}
}
