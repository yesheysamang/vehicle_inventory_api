package com.yeshey.springbootstarter.company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity 
public class Company {
	@Id
	@Column(name="company_id")
	private String id;
	@Column(name="company_name")
	private String name;
	@Column(name="company_origin")
	private String origin;
		 
	public Company() {
		
	}
	
	public Company(String id, String name, String origin) {
		super();
		this.id = id;
		this.name = name;
		this.origin = origin;
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
