package main.java.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Sample")
public interface ServiceClass {
	
	@GET
	@Path("/getDialogue")
	@Produces("application/json")
	public String getData(@PathParam("id") int id);
	
	@GET
	@Path("/getData/{id}")
	@Produces("application/json")
	public String getDataWithoutDB(@PathParam("id") int id);
	
	
}
