package com.leraar.service;

import java.util.List;

import com.leraar.models.Feedback;
import com.leraar.models.Leerling;
import com.leraar.models.Leraar;

public interface IFeedbackService {

	List <Feedback>findByLeraar(Leraar leraar);
	
	List <Feedback>findByLeerling(Leerling leerling);
	
	
	List <Feedback>findAll();
	
	public Feedback create(Feedback feedback);

	public void update(Feedback feedback);

	public void delete(Feedback feedback);
}
