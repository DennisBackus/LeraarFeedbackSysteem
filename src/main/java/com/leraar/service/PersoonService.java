package com.leraar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leraar.dao.IPersoonDAO;
import com.leraar.models.Persoon;

@Service
public class PersoonService implements IpersoonService {

	@Autowired
	IPersoonDAO iPersondao;

	@Override
	public List<Persoon> findByName(String name) {
		
		return iPersondao.findByName(name);
	}

	@Override
	public Optional<Persoon> findById(Long id) {
		
		return iPersondao.findById(id);
	}
	
	
	
	
	
	
	
}
