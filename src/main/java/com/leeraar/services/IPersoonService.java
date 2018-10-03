package com.leeraar.services;

import java.util.List;
import java.util.Optional;

import com.leeraar.models.Klas;
import com.leeraar.models.Persoon;

public interface IPersoonService {

	List<Persoon> findByName (String name);
	
	Optional<Persoon> findById (Long id);
	
	List<Persoon> findByKlas(Klas klas);
	
	List<Persoon> findByKlasName (String klasname);
	
}
