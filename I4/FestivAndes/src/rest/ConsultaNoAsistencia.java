package rest;

import javax.xml.ws.Response;

import fachada.Fachada;
import vos.Compania;
import vos.Compra;
import vos.Funcion;
import vos.Persona;

@Path("/rest")
public class ConsultaNoAsistencia {

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
	public Response consultaNoAsisFest(Persona per, Funcion fun, Compania com, Compra compr) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.consultAsistenciaVersion2(per, fun, com, compr);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(per).build();
	}
}
