/**
 * 
 */
package com.catalogue.services;

import java.util.List;

import com.catalogue.dto.CountryDTO;

/**
 * @author rohithvazhathody
 *
 */
public interface CountryService {
	public List<CountryDTO> getAllCountry();

	public CountryDTO getCountryUsingId(Long countryId);
}
