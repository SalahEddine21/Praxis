package com.salaheddine.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	public Consumer() {
	}

	
	public Consumer(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer consumerId) {
		this.id = consumerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
