package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greet")
public class GreetResource {

	public GreetResource() {
		System.out.println("GreetResource::Constructor");
	}

	@GET
	public String greet() {
		return "Good Morning...";
	}

}
