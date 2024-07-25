package com.catalogue.moviecatalogueauthenticator.services;

import java.util.List;

import com.catalogue.moviecatalogueauthenticator.dto.StateDTO;

/**
 * @author priya prasad
 */
public interface StateService {

    public List<StateDTO> getAllState();

    public StateDTO getStateById(Long id);

    public  List<StateDTO> getStateByCountryId(Long id);
}
