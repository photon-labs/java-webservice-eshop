package com.photon.phresco.eshop.commons.exception;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

public class ExceptionUtil extends Properties implements Serializable {

	private static final long serialVersionUID = -2332668528188192185L;
	private static final String file = "files/error-messages.properties";
	private static ExceptionUtil exceptionUtil;

	public static ExceptionUtil getInstance() {
		if (exceptionUtil == null) {
			exceptionUtil = new ExceptionUtil();
		}
		
		return exceptionUtil;
	}

    public ExceptionUtil() {
        InputStream is = getClass().getClassLoader().getResourceAsStream(file);
        try {
            load(is);
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    public Object put(Object key, Object value) {
        return super.put(key, value);
    }

    public String getMessage(String key) {
        return super.getProperty(key);
    }
    
}
