package com.leeraar.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Leerling extends Persoon{
	
	
	@OneToMany
	private List<Feedback> feedback;
	
	@ManyToOne
	private Klas klas;
	



	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	public Klas getKlas() {
		return klas;
	}
	public void setKlas(Klas klas) {
		this.klas = klas;
	}
	
}
