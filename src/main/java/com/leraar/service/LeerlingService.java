package com.leraar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leraar.dao.ILeerlingDAO;

@Service
public class LeerlingService extends PersoonService implements ILeerlingService {

	@Autowired
	ILeerlingDAO iLeerlingDAO;
	
}
