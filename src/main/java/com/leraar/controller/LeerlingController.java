package com.leraar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leraar.models.Feedback;
import com.leraar.service.ILeerlingService;

@RestController
public class LeerlingController {

	@Autowired
	private ILeerlingService iLeerlingService;
	
	@PostMapping("/feedback/danny/create")
	public void createFeedback(@RequestBody Feedback feedback) {
		 this.iLeerlingService.createFeedBack(feedback);
	}
	
	
	
	
}
