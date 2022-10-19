package br.com.comercio.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/Comercio/rest/comercio
@Path("comercio")
public class ComercioService {
	@GET
	public String exibir(){
		return "Cursos de Hugo Vasconcelos";
	}
}
