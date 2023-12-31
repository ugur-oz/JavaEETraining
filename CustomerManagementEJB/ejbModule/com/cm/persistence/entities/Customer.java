package com.cm.persistence.entities;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.cm.persistence.enums.Gender;
import com.cm.persistence.enums.Relationship;

@Entity
@NamedQuery(
		name = Customer.QUERY_GETALL,
		query = "SELECT c FROM Customer c" )
public class Customer {
	
	public static final String QUERY_GETALL = "Customer.GetAll";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(min=1, max=50)
	private String firstName;
	
	@NotNull
	@Size(min=1, max=100)
	private String lastName;
	
	private Gender gender;
	
	private Relationship relationship;
	
	private Date birthday;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Adress> adress;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Communication> communications;

	@Version
	private Timestamp lastChanged;
	
	public List<Adress> getAdress() {
		return adress;
	}

	public void setAdress(List<Adress> adress) {
		this.adress = adress;
	}

	public List<Communication> getCommunications() {
		return communications;
	}

	public void setCommunications(List<Communication> communications) {
		this.communications = communications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Relationship getRelationship() {
		return relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
	
}
