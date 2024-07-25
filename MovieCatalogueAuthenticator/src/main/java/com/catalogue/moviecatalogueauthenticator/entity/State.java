package com.catalogue.moviecatalogueauthenticator.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STATE")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STATE_ID")
	private Long stateId;

	@Column(name = "STATE_NAME", length = 30)
	private String stateName;

	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
	private Country country;

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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State() {
	}

	public State(Long stateId, String stateName, Country country) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.country = country;
	}
}
