package com.photon.phresco.eshop.utils;

import org.apache.commons.lang.StringUtils;

import com.photon.phresco.eshop.models.rest.OutputResponse;

public class Utility {

	public static OutputResponse getOutputMessage(String type, String message) {
		return new OutputResponse(type, message);
	}
	
	public static String getJSONP(String callback, String json) {
		if (StringUtils.isNotEmpty(callback)) {
			String jsonp = callback + "(" + json + ")";
			return jsonp;
		} else {
			return json;
		}
	}
}
