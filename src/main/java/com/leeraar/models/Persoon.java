package com.leeraar.models;

import javax.persistence.*;

@Entity
public class Persoon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String name;
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
