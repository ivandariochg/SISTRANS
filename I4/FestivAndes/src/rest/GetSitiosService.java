package rest;

import fachada.Fachada;
import vos.ListaSitios;

@Path("/rest")
public class GetSitiosService {
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
	public Response getSitios( ) {
		Fachada tm = new Fachada(getPath());
		ListaSitios sitios;
		try {
			sitios = tm.consultarSitio();
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(sitios).build();
	}
}
