package com.catalogue.controllers;

import com.catalogue.dto.ResponseMessage;
import com.catalogue.services.StateService;
import com.catalogue.services.StateServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author priya prasad
 */
@RestController
public class StateController {

    StateService stateService;

    @GetMapping("/getAllStates")
    public ResponseMessage getAllState(){
        ResponseMessage respMessage = new ResponseMessage();
        respMessage.setData(stateService.getAllState());
        respMessage.setMessage("SUCCESS");
        respMessage.setStatusCode("200");
        return  respMessage;
    }
}
