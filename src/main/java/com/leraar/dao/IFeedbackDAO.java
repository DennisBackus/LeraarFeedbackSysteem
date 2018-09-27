package com.leraar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leraar.models.Feedback;
import com.leraar.models.Leerling;
import com.leraar.models.Leraar;

public interface IFeedbackDAO extends CrudRepository<Feedback, Long>{

	List <Feedback>findByLeraar(Leraar leraar);
	
	List <Feedback>findByLeerling(Leerling leerling);
	
	
	List <Feedback>findAll();
}
