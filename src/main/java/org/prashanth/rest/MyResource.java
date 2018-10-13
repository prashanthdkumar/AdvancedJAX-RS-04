package org.prashanth.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
/*@Singleton Note:Singleton resources are instantiated during application startup.
 * So, you cannot inject request-specific information to their member variables;
 * instead we can have it as the method arguments
*/
public class MyResource {
	
	@PathParam("pathParam") private String pathParamEx;
	@QueryParam("query") private String queryParamEx;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works! Path param used " + pathParamEx
				+ " Query Param used " + queryParamEx;
	}

}
