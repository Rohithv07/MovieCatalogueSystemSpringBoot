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
    private State stateId;

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

    public State getStateId() {
        return stateId;
    }

    public void setStateId(State stateId) {
        this.stateId = stateId;
    }

    public District() {
    }

    public District(long districtId, String districtName, State stateId) {
        super();
        this.districtId = districtId;
        this.districtName = districtName;
        this.stateId = stateId;
    }
}
