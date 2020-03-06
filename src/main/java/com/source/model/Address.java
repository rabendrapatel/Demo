package com.source.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="user_id",nullable = true)
	private Long userId;
    
    @Column(name="address",nullable = true)
	private String address;
	
    
    @ManyToOne(targetEntity = AddressType.class, optional = false)
    @JoinColumn(name="address_type",referencedColumnName = "id", nullable = false)
    private AddressType addressType;
 
    @ManyToOne(targetEntity = Country.class, optional = false)
    @JoinColumn(name="country",referencedColumnName = "id",nullable = false)
    private Country country;
    
    @ManyToOne(targetEntity = State.class, optional = false)
    @JoinColumn(name="state",referencedColumnName = "id", nullable = false)
    private State state;
    
    
    @ManyToOne(targetEntity = Cities.class, optional = false)
    @JoinColumn(name="city",referencedColumnName = "id", nullable = false)
    private Cities city;
    
    @Column(name="pin_code",nullable = true)
	private Long pinCode;
    
    @Column(name="land_marks",nullable = true)
	private String landMarks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Cities getCity() {
		return city;
	}

	public void setCity(Cities city) {
		this.city = city;
	}

	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public String getLandMarks() {
		return landMarks;
	}

	public void setLandMarks(String landMarks) {
		this.landMarks = landMarks;
	}

	
	
}

