package com.ty.one.to.one.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Pan pan=entityManager.find(Pan.class, 1);
		
		System.out.println("pan address:"+pan.getAddress());
		System.out.println("pan number"+pan.getPanNumber());
		System.out.println("pan id"+pan.getId());
		
		Person person=pan.getPerson();
		System.out.println("Person name:"+person.getName());
		System.out.println("person email:"+person.getEmail());
		System.out.println("person phone:"+person.getPhone());
	}

}
