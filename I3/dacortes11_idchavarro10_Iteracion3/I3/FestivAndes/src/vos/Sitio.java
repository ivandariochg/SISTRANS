package vos;

import java.util.ArrayList;

public class Sitio {

	String nombre;
	
	int id;
	
	int abierto;
	
	String tipo;
	
	int capacidad;
	
	int apto;
	
	String silleteria;
	
	int proteccion;
	
	private ArrayList<Funcion> funciones;
	//	private Funcion funciones;
	
	private ArrayList<Condicion> condiciones;
	//	private Condicion condiciones;
	
	private ArrayList<Localidad> localidades;
	//private Localidad localidades;

	public Sitio(int abierto, String tipo, int capacidad, int apto, String silleteria, int proteccion, int id, String nombre) {
		super();
		this.abierto = abierto;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.apto = apto;
		this.silleteria = silleteria;
		this.proteccion = proteccion;
		this.id = id;
		this.nombre = nombre;
		funciones= new ArrayList<>();
		condiciones= new ArrayList<>();
		localidades= new ArrayList<>();
		
	}

	public int isAbierto() {
		return abierto;
	}

	public void setAbierto(int abierto) {
		this.abierto = abierto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int isApto() {
		return apto;
	}

	public void setApto(int apto) {
		this.apto = apto;
	}

	public String getSilleteria() {
		return silleteria;
	}

	public void setSilleteria(String silleteria) {
		this.silleteria = silleteria;
	}

	public int  isProteccion() {
		return proteccion;
	}

	public void setProteccion(int proteccion) {
		this.proteccion = proteccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}
	public void agregarFunciones(Funcion mFunciones) {
		funciones.add(mFunciones);
		}
	public ArrayList<Condicion> getCondiciones() {
		return condiciones;
	}
	public void agregarCondiciones(Condicion mCondiciones) {
		condiciones.add(mCondiciones);
	}
	public ArrayList<Localidad> getLocalidades() {
		return localidades;
	}
	public void agregarLocalidades(Localidad mLocalidades) {
		localidades.add(mLocalidades);
	}
}
