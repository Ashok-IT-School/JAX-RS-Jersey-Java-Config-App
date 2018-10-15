package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class WelcomeResource {
	
	public WelcomeResource() {
		System.out.println("WelcomeResource::Constructor");
	}

	@GET
	public String wish() {
		return "Welcome to Restfull services..!";
	}

}
