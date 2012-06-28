package com.photon.phresco.eshop.rest;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;

import com.photon.phresco.eshop.utils.Utility;

/**
 * Cofiguration Service hosted at the URI path "/config"
 */
@Path("/config")
public class ConfigResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getConfig(@HeaderParam("user-agent") String userAgent, @QueryParam("callback") String callback) {
		String jsonString = "";
		try {
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("json/app-config.json");
			jsonString = IOUtils.toString(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Utility.getJSONP(callback, jsonString);
    }

}