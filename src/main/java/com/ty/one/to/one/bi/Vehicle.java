package com.ty.one.to.one.bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double cost;
//	@OneToOne( cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@OneToOne( cascade = CascadeType.ALL)
	private Charcey charcey;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Charcey getCharcey() {
		return charcey;
	}
	public void setCharcey(Charcey charcey) {
		this.charcey = charcey;
	}
	

}
