package com.leeraar.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Persoon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@ManyToMany 
	@JsonManagedReference
	private List<Klas> klas;
	
	public long getID() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Klas> getKlas() {
		return klas;
	}
	public void setKlas(List<Klas> klas) {
		this.klas = klas;
	}
	



}
