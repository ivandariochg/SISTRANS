package rest;

import fachada.Fachada;
import vos.Abono;

@Path("/rest")
public class RegistrarAbonoService {

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
	@Path("/abono")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarAbono(Abono compra) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.registrarAbono(compra);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(compra).build();
	}
}
