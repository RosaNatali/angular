package com.esprit.utils;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("samples")
public class bb
{
	@GET
	public JsonArray samples()
	{
	   return Json.createArrayBuilder().add(sample("smart", "aa")).add(sample("nice", "bb")).build();
	}

   public JsonObject sample(String name, String job)
   {
      return Json.createObjectBuilder().add("name", name).add("job", job).build();
   }
}










