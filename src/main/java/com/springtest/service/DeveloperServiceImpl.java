package com.springtest.service;
import com.springtest.repository.*;

import java.util.List;

import com.springtest.model.*;

public class DeveloperServiceImpl implements DeveloperService {
	
	private  DeveloperRepository developerRepository;
	
	
	
	
	
	@Override
	public List<Developer> findAll(){
		return developerRepository.findAll();
		
	}





	public void setDeveloperRepository(DeveloperRepository developerRepository) {
		this.developerRepository = developerRepository;
	}

}
