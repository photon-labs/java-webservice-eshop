package com.photon.phresco.eshop.rest;

import java.io.IOException;
import java.io.InputStream;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.commons.io.IOUtils;

/**
 * Cofiguration Service hosted at the URI path "/config"
 */
@Path("/config")
public class ConfigResource {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public String getConfig(@HeaderParam("user-agent") String userAgent) {
        String jsonString = "";
        try {
            System.out.println("user-agent is : " + userAgent);
            InputStream is = this.getClass().getClassLoader()
                    .getResourceAsStream("json/app-config.json");
            System.out.println("Input Stream = " + is);
            jsonString = IOUtils.toString(is);
        } catch (IOException e) {
        	System.out.println("**************************");
            e.printStackTrace();
            System.out.println("**************************");
        }

        return jsonString;
    }

}