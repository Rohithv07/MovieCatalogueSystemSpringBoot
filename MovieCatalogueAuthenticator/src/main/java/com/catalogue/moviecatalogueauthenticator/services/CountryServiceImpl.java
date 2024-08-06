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
	 * Helper method to get all country details.
	 * 
	 * @author rohithvazhathody
	 * @return List&ltCountryDTO&gt
	 */
	@Override
	public List<CountryDTO> getAllCountry() {
		List<CountryDTO> countryDTOList = new ArrayList<>();
		CountryDTO countryDTO;
		List<Country> listOfAllCountries = countryRepository.findAll();
		for (Country country : listOfAllCountries) {
			countryDTO = new CountryDTO();
			countryDTO.setCountryId(country.getCountryId());
			countryDTO.setCountryName(country.getCountryName());
			countryDTOList.add(countryDTO);
		}
		return countryDTOList;
	}

	/**
	 * Helper method to get the country details based on id
	 * 
	 * @param CountryId
	 * @return CountryDTO
	 * @author rohithvazhathody
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

	/**
	 * Helper method to get the country details based country name
	 * 
	 * @param CountryName
	 * @return CountryDTO
	 * @author rohithvazhathody
	 */
	@Override
	public CountryDTO getCountryUsingCountryName(String countryName) {
		CountryDTO countryDTO = new CountryDTO();
		Country country = countryRepository.findCountryByCountryName(countryName);
		if (country != null) {
			countryDTO.setCountryId(country.getCountryId());
			countryDTO.setCountryName(country.getCountryName());
		}
		return countryDTO;
	}

}
