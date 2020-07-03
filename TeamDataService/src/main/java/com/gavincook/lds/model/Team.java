package com.gavincook.lds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "team")
public class Team {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
    
    @Column(name="resource_id")
	private Long resourceId; 
    
	@Column(name="name")
	private String name;
	
	@Column(name="logo_url")
	private String logo;
	
	@Column(name="year_founded")
	private String founded;
	
	@Column(name="stadium")
	private String stadium;
	
	@Column(name="stadium_capacity")
	private Integer stadiumCapacity; 
}
