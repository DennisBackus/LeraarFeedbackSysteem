package com.leeraar.services;


import com.leeraar.models.Leerling;
import com.leeraar.models.Leraar;
import com.leeraar.models.Feedback;
import com.leeraar.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;


@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	public List<Feedback> findByLeraar(Leraar leraar) {
		return this.feedbackRepository.findByLeraar(leraar);
	}

	public List<Feedback> findByLeerling(Leerling leerling) {
		return this.feedbackRepository.findByLeerling(leerling);
	}

	public List<Feedback> findAll() {
		return this.feedbackRepository.findAll();
	}

	public Feedback create(Feedback feedback) {
		Assert.notNull(feedback, "Feedback may not be null");
		return this.feedbackRepository.save(feedback);
	}

	public void update(Feedback feedback) {
		Assert.notNull(feedback, "Feedback may not be null");
		this.feedbackRepository.save(feedback);
	}

	public void delete(Feedback feedback) {
		Assert.notNull(feedback, "Feedback may not be null");
		this.feedbackRepository.save(feedback);
	}
	
	
	
}
