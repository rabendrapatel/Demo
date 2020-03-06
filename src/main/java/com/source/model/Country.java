package com.source.model;

import javax.persistence.*;


@Entity
@Table(name = "countries")
public class Country {
	
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="sort_name",nullable = false, updatable = false)
    private String sortName;

    @Column(name="country_name",nullable = false, updatable = false)
    private String countryName;
    
    @Column(name="phone_code",nullable = false, updatable = false)
    private Long phoneCode;

    public Country() {
		
	}
    
	public Country(Long country) {
		this.id=country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Long getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(Long phoneCode) {
		this.phoneCode = phoneCode;
	}

	
	
}
