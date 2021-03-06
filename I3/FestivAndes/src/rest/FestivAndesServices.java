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
import vos.Abono;
import vos.Compra;
import vos.Funcion;
import vos.ListaFunciones;
import vos.ListaSitios;
import vos.Persona;
import vos.Recibo;
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
	public Response addCompra(Compra compra) {
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
	
	@POST
	@Path("/boleta")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response devolverBoleta(Compra boleta) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.devolverBoleta(boleta);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(funcion).build();
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

