/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.app;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author kawabata
 */
@Path("/fruit")
public class MyResource {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruits> get() {
        System.out.println("GET");

        return Database.getAll();
    }

    @GET
    @Path("{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Fruits get(@PathParam("name") String payload) {
        System.out.println("GET");
        return Database.get(payload);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void post(Fruits payload) {
        System.out.println("POST");
        Database.add(payload);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void put(Fruits payload) {
        System.out.println("PUT");
        Database.add(payload);
    }

    @DELETE
    @Path("{name}")
    public void delete(@PathParam("name") String payload) {
        System.out.println("DELETE");
        Database.delete(payload);
    }
}
