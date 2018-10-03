package com.leeraar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeraar.models.Persoon;
import com.leeraar.repositories.IPersonRepository;

@Service
public class PersoonService implements IPersoonService {
	
 	@Autowired
 	IPersonRepository iPersondao;
 	@Override
	public List<Persoon> findByName(String name) {
		
		return iPersondao.findByName(name);
	}
 	@Override
	public Optional<Persoon> findById(Long id) {
		
		return iPersondao.findById(id);
	}

}
