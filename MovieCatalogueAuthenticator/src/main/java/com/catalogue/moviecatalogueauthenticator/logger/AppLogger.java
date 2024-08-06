/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rohithvazhathody
 *
 */
public class AppLogger {
	
	public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }

}
