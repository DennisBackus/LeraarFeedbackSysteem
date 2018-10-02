package com.leeraar.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Leraar extends Persoon {

	private String specialisatie;
	
	@ManyToMany
	private List<Klas> klassen;
	@OneToMany
	private List <Feedback> feedback;

	
	public List<Klas> getKlassen() {
		return klassen;
	}
	public void setKlassen(List<Klas> klassen) {
		this.klassen = klassen;
	}
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	public String getSpecialisatie() {
		return specialisatie;
	}
	public void setSpecialisatie(String specialisatie) {
		this.specialisatie = specialisatie;
	}
}
