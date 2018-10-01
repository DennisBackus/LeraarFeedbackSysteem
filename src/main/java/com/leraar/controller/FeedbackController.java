package com.leraar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leraar.models.Feedback;
import com.leraar.models.Leerling;
import com.leraar.models.Leraar;
import com.leraar.service.IFeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	private IFeedbackService iFeedbackService;
	
	@PostMapping("/feedback/create")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		return this.iFeedbackService.create(feedback);
	}
	
}
