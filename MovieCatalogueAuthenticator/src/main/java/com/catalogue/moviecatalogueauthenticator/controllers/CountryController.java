/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.controllers;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogue.moviecatalogueauthenticator.dto.ResponseMessage;
import com.catalogue.moviecatalogueauthenticator.logger.AppLogger;
import com.catalogue.moviecatalogueauthenticator.services.CountryService;

/**
 * @author rohithvazhathody
 *
 */

@RestController
@RequestMapping("/countries")
public class CountryController {

	private CountryService countryService;
	private static final Logger logger = AppLogger.getLogger(CountryController.class);

	/**
	 * 
	 */
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@GetMapping("/")
	public String strinMessage() {
		return "String";
	}

	@GetMapping("/getAllCountries")
	public ResponseMessage getAllCountry() {
		ResponseMessage responseMessage = new ResponseMessage();
		logger.info("Calling CountryService class");
		responseMessage.setData(countryService.getAllCountry());
		responseMessage.setMessage("SUCCESS");
		responseMessage.setStatusCode("200");
		logger.info("Returning the response message");
		return responseMessage;
	}

}
