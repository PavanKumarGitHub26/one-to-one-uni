package com.ty.onetooneuni.controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetooneuni.dto.Pan;
import com.ty.onetooneuni.dto.Person;

public abstract class TestPersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
        
		Pan pan=new Pan();
		pan.setCountry("INDIA");
		pan.setDate(LocalDateTime.now());
		pan.setPanNo("DXY001");
		
		Person person=new Person();
		person.setGender("MALE");
		person.setName("PAVAN");
		person.setNo(9988);
		
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
