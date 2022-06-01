package com.ty.one.to.one.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharcey {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("audi");
		vehicle.setCost(10000);
		
		Charcey charcey=new Charcey();
		charcey.setChareyNumber(235672);
		charcey.setType("road type");
		
		vehicle.setCharcey(charcey);
		
		entityTransaction.begin();
		
		entityManager.persist(vehicle);
		
		entityTransaction.commit();
		
		
				
	}

}
