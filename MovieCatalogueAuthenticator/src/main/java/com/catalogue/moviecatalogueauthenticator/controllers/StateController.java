package com.catalogue.moviecatalogueauthenticator.controllers;

import com.catalogue.moviecatalogueauthenticator.dto.ResponseMessage;
import com.catalogue.moviecatalogueauthenticator.services.StateService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author priya prasad
 */
@RestController
public class StateController {

	private StateService stateService;

	public StateController(StateService stateService) {
		this.stateService = stateService;
	}

	@GetMapping("/getAllStates")
	public ResponseMessage getAllState() {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getAllState());
		respMessage.setMessage("SUCCESS");
		respMessage.setStatusCode("200");
		return respMessage;
	}
}
