package com.catalogue.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DISTRICT")
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DISTRICT_ID")
	private long districtId;

	@Column(name = "DISTRICT_NAME", length = 30)
	private String districtName;

	@ManyToOne
	@JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID")
	private State state;

	public long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(long districtId) {
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

	public District() {
	}

	public District(long districtId, String districtName, State state) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.state = state;
	}
}
