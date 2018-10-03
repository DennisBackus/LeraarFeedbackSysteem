package com.leeraar.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

@Entity
public class Klas {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String name;

@ManyToMany
@JsonManagedReference
private List<Persoon> persoon;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Persoon> getPersoon() {
	return persoon;
}

public void setPersoon(List<Persoon> persoon) {
	this.persoon = persoon;
}







	
}
