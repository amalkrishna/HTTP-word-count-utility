 /*
 * JSONService.java
 * 
 * v1.0
 *
 * 20 April 2016
 */

package com.wc.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class JSONService {

 @GET
 @Produces("application/json")
 /**  
  *  Function to call the countWord function and retun JSON as response
  */
 public CountResponse getProductInJSON(@QueryParam("query") String word) {

  /*Fetch the input from ?query param and send to countWord*/
  int c = CountCalculator.countWord(word);	
  CountResponse cr = new CountResponse();
  cr.setCount(c);

  return cr;
 }
}