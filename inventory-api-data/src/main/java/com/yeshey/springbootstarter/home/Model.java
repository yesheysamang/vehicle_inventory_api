package com.yeshey.springbootstarter.home;

//Imported annotations
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//Imported Classes for foreign key references
import com.yeshey.springbootstarter.company.Company;
import com.yeshey.springbootstarter.vehicle_category.Vehicle;

// Model entity which binds to the model table in the DB
@Entity
public class Model {
	@Id										//Annotation for the primary key
	@Column(name="model_id")				//Setting column name to match DB
	private String id;
	
	@ManyToOne 
	@JoinColumn(name="company_id") 			//Sets the company instance to act as a foreign key
	private Company company;
	
	@ManyToOne
	@JoinColumn(name="vehicle_category_id") //Sets the vehicle instance to act as a foreign key
	private Vehicle vehicle;
	
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="year")
	private double year;
	@Column(name="quantity")
	private int quantity;

	public Model() {
		
	}
	//Constructor which includes the foreign keys
	public Model(String id, String name, double price, double year, int quantity, String companyId, String vehicleId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.year = year;
		this.quantity = quantity;
		this.company = new Company(companyId, "","");	//foreign key of model table
		this.vehicle = new Vehicle(vehicleId, "");		//foreign key of model table
		
	}
	
	//Getters and Setters
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	public int getQunatity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
