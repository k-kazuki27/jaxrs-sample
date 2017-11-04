/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author kawabata
 */
@javax.ws.rs.ApplicationPath("v1")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        this.packages(ApplicationConfig.class.getPackage().getName());
        this.packages("com.snail.waf21.rest")
                //Jacson用のクラスを登録
                .register((new JacksonJaxbJsonProvider(new ObjectMapper(),
                        JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS)))
                //JSONP用のクラスを登録
                .register(org.glassfish.jersey.jackson.JacksonFeature.class);
    }

}
