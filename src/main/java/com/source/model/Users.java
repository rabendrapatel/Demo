package com.source.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="user_name",nullable = false, updatable = false)
    private String userName;
    
    @JsonIgnore
    @Column(name="password",nullable = true)
    private String password;

    
    /** User Details **/
    @Column(name="first_name",nullable = false)
	private String firstName;
    
    @Column(name="last_name",nullable = false)
	private String lastName;
    
    @Column(name="email",nullable = true)
	private String email;
    
    @Column(name="mobile",nullable = false)
	private String mobile;

    @ManyToOne(targetEntity = UsersRoleType.class, optional = false)
    @JoinColumn(name="user_role",referencedColumnName = "id", nullable = false)
    private UsersRoleType usersRoleType;
    
    
    @ManyToOne(targetEntity = UsersStatusType.class, optional = false)
    @JoinColumn(name="user_status_type",referencedColumnName = "id",  nullable = false)
    private UsersStatusType usersStatusType;
    
    @Column(name="public_info",nullable = true)
    private String publicInfo;
	

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
	
	public UsersRoleType getUsersRoleType() {
		return usersRoleType;
	}

	public void setUsersRoleType(UsersRoleType usersRoleType) {
		this.usersRoleType = usersRoleType;
	}

	public String getPublicInfo() {
		return publicInfo;
	}
	
	public UsersStatusType getUsersStatusType() {
		return usersStatusType;
	}

	public void setUsersStatusType(UsersStatusType usersStatusType) {
		this.usersStatusType = usersStatusType;
	}

	public void setPublicInfo(String publicInfo) {
		this.publicInfo = publicInfo;
	}
   
}

