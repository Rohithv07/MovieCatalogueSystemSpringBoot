/**
 * 
 */
package com.catalogue.dto;

/**
 * @author rohithvazhathody
 *
 */
public class CountryDTO {

	public CountryDTO() {
	}

	/**
	 * @param countryId
	 * @param countryName
	 */
	public CountryDTO(Long countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	private Long countryId;
	private String countryName;

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
