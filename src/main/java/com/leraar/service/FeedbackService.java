package com.leraar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.leraar.dao.IFeedbackDAO;
import com.leraar.models.Feedback;
import com.leraar.models.Leerling;
import com.leraar.models.Leraar;


@Service
public class FeedbackService implements IFeedbackService {

	@Autowired
	private IFeedbackDAO iFeedbackDAO;

	@Override
	public List<Feedback> findByLeraar(Leraar leraar) {
		return this.iFeedbackDAO.findByLeraar(leraar);
	}

	@Override
	public List<Feedback> findByLeerling(Leerling leerling) {
		return this.iFeedbackDAO.findByLeerling(leerling);
	}

	@Override
	public List<Feedback> findAll() {
		return this.iFeedbackDAO.findAll();
	}

	@Override
	public Feedback create(Feedback feedback) {
		Assert.notNull(feedback, "Feedback may not be null");
		return this.iFeedbackDAO.save(feedback);
	}

	@Override
	public void update(Feedback feedback) {
		Assert.notNull(feedback, "Feedback may not be null");
		this.iFeedbackDAO.save(feedback);
	}

	@Override
	public void delete(Feedback feedback) {
		Assert.notNull(feedback, "Feedback may not be null");
		this.iFeedbackDAO.save(feedback);
	}
	
	
	
}
