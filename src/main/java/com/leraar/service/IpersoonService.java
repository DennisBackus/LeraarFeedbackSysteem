package com.leraar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leraar.dao.IPersoonDAO;
import com.leraar.models.Persoon;


public interface IpersoonService {
	
	List<Persoon> findByName (String name);
	
	Optional<Persoon> findById (Long id);
	

}
