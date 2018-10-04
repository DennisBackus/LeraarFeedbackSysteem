package com.leeraar.services;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeraar.models.Klas;
import com.leeraar.models.Persoon;
import com.leeraar.repositories.IKlasRepository;

@Service
public class KlassService implements IKlassService {
	
	@Autowired
	IKlasRepository iKlassRepository;
	
	public void createKlass (String naamKlas) {
		Klas deGemaakteKlas = new Klas();
		deGemaakteKlas.setName(naamKlas);
		deGemaakteKlas.setPersoon(new ArrayList<Persoon>());
		iKlassRepository.save(deGemaakteKlas);
	}
 
}
