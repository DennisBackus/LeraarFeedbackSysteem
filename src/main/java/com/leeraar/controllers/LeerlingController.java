package com.leeraar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leeraar.models.Feedback;
import com.leeraar.services.IPersoonService;


@RestController
public class LeerlingController {

	@Autowired
	private IPersoonService ipersonService;

	@PostMapping("/feedback/danny/create")
	public void createFeedback(@RequestBody Feedback feedback) {
		 this.ipersonService.createFeedBack(feedback);
	}

}
