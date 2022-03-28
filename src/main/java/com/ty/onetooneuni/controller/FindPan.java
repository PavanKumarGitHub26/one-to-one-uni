package com.ty.onetooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetooneuni.dto.Pan;
import com.ty.onetooneuni.dto.Person;

public class FindPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);
		Person person = pan.getPerson();

		System.out.println(pan.getPanNo());
		System.out.println(pan.getDate());
		System.out.println(pan.getCountry());
		System.out.println("-----------");
		System.out.println(person.getName());
		System.out.println(person.getNo());
		System.out.println(person.getGender());
	}
}
