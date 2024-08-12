package com.catalogue.moviecatalogueauthenticator.services;

import com.catalogue.moviecatalogueauthenticator.dto.AddressDTO;

/**
 * @author priya prasad
 */
public interface AddressService {
	public AddressDTO getAddressByPincode(String pinCode);

	public AddressDTO getAddressByLandmark(String landMark);

	public AddressDTO getAddressByCountry(String countryName);

	public AddressDTO getAddressByState(String stateName);

	public AddressDTO getAddressByDistrict(String districtName);
}
