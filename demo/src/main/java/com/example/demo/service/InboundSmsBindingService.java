package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.InboundSmsBinding;
import com.example.demo.repository.InboundSmsRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class InboundSmsBindingService {

	@PersistenceContext
    private EntityManager entityManager;
	@Autowired 
	InboundSmsRepository inboundSmsRepository;

    public InboundSmsBinding customFindMethod(Long id) {
        return  (InboundSmsBinding) entityManager.createQuery("FROM User u WHERE u.id = :id")
          .setParameter("id", id)
          .getSingleResult();
    }
    
	public InboundSmsBinding getById(long Id) {
		return (InboundSmsBinding) entityManager.createQuery("FROM User u WHERE u.id = :id")
		          .setParameter("id", Id)
		          .getSingleResult();
	}
}
