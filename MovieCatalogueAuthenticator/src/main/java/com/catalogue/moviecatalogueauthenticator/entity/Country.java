package com.catalogue.moviecatalogueauthenticator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COUNTRY_ID")
	private Long countryId;
	@Column(name = "COUNTRY_NAME", length = 80)
	private String countryName;

	public Country() {
	}

	/**
	 * @param countryId
	 * @param countryName
	 */
	public Country(Long countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

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
