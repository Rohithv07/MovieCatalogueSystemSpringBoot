package com.catalogue.services;

import com.catalogue.dto.StateDTO;

import java.util.List;

/**
 * @author priya prasad
 */
public interface StateService {

    public List<StateDTO> getAllState();

    public StateDTO getStateById(Long id);

    public  List<StateDTO> getStateByCountryId(Long id);
}
