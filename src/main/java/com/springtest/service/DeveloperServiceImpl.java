package com.springtest.service;
import com.springtest.repository.*;

import java.util.List;

import com.springtest.model.*;

public class DeveloperServiceImpl implements DeveloperService {
	
	private  DeveloperRepository drepo = new HibernateDeveloperRepositoryImpl();
	
	public List<Developer> findAll(){
		return drepo.findAll();
		
	}

}
