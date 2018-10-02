package com.leraar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leraar.dao.ILeerlingDAO;
import com.leraar.models.Feedback;
import com.leraar.models.Leerling;
import com.leraar.models.Leraar;

@Service
public class LeerlingService extends PersoonService implements ILeerlingService {

	@Autowired
	ILeerlingDAO iLeerlingDAO;
	
	@Autowired
	IFeedbackService ifeedbackService;

	@Override
	public void createFeedBack(Feedback feedback) {
		// TODO Auto-generated method stub
		
		ifeedbackService.create(feedback);
		
		
	}
	
	
	
	
	
	
}
