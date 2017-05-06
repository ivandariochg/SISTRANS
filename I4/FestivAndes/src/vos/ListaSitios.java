package vos;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ListaSitios 
{

	@JsonProperty(value="Sitios")
	private List<Sitio> sitios;
	
	public ListaSitios(@JsonProperty(value="Sitios")List<Sitio> sitios) {
		
		// TODO Auto-generated constructor stub
			this.sitios=sitios;
	}
	
//setters y getters
	public List<Sitio> getSitios() {
		return sitios;
	}

	public void setSitios(List<Sitio> sitios) {
		this.sitios = sitios;
	}
}
