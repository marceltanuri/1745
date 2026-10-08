package br.com.ada.conversor.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class OlaMundoResource {

    @GET
    @Path("/world")
    public String olaMundo() {
        return "Olá Mundo";
    }

}