package com.source.model;
import javax.persistence.*;

@Entity
@Table(name = "address_type")
public class AddressType {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="address_type",nullable = false)
    private String addressType;
  
    @Column(name="address_name",nullable = false)
    private String addressName;
    
	public AddressType(Long addressTypeId) {
		this.id = addressTypeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
    

}

