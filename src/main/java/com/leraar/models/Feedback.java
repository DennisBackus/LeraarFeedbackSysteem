package com.leraar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long ID;
	private String feedbackInhoud;
	private Leraar leraar;
	private Leerling leerling;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFeedbackInhoud() {
		return feedbackInhoud;
	}
	public void setFeedbackInhoud(String feedbackInhoud) {
		this.feedbackInhoud = feedbackInhoud;
	}
	public Leraar getLeraar() {
		return leraar;
	}
	public void setLeraar(Leraar leraar) {
		this.leraar = leraar;
	}
	public Leerling getLeerling() {
		return leerling;
	}
	public void setLeerling(Leerling leerling) {
		this.leerling = leerling;
	}
}
