package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.InboundSmsBinding;

@Repository
public interface InboundSmsRepository {
	InboundSmsBinding getById(long Id);
	
}
