package rest;

import fachada.Fachada;
import vos.Abono;

@Path("/rest")
public class DevolverAbonoService {

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
	
	@POST
	@Path("/abono")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response devolverAbono(Abono abono) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.devolverAbono(abono);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(funcion).build();
	}
}
