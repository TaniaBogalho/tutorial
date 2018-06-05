package com.exemplo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import com.exemplo.Track;
import com.exemplo.CalculoSoma;

//@Path("/json/metallica")
@Path("/json/")
public class JSONService {

	/*@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}*/
	
	@GET
	@Path("/soma/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public CalculoSoma getSomaInJSON(@PathParam("num1") int num1, @PathParam("num2") int num2) 
	{		
		CalculoSoma soma = new CalculoSoma();
		soma.setNum1(num1);
		soma.setNum2(num2);

		soma.calcula();
		
		return soma;
	}
	
}
