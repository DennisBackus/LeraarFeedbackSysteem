package com.leraar.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.leraar.dao.ILeraarDAO;

public class LeraarService extends PersoonService implements IleraarService {
	
	@Autowired
	ILeraarDAO iLeraarDAO;

}
