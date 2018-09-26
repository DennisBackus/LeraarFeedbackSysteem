package com.leraar.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leerling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String name;
	private List<Leraar> leraar;
	private List<Feedback> feedback;
	private Klas klas;
	private Account account;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Leraar> getLeraar() {
		return leraar;
	}
	public void setLeraar(List<Leraar> leraar) {
		this.leraar = leraar;
	}
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
