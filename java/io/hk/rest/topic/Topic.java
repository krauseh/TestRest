package io.hk.rest.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	
	public Topic() {
		
	}
	
	
	
	public Topic(String iD, String name, String description) {
		super();
		id = iD;
		this.name = name;
		this.description = description;
	}
	public String getID() {
		return id;
	}
	public void setID(String iD) {
		id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
