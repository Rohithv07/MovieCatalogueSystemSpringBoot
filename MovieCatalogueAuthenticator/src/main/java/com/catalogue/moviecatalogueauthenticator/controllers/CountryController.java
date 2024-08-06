/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catalogue.moviecatalogueauthenticator.constants.MovieCatalogConstants;
import com.catalogue.moviecatalogueauthenticator.dto.CountryDTO;
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

	@GetMapping("/getAllCountries")
	public ResponseEntity<ResponseMessage> getAllCountry() {
		ResponseMessage responseMessage = new ResponseMessage();
		logger.info("Calling getAllCountries endpoint");
		List<CountryDTO> allCountryDetails = countryService.getAllCountry();
		responseMessage.setData(allCountryDetails);
		responseMessage.setMessage(MovieCatalogConstants.SUCCESS_MESSAGE);
		responseMessage.setStatusCode((HttpStatus.OK.value()));
		logger.info("Returning the response message for getAllCountries endpoint");
		return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
	}

	@GetMapping("/getCountryById")
	public ResponseEntity<ResponseMessage> getCountryById(Long countryId) {
		ResponseMessage responseMessage = new ResponseMessage();
		logger.info("Finding country using country id : {}", countryId);
		CountryDTO countryDTO = countryService.getCountryUsingId(countryId);
		responseMessage.setData(countryDTO);
		responseMessage.setMessage(MovieCatalogConstants.SUCCESS_MESSAGE);
		responseMessage.setStatusCode(HttpStatus.OK.value());
		logger.info("Returning the response message for country by id endpoint");
		return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
	}

	@GetMapping("/getCountryByName")
	public ResponseEntity<ResponseMessage> getCountryByCountryName(@RequestParam String countryName) {
		ResponseMessage responseMessage = new ResponseMessage();
		logger.info("Finding country using country id : {}", countryName);
		CountryDTO countryDTO = countryService.getCountryUsingCountryName(countryName);
		responseMessage.setData(countryDTO);
		responseMessage.setMessage(MovieCatalogConstants.SUCCESS_MESSAGE);
		responseMessage.setStatusCode(HttpStatus.OK.value());
		logger.info("Returning the response message for country by id endpoint");
		return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
	}

}
