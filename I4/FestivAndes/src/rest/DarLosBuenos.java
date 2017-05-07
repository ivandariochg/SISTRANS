package rest;

import java.util.ArrayList;

import fachada.Fachada;
import vos.Persona;

@Path("/rest")
public class DarLosBuenos {
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
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response darLosBuenos( ) {
		Fachada tm = new Fachada(getPath());
		ArrayList<Persona> personas;
		try {
			personas = tm.consultarLosBuenosClientes();
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(personas).build();
	}
}
