package rest;

import fachada.Fachada;
import vos.Compra;

@Path("/rest")
public class RegistrarCompra {
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
	 * @param compra
	 * @return
	 */
	@PUT
	@Path("/compra")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCompra(Compra compra) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.addCompra(compra);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(compra).build();
	}
}
