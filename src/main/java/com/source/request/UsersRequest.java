package com.source.request;

import java.io.Serializable;

public class UsersRequest implements Serializable {
	
	private static final long serialVersionUID = 5926468583005150702L;

	/** User Details **/
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String password;

	private Long userRole;
	private Long userStatus;
	private String publicInfo;
	
	/** Address Details **/
	private String address;
	private Long addressType;
	private Long country;
	private Long state;
	private Long city;
	private Long pinCode;
	private String landMarks;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getUserRole() {
		return userRole;
	}
	public void setUserRole(Long userRole) {
		this.userRole = userRole;
	}
	public Long getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Long userStatus) {
		this.userStatus = userStatus;
	}
	public String getPublicInfo() {
		return publicInfo;
	}
	public void setPublicInfo(String publicInfo) {
		this.publicInfo = publicInfo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getAddressType() {
		return addressType;
	}
	public void setAddressType(Long addressType) {
		this.addressType = addressType;
	}
	public Long getCountry() {
		return country;
	}
	public void setCountry(Long country) {
		this.country = country;
	}
	public Long getState() {
		return state;
	}
	public void setState(Long state) {
		this.state = state;
	}
	public Long getCity() {
		return city;
	}
	public void setCity(Long city) {
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