package rest;

import fachada.Fachada;
import vos.Persona;

@Path("/rest")
public class UpdatePersonaServices {

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
	public Response updatePersona(Persona persona) {
		Fachada tm = new Fachada(getPath());
		try {
			tm.updatePreferenciaPersona(persona);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(persona).build();
	}
}
