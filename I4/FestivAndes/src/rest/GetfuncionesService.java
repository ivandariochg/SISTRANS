package rest;

import java.sql.Date;

import fachada.Fachada;
import vos.ListaFunciones;

@Path("/rest")
public class GetfuncionesService 
{

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
	public Response getFunciones(Date fechaFuncion, String compania, String categoria, String lenguaje, boolean disponibilidadTraduccion ) {
		Fachada tm = new Fachada(getPath());
		ListaFunciones funciones;
		try {
			funciones = tm.consultaFuncionesDeEspectaculosProgramados(fechaFuncion, compania, categoria, lenguaje, disponibilidadTraduccion);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(funciones).build();
	}
	
	
	
}
