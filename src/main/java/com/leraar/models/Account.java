package com.leraar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ID;
private String username;
private String password;
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

	
}
