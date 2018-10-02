package com.leraar.service;

import com.leraar.models.Feedback;
import com.leraar.models.Leerling;
import com.leraar.models.Leraar;

public interface ILeerlingService extends IpersoonService{

	public void createFeedBack (Feedback feedback);
	
	
}
