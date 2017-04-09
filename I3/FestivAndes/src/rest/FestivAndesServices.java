package rest;

import java.sql.Date;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fachada.Fachada;
import tm.VideoAndesMaster;
import vos.Funcion;
import vos.ListaFunciones;
import vos.ListaSitios;
import vos.Persona;
import vos.Sitio;
import vos.Video;

@Path("/rest")
public class FestivAndesServices {

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
	
	
	/**
	 * 
	 * @param compra
	 * @return
	 */
	@PUT
	@Path("/compra")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCompra(Boleta compra) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.addCompra(compra);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(compra).build();
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
	public Response updatePersona(Persona persona) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.updatePreferenciaPersona(persona);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(persona).build();
	}
	
	@POST
	@Path("/funcion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateFuncion(Funcion funcion) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.updateFunctionToPresented(funcion);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(funcion).build();
	}
	
	//-------------------------------------------------------------------------I3
}

