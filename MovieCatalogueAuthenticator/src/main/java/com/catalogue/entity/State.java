package com.catalogue.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STATE")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STATE_ID")
    private long stateId;

    @Column(name = "STATE_NAME", length = 30)
    private String stateName;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
    private Country countryId;

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public State() {
    }

    public State(long stateId, String stateName, Country countryId) {
        super();
        this.stateId = stateId;
        this.stateName = stateName;
        this.countryId = countryId;
    }
}
