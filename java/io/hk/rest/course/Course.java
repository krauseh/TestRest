package io.hk.rest.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.hk.rest.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	
	
	public Topic getTopic() {
		return topic;
	}



	public void setTopic(Topic topic) {
		this.topic = topic;
	}



	public Course() {
		
	}
	
	
	
	public Course(String iD, String name, String description, String topicId) {
		super();
		id = iD;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId,"","");
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
