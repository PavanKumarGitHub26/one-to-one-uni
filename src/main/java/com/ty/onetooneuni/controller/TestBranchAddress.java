package com.ty.onetooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetooneuni.dto.Address;
import com.ty.onetooneuni.dto.Branch;

public class TestBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = new Branch();
		branch.setName("PSP");
		branch.setNo(5678);

		Address address = new Address();
		address.setArea("RAJ");
		address.setPincode(1122);
		address.setState("KA");

		branch.setAddress(address);
		entityTransaction.begin();
		entityManager.persist(address);
		entityManager.persist(branch);
		entityTransaction.commit();

	}
}
