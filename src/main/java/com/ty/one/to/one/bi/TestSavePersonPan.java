package com.ty.one.to.one.bi;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class TestSavePersonPan {
		public static void main(String[] args) {
			
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("shambhu");
		person.setEmail("shambhu@123");
		person.setPhone(123456789);
		
		Pan pan=new Pan();
		pan.setAddress("bangalore");
		pan.setPanNumber("PAN12345");
	
		person.setPan(pan);
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		}
		
	}



