package com.lbs.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lbs.entity.Register;

//import com.lbs.entity.Register;



@Repository
public class RegisterRepository {

	@PersistenceContext()
	private EntityManager entityManager;
	
	@Transactional
	public void save(Register register) {
		entityManager.merge(register);
	}
	
	public Register fetch(String username, String password) {
		return (Register)entityManager.createQuery("select r from Register r where r.username =: username")
				.setParameter("username", username).getSingleResult();
	}
	
	
	public long isValidUser(String username, String password) {
		
		return (Long)entityManager.createQuery("select count(r) from Register r where r.username = :un and r.password = :pwd")										
				.setParameter("un", username)
				.setParameter("pwd", password).getSingleResult();
	}
}
