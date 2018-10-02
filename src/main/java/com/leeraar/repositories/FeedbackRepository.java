package com.leeraar.repositories;


import com.leeraar.models.Feedback;
import com.leeraar.models.Leerling;
import com.leeraar.models.Leraar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {

	List<Feedback>findByLeraar(Leraar leraar);
	
	List<Feedback>findByLeerling(Leerling leerling);
	
	List<Feedback> findAll();
}
