package br.com.comercio.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//http://localhost:8080/Comercio/rest
@ApplicationPath("rest")
public class ComercioResourceConfig extends ResourceConfig {
	public ComercioResourceConfig(){
		packages("br.com.comercio.service");
	}
}
