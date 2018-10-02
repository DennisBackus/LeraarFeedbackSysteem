package com.leeraar.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Klas {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ID;

private String name;

@ManyToOne
private Leraar leraar;


@OneToMany
private List<Leerling> leerlingen;
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public Leraar getLeraar() {
	return leraar;
}
public void setLeraar(Leraar leraar) {
	this.leraar = leraar;
}
public List<Leerling> getLeerlingen() {
	return leerlingen;
}
public void setLeerlingen(List<Leerling> leerlingen) {
	this.leerlingen = leerlingen;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



	
}
