package com.leraar.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Leraar extends Persoon {


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

}
