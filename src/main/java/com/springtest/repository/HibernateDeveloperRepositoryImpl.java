package com.springtest.repository;

import java.util.ArrayList;
import java.util.List;
import com.springtest.model.Developer;

public class HibernateDeveloperRepositoryImpl implements DeveloperRepository {
	
	/* (non-Javadoc)
	 * @see com.springtest.repository.DeveloperRepository#findAll()
	 */
	@Override
	public List<Developer> findAll() {
		List<Developer> developers = new ArrayList<>();
		
		
		Developer dev = new Developer();
		
		dev.setFirstName("alex");
		dev.setLastName("fournier");
		
		developers.add(dev);
		
	return developers;
	}

}
