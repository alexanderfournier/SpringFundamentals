package com.springtest.repository;

import java.util.List;

import com.springtest.model.Developer;

public interface DeveloperRepository {

	List<Developer> findAll();

}