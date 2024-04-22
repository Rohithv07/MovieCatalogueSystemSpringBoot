package com.catalogue.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CITIES")
public class Cities {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DISTRICT_ID")
	private Long districtId;

	@Column(name = "DISTRICT_NAME", length = 30)
	private String districtName;

	@ManyToOne
	@JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID")
	private State state;

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Cities() {
	}

	public Cities(Long districtId, String districtName, State state) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.state = state;
	}
}
