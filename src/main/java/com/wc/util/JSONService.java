package com.wc.util;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;

@Path("/")
public class JSONService {

	@GET
	@Produces("application/json")
	public CountResponse getProductInJSON(@QueryParam("query") String word) {
		
		int c = CountCalculator.countWord(word);
		CountResponse cr = new CountResponse();
		cr.setCount(c);
		
		return cr;
	}
	
}