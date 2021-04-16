package com.example.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.topic.Topic;

@Entity		//Create a table  called Topic with columns as id,name,description
public class Course {

	@Id		//Makes id a primary key
	private String id;
	private String Name;
	private String describtion;
	
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {												//Default Constructor
		
	}
	
	public Course(String id, String Name, String describtion, String topicID) {		//Parameterized Constructor
		super();
		this.id = id;
		this.Name = Name;
		this.describtion = describtion;
		this.topic = new Topic(topicID,"","");
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
