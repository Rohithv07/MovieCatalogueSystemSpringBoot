/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.dto;

/**
 * @author rohithvazhathody
 *
 */
public class AddressDTO {

	private Long addressId;
	private int addressPincode;
	private String addressLine1;
	private String addressLine2;
	private String addressLandmark;
	private String countryName;
	private String stateName;
	private String districtName;

	/**
	 * @param addressId
	 * @param addressPincode
	 * @param addressLine1
	 * @param addressLine2
	 * @param addressLandmark
	 * @param countryName
	 * @param stateName
	 * @param districtName
	 */
	public AddressDTO(Long addressId, int addressPincode, String addressLine1, String addressLine2,
			String addressLandmark, String countryName, String stateName, String districtName) {
		super();
		this.addressId = addressId;
		this.addressPincode = addressPincode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLandmark = addressLandmark;
		this.countryName = countryName;
		this.stateName = stateName;
		this.districtName = districtName;
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

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

}
