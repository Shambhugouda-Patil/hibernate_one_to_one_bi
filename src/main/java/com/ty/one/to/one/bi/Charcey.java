package com.ty.one.to.one.bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charcey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int chareyNumber;
	private String type;
	@OneToOne(mappedBy = "charcey")
	
	private Vehicle vehicle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChareyNumber() {
		return chareyNumber;
	}
	public void setChareyNumber(int chareyNumber) {
		this.chareyNumber = chareyNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
