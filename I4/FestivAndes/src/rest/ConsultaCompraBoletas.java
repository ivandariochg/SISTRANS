package rest;

import java.sql.Date;

import javax.xml.ws.Response;

import fachada.Fachada;
import vos.Compania;
import vos.Compra;
import vos.Espectaculo;
import vos.Funcion;
import vos.Localidad;
import vos.Persona;
import vos.Sitio;

@Path("/rest")
public class ConsultaCompraBoletas {
	
	@Context
	private ServletContext context;
	
	private String getPath()
	{
		return context.getRealPath("WEB-INF/ConnectionData");
	}
	
	private String doErrorMessage(Exception e)
	{
		return "{ \"ERROR \":\" "+e.getMessage()+"\"}";
	}
	
	/**
	 * 
	 * @param persona
	 * @return
	 */
	@POST
	@Path("/persona")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultaCompraBol(Persona per, Date fecha, Espectaculo esp,Localidad loc, Funcion fun, Sitio sit) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.consultCompraBoletas(per, fecha, esp, loc, fun, sit);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(per).build();
	}

}
