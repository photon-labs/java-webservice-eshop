/**
 * PHR_JavaWebService
 *
 * Copyright (C) 1999-2014 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
