package com.cm.persistence.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cm.persistence.enums.Gender;
import com.cm.persistence.enums.Relationship;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Gender gender;
	
	private Relationship relationship;
	
	private Date birthday;

}
