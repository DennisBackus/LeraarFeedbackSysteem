package com.leraar.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leraar extends Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long ID;
	private Account account;
	private List<Klas> klassen;
	private List <Feedback> feedback;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
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
