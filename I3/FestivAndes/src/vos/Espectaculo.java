package vos;

import java.util.ArrayList;

public class Espectaculo {

	String nombre;
	
	int duration;
	
	String lenguaje;
	
	int costoProduccion;
	
	String publico;
	
	String descripcion;
	
	boolean traduccion;
	
	int id;
	
	ArrayList categorias;
	
	int asistenciaTotal=0;
	
	int asistenciaRegistrados=0;
	
	private ArrayList<Compania> companias;
	
	private ArrayList<Funcion> funciones;

	public Espectaculo(String nombre, int duration, String lenguaje, int costoProduccion, String publico,
			String descripcion, int id, boolean traduccion) {
		super();
		this.nombre = nombre;
		this.duration = duration;
		this.lenguaje = lenguaje;
		this.costoProduccion = costoProduccion;
		this.publico = publico;
		this.descripcion = descripcion;
		this.id = id;
		companias= new ArrayList<>();
		funciones= new ArrayList<>();
		this.traduccion = traduccion;
		this.categorias = new <Categoria> ArrayList();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public int getCostoProduccion() {
		return costoProduccion;
	}

	public void setCostoProduccion(int costoProduccion) {
		this.costoProduccion = costoProduccion;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	public ArrayList getCategorias() {
		return categorias;
	}
	
	public void agregarCategoria(Categoria cat){
		categorias.add(cat);
	}

	public boolean isTraduccion() {
		return traduccion;
	}

	public void setTraduccion(boolean traduccion) {
		this.traduccion = traduccion;
	}
    public ArrayList<Funcion> getFunciones()
    {
    	return funciones;
    }
    public void agregarFunciones(Funcion mFuncion)
    {
    	funciones.add(mFuncion);
    }
    
    public int darAsistenciaTotal()
    {
    	return asistenciaTotal;
    }
    
    public int darAsistenciaRegistrados()
    {
    	return asistenciaRegistrados;
    }
    
    
	
}
