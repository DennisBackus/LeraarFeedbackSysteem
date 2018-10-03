package com.leeraar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeraar.models.Feedback;
import com.leeraar.repositories.IleerlingRepository;

@Service
public class LeerlingService extends PersoonService implements IleerlingService {
	
	@Autowired
	IleerlingRepository iLeerlingDAO;
	
	@Autowired
	IFeedbackService ifeedbackService;

	@Override
	public void createFeedBack(Feedback feedback) {
		// TODO Auto-generated method stub
		
		ifeedbackService.create(feedback);
		
		
	}
	
	
 	
 	
 	
	}
	
