package com.cm.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cm.persistence.enums.CommunicationType;
import com.cm.persistence.enums.Kind;

@Entity
public class Communication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String value;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private CommunicationType communicationType;
	
	@Enumerated(EnumType.STRING)
	private Kind kind;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommunicationType getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(CommunicationType communicationType) {
		this.communicationType = communicationType;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	
	
}
