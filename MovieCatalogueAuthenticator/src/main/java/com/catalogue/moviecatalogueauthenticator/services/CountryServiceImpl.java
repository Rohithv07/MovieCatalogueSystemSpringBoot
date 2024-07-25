/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.catalogue.moviecatalogueauthenticator.dto.CountryDTO;
import com.catalogue.moviecatalogueauthenticator.entity.Country;
import com.catalogue.moviecatalogueauthenticator.repositories.CountryRepository;

/**
 * @author rohithvazhathody
 *
 */
@Service
public class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;

	/**
	 * 
	 */
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	/**
	 * 
	 */
	@Override
	public List<CountryDTO> getAllCountry() {
		List<CountryDTO> countryDTOList = new ArrayList<>();
		CountryDTO countryDTO = new CountryDTO();
		List<Country> listOfAllCountries = countryRepository.findAll();
		for (Country country : listOfAllCountries) {
			countryDTO.setCountryId(country.getCountryId());
			countryDTO.setCountryName(country.getCountryName());
			countryDTOList.add(countryDTO);
		}
		return countryDTOList;
	}

	/**
	 * 
	 */
	@Override
	public CountryDTO getCountryUsingId(Long countryId) {
		CountryDTO countryDTO = new CountryDTO();
		Optional<Country> countryById = countryRepository.findById(countryId);
		if (countryById.isPresent()) {
			countryDTO.setCountryId(countryById.get().getCountryId());
			countryDTO.setCountryName(countryById.get().getCountryName());
		}
		return countryDTO;
	}

}
