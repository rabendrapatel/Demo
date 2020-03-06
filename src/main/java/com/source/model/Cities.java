package com.source.model;

import javax.persistence.*;


@Entity
@Table(name = "cities")
public class Cities {
	
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="city_name",nullable = false, updatable = false)
    private String cityName;

    @Column(name="state_id",nullable = false, updatable = false)
    private Long stateId;

    public Cities() {
		
	}
    
	public Cities(Long city) {
		this.id=city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
}
