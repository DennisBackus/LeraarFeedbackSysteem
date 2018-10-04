package com.leeraar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leeraar.services.IKlassService;


@RestController
public class KlassController {

	@Autowired
	private IKlassService iKlassService;

	@GetMapping("/feedback/danny/create/{naamKlas}")
	public void createFeedback(@PathVariable String naamKlas) {
		 this.iKlassService.createKlass(naamKlas);
	}
	
}
