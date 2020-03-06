package com.source.model;
import javax.persistence.*;

@Entity
@Table(name = "users_role_type")
public class UsersRoleType {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="role",nullable = false)
    private String role;
    
    @Column(name="role_name",nullable = false)
    private String roleName;

    
   	public UsersRoleType() {
   		
   	}

   	
	public UsersRoleType(Long userRole) {
		this.id=userRole;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}

