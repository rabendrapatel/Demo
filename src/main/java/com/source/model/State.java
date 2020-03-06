package com.source.model;

import javax.persistence.*;


@Entity
@Table(name = "states")
public class State {
	
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="state_name",nullable = false, updatable = false)
    private String stateName;

    @Column(name="country_id",nullable = false, updatable = false)
    private Long countryId;

    public State() {
	
	}
    
	public State(Long state) {
		this.id=state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	
}
