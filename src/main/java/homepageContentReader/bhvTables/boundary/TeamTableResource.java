package homepageContentReader.bhvTables.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import homepageContentReader.bhvTables.control.TeamTableService;
import homepageContentReader.bhvTables.entity.URLObject;

@Stateless
@Path("/tables")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TeamTableResource {

	@Inject
	TeamTableService service;

	@POST
	public Response test(URLObject urlObj) {
		return Response.status(200).entity(service.getTeamEntityByBHVHomepage(urlObj)).build();
	}

}
