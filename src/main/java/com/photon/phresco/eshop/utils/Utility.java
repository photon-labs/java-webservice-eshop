package com.photon.phresco.eshop.utils;

import com.photon.phresco.eshop.models.rest.OutputResponse;

public class Utility {

	public static OutputResponse getOutputMessage(String type, String message) {
		return new OutputResponse(type, message);
	}
}
