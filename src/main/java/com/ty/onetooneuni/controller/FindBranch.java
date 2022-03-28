package com.ty.onetooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetooneuni.dto.Address;
import com.ty.onetooneuni.dto.Branch;

public class FindBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 1);
		Address address = branch.getAddress();

		System.out.println(branch.getName());
		System.out.println(branch.getNo());
		System.out.println("-----------");
		System.out.println(address.getArea());
		System.out.println(address.getPincode());
		System.out.println(address.getState());
		
		Bat bat=new Bat();
		bat.m1();

	}

}
