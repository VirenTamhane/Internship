package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity		//Create a table  called Topic with columns as id,name,description
public class Topic {

	@Id		//Makes id a primary key
	private String id;
	private String Name;
	private String describtion;
	
	public Topic() {												//Default Constructor
		
	}
	
	public Topic(String id, String Name, String describtion) {		//Parameterized Constructor
		super();
		this.id = id;
		this.Name = Name;
		this.describtion = describtion;
	}
	
	//Getters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	
	//Setters
	
	public void setName(String name) {
		Name = name;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	
	

}
