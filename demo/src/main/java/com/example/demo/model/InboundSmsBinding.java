package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class InboundSmsBinding {
	    @Id
	    @GeneratedValue
	    private Long id;
	    private String name;
	    private String email;

}
