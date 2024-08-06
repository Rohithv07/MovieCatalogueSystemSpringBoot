/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author rohithvazhathody
 *
 */
@ControllerAdvice
public class MovieCatalogExceptionHandler {

	@ExceptionHandler(value = { IllegalArgumentException.class })
	public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException illegalArgumentException) {
		return new ResponseEntity<>("This is an invalid input. Please check " + illegalArgumentException.getMessage(),
				HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { NullPointerException.class })
	public ResponseEntity<Object> handleNullPointerException(NullPointerException nullPointerException) {
		return new ResponseEntity<>(
				"The resource you asked for is not found. Please check the resource or create a new one "
						+ nullPointerException.getMessage(),
				HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleGenericException(Exception exception) {
		return new ResponseEntity<>("Something bad have happened. Please try again " + exception.getMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
