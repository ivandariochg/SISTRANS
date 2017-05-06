package vos;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ListaFunciones {

	
	private List<Funcion> funciones;
	
	public ListaFunciones(@JsonProperty(value="funciones")List<Funcion> funciones) {
		// TODO Auto-generated constructor stub
		this.funciones=funciones;
	}
	
//setters y getters
	
	public List<Funcion> getFunciones() {
		return funciones;
	}
	
	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}
}
