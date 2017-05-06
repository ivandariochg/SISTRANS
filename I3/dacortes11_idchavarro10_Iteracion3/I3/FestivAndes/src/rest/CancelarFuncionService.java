package rest;

import fachada.Fachada;
import vos.Abono;
import vos.Funcion;

@Path("/rest")
public class CancelarFuncionService {

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
	
	@DELETE
	@Path("/boleta")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response cancelarUnaFuncion(Funcion fun, Abono s) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.cancelarUnaFuncion(fun, s);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(fun,s).build();
	}
}
