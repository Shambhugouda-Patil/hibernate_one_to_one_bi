package com.ty.one.to.one.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGstByCompany {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Gst gst=entityManager.find(Gst.class, 1);
		System.out.println("gst id:"+gst.getId());
		System.out.println("gst number:"+gst.getGstNumber());
		System.out.println(""+gst.getState());

}
