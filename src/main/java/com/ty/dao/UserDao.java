package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = null;
	
	

}
