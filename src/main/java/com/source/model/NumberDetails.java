package com.source.model;

import javax.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "number_details")
public class NumberDetails {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
    @ColumnDefault("'0'")
    @Column(name="count",nullable = false)
    private int cont;


	public long getId() {
		return id;
	}


	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}


	public void setId(long id) {
		this.id = id;
	}

	

    
}

