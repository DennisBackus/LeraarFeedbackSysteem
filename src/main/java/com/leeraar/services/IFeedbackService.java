package com.leeraar.services;

import java.util.List;

import com.leeraar.models.Feedback;
import com.leeraar.models.Leerling;
import com.leeraar.models.Leraar;

public interface IFeedbackService {

	List <Feedback>findByLeraar(Leraar leraar);
	
	List <Feedback>findByLeerling(Leerling leerling);
	
	
	List <Feedback>findAll();
	
	public Feedback create(Feedback feedback);

	public void update(Feedback feedback);

	public void delete(Feedback feedback);
	
}
