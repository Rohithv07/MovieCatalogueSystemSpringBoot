package com.catalogue.moviecatalogueauthenticator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private Long addressId;
	@Column(name = "ADDRESS_PINCODE")
	private int addressPincode;
	@Column(name = "ADDRESS_LINE1", length = 60)
	private String addressLine1;
	@Column(name = "ADDRESS_LINE2", length = 60)
	private String addressLine2;
	@Column(name = "ADDRESS_LANDMARK", length = 80)
	private String addressLandmark;
	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
	private Country country;
	@ManyToOne
	@JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID")
	private State state;
	@ManyToOne
	@JoinColumn(name = "DISTRICT_ID", referencedColumnName = "DISTRICT_ID")
	private Cities district;

	public Address() {
	}

	/**
	 * @param addressId
	 * @param addressPincode
	 * @param addressLine1
	 * @param addressLine2
	 * @param addressLandmark
	 * @param country
	 * @param state
	 * @param district
	 */
	public Address(Long addressId, int addressPincode, String addressLine1, String addressLine2,
			String addressLandmark, Country country, State state, Cities district) {
		super();
		this.addressId = addressId;
		this.addressPincode = addressPincode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLandmark = addressLandmark;
		this.country = country;
		this.state = state;
		this.district = district;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public int getAddressPincode() {
		return addressPincode;
	}

	public void setAddressPincode(int addressPincode) {
		this.addressPincode = addressPincode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLandmark() {
		return addressLandmark;
	}

	public void setAddressLandmark(String addressLandmark) {
		this.addressLandmark = addressLandmark;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Cities getDistrict() {
		return district;
	}

	public void setDistrict(Cities district) {
		this.district = district;
	}

}
