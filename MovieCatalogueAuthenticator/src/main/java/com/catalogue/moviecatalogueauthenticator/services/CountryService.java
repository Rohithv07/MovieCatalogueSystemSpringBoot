/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.services;

import java.util.List;

import com.catalogue.moviecatalogueauthenticator.dto.CountryDTO;

/**
 * @author rohithvazhathody
 *
 */
public interface CountryService {
	public List<CountryDTO> getAllCountry();

	public CountryDTO getCountryUsingId(Long countryId);
	
	public CountryDTO getCountryUsingCountryName(String countryName);
}
