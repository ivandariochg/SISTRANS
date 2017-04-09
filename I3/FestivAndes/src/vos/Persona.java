package vos;

import java.util.ArrayList;

public class Persona {

	int id;
	String nombre;
	int tipo;
	int edad;
	int preferencia;
	ArrayList compras;
	
	public Persona(int id, String nombre, int tipo, int edad, int preferencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.compras= new <Boleta> ArrayList();
		this.preferencia = preferencia;
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList getCompras() {
		return compras;
	}
	public void agregarCompra(Boleta compra) {
		compras.add(compra);
	}
	
	public int getPreferencia(){
		return preferencia;
	}
	
	public void setPreferencia(){
		this.preferencia = preferencia;
	}
}
