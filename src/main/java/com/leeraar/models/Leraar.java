package com.leeraar.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Leraar extends Persoon {

	private String specialisatie;
	
	
	@OneToMany
	private List <Feedback> feedback;

	
	
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
