package com.catalogue.moviecatalogueauthenticator.dto;

/**
 * @author priya prasad
 */
public class StateDTO {

    private Long stateId;
    private String stateName;
    private String country;

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
