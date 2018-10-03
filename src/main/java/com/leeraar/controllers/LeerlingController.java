//package com.leeraar.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.leeraar.models.Feedback;
//import com.leeraar.services.IleerlingService;
//
//@RestController
//public class LeerlingController {
//
//	@Autowired
//	private IleerlingService iLeerlingService;
//
//	@PostMapping("/feedback/danny/create")
//	public void createFeedback(@RequestBody Feedback feedback) {
//		 this.iLeerlingService.createFeedBack(feedback);
//	}
//
//}
