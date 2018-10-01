package com.leraar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String reportMessage;
	
	@ManyToOne
	private Leraar leraar;
	
	@ManyToOne
	private Leerling leerling;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReportMessage() {
		return reportMessage;
	}
	public void setReportMessage(String reportMessage) {
		this.reportMessage = reportMessage;
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
