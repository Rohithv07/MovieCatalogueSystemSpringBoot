package com.catalogue.moviecatalogueauthenticator.services;

import com.catalogue.moviecatalogueauthenticator.dto.StateDTO;
import com.catalogue.moviecatalogueauthenticator.entity.State;
import com.catalogue.moviecatalogueauthenticator.repositories.StateRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * @author priya prasad
 */
@Service
public class StateServiceImpl implements StateService {

	private StateRepository repository;

	public StateServiceImpl(StateRepository stateRepository) {
		this.repository = stateRepository;
	}

	/**
	 * @return
	 */
	@Override
	public List<StateDTO> getAllState() {
		List<State> stateList = new ArrayList<>();
		List<StateDTO> stateDTOS = new ArrayList<>();
		stateList = repository.findAll();
		return getStateDTOS(stateDTOS, stateList);
	}

	/**
	 * @param stateId
	 * @return
	 */
	@Override
	public StateDTO getStateById(Long stateId) {
		StateDTO stateDTO = new StateDTO();
		Optional<State> state = repository.findById(stateId);
		if (state.isPresent()) {
			stateDTO.setStateId(state.get().getStateId());
			stateDTO.setStateName(state.get().getStateName());
			stateDTO.setCountry(state.get().getCountry().getCountryName());
		}
		return stateDTO;
	}

	/**
	 * @param countryId
	 * @return
	 */

	@Override
	public List<StateDTO> getStateByCountryId(Long countryId) {
		List<StateDTO> stateDTOList = new ArrayList<>();
		List<State> states = repository.findByCountryCountryId(countryId);
		return getStateDTOS(stateDTOList, states);
	}

	private List<StateDTO> getStateDTOS(List<StateDTO> stateDTOList, List<State> states) {
		for (State state : states) {
			StateDTO stateDTO = new StateDTO();
			stateDTO.setStateId(state.getStateId());
			stateDTO.setStateName(state.getStateName());
			stateDTO.setCountry(state.getCountry().getCountryName());
			stateDTOList.add(stateDTO);
		}
		return stateDTOList;
	}

}
