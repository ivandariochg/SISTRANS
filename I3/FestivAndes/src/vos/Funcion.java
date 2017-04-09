package vos;
import java.util.ArrayList;
import java.util.Date;

public class Funcion {

	int id;
	
	Date fecha;
	
	int hora;
	
	int presentada;
	
	private ArrayList<Espectaculo> espectaculos;
	//private Espectaculo espectaulos;
	
	private Sitio sitio;
	//private Sitio sitios;

	public Funcion(Date fecha, int hora, int id) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.id = id;
		espectaculos= new ArrayList<>();
		presentada = 0;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	public ArrayList<Espectaculo> getEspectaulos() {
		return espectaculos;
	}
	public void setEspectaulos(Espectaculo mEspectaulos) {
		espectaculos.add(mEspectaulos);
	}
	
	public Sitio getSitio() {
		return sitio;
	}
	public void agregarSitios(Sitio mSitios) {
		this.sitio = sitio;
	}
	
	public void changePresentada(){
		presentada = 1;
	}
	
}
