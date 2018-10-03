package com.leeraar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leeraar.services.IPersoonService;

@RestController
public class PersoonController {

	@Autowired
	private IPersoonService ipersonService;

	@GetMapping("/feedback/danny/persoon/{leraarleerling}")
	public void createFeedback(@PathVariable String leraarleerling) {
		 this.ipersonService.createPerson(leraarleerling);
	}
	
	
}
