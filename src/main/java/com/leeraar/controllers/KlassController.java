package com.leeraar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leeraar.models.Feedback;
import com.leeraar.services.IKlassService;
import com.leeraar.services.IleerlingService;

@RestController
public class KlassController {

	@Autowired
	private IKlassService iKlassService;

	@GetMapping("/feedback/danny/create/{naamKlas}")
	public void createFeedback(@PathVariable String naamKlas) {
		 this.iKlassService.createKlass(naamKlas);
	}
	
}
