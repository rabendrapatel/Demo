package com.source.model;
import javax.persistence.*;

@Entity
@Table(name = "users_status_type")
public class UsersStatusType {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	@Column(name="status",nullable = false)
    private String status;
    
    @Column(name="status_name",nullable = false)
    private String statusName;

    public UsersStatusType() {
		
	}
    
	public UsersStatusType(Long userStatus) {
		this.id = userStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	
}

