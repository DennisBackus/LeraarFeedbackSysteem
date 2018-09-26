package com.leraar.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klas {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private long ID;
private List<Leerling> leerlingen;
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public List<Leerling> getLeerlingen() {
	return leerlingen;
}
public void setLeerlingen(List<Leerling> leerlingen) {
	this.leerlingen = leerlingen;
}
public List<Leraar> getLeraren() {
	return leraren;
}
public void setLeraren(List<Leraar> leraren) {
	this.leraren = leraren;
}
private List<Leraar> leraren;

	
}
