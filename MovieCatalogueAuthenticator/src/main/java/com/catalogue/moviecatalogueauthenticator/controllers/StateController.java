package com.catalogue.moviecatalogueauthenticator.controllers;

import com.catalogue.moviecatalogueauthenticator.dto.ResponseMessage;
import com.catalogue.moviecatalogueauthenticator.services.StateService;

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
	public ResponseMessage getAllState() {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getAllState());
		respMessage.setMessage("SUCCESS");
		respMessage.setStatusCode("200");
		return respMessage;
	}

	@GetMapping("/getStateById")
	public ResponseMessage getStateById(@RequestParam("countryId") Long stateId) {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getStateById(stateId));
		respMessage.setMessage("SUCCESS");
		respMessage.setStatusCode("200");
		return respMessage;
	}

	@GetMapping("/getStateByCountryId")
	public ResponseMessage getStateByCountryId(@RequestParam("countryId") Long countryId) {
		ResponseMessage respMessage = new ResponseMessage();
		respMessage.setData(stateService.getStateByCountryId(countryId));
		respMessage.setMessage("SUCCESS");
		respMessage.setStatusCode("200");
		return respMessage;
	}
}
