package com.catalogue.moviecatalogueauthenticator.controllers;

import com.catalogue.moviecatalogueauthenticator.constants.MovieCatalogConstants;
import com.catalogue.moviecatalogueauthenticator.dto.ResponseMessage;
import com.catalogue.moviecatalogueauthenticator.services.StateService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author priya prasad
 */
@RestController
@RequestMapping("/states")
public class StateController {

	private StateService stateService;

	public StateController(StateService stateService) {
		this.stateService = stateService;
	}

	@GetMapping("/getAllStates")
	public ResponseEntity<ResponseMessage> getAllState() {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getAllState());
		respMessage.setMessage(MovieCatalogConstants.SUCCESS_MESSAGE);
		respMessage.setStatusCode(HttpStatus.OK.value());
		return ResponseEntity.status(HttpStatus.OK).body(respMessage);
	}

	@GetMapping("/getStateById")
	public ResponseEntity<ResponseMessage> getStateById(@RequestParam("stateId") Long stateId) {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getStateById(stateId));
		respMessage.setMessage(MovieCatalogConstants.SUCCESS_MESSAGE);
		respMessage.setStatusCode(HttpStatus.OK.value());
		return ResponseEntity.status(HttpStatus.OK).body(respMessage);
	}

	@GetMapping("/getStateByCountryId")
	public ResponseEntity<ResponseMessage> getStateByCountryId(@RequestParam("countryId") Long countryId) {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getStateByCountryId(countryId));
		respMessage.setMessage(MovieCatalogConstants.SUCCESS_MESSAGE);
		respMessage.setStatusCode(HttpStatus.OK.value());
		return ResponseEntity.status(HttpStatus.OK).body(respMessage);
	}
}
