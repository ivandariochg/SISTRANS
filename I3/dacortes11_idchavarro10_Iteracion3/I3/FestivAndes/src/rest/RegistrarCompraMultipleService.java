package rest;

import fachada.Fachada;
import vos.Recibo;

@Path("/rest")
public class RegistrarCompraMultipleService {

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
	
	@PUT
	@Path("/multiples")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarCompraMultiple(Recibo multbol) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.registrarCompraMultiple(multbol);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(multbol).build();
	}
}
