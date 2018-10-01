package com.leraar.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Klas {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private long ID;
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



	
}
