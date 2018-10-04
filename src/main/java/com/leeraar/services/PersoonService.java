package com.leeraar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeraar.models.Feedback;
import com.leeraar.models.Klas;
import com.leeraar.models.Leerling;
import com.leeraar.models.Leraar;
import com.leeraar.models.Persoon;
import com.leeraar.repositories.IKlasRepository;
import com.leeraar.repositories.IPersonRepository;

@Service
public class PersoonService implements IPersoonService {
	
 	@Autowired
 	IPersonRepository iPersondao;
 	
 	@Autowired
 	IKlasRepository iKlasdao;
 	
 	@Autowired
	IFeedbackService ifeedbackService;
 	
 	@Override
	public List<Persoon> findByName(String name) {
		
		return iPersondao.findByName(name);
	}
 	@Override
	public Optional<Persoon> findById(Long id) {
		
		return iPersondao.findById(id);
	}
	@Override
	public List<Persoon> findByKlas(Klas klas) {
		// TODO Auto-generated method stub
		return iPersondao.findByKlas(klas);
	}
	@Override
	public List<Persoon> findByKlasName(String klasname) {
		// TODO Auto-generated method stub
		List<Klas> klasso =  iKlasdao.findByName(klasname);
		List<Persoon> dePersonen = new ArrayList<Persoon>();
		for (Klas klasje : klasso) {
			dePersonen.addAll(klasje.getPersoon());
		}
		
		return dePersonen;
	}
	
	@Override
	public void createFeedBack(Feedback feedback) {
		// TODO Auto-generated method stub
		
		ifeedbackService.create(feedback);
		
		
	}
	
	public void createPerson(String leraarleerling) {
		System.out.println("de string is: " + leraarleerling);
		Persoon nieuwPersoon = new Persoon();
		if (leraarleerling.equals("leerling")) {
			nieuwPersoon = new Leerling();
			nieuwPersoon.setName("leerlingoooo" );
			List <Klas> deklas = iKlasdao.findAll();
			nieuwPersoon.setKlas(deklas);
		} else {
			nieuwPersoon = new Leraar();
			nieuwPersoon.setName("leraarooo" );
		}
		
		this.iPersondao.save(nieuwPersoon);
		
	}
	
	
	

}
