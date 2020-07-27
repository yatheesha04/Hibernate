package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp {
	
	 @Id
	@GeneratedValue
	int id;
	 String name;
	 String tech;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Emp(String name, String tech) {
		super();
		this.name = name;
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	 
	 

}
