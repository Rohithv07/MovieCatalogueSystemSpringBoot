/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.catalogue.moviecatalogueauthenticator.dto.CountryDTO;
import com.catalogue.moviecatalogueauthenticator.services.CountryService;

/**
 * @author rohithvazhathody
 *
 */
@SpringBootTest
class CountryServiceImplTest {

	@Autowired
	private CountryService countryService;

	/**
	 * Test method for
	 * {@link com.catalogue.moviecatalogueauthenticator.services.CountryServiceImpl#getAllCountry()}.
	 */
	@Test
	void testGetAllCountrySizeGreaterThanZero() {
		List<CountryDTO> allCountry = countryService.getAllCountry();
		assertTrue(allCountry.size() > 0);
	}

	@Test
	void testGetCoutryByIdSuccess() {
		CountryDTO countryUsingId = countryService.getCountryUsingId(2L);
		assertEquals(2L, countryUsingId.getCountryId().longValue());
	}

	@Test
	void testGetCountryByIdNotFound() {
		CountryDTO countryDTO = countryService.getCountryUsingId(-1L);
		assertNotEquals(-1L, countryDTO.getCountryId());
	}

	@Test
	void testGetCountryByCountryNameSuccess() {
		CountryDTO countryDTO = countryService.getCountryUsingCountryName("India");
		assertEquals("India", countryDTO.getCountryName());
	}

	@Test
	void testGetCountryByCountryNameFailure() {
		CountryDTO countryDTO = countryService.getCountryUsingCountryName("Chicago");
		assertNotEquals("India", countryDTO.getCountryName());
	}
}
