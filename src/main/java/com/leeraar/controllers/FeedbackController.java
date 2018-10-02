package com.leeraar.controllers;

import com.leeraar.models.Feedback;
import com.leeraar.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("/feedback/create")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		return this.feedbackService.create(feedback);
	}
	
}
