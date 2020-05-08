package com.spoc.dao;
import java.util.List;

import com.spoc.model.Technologies;

public interface TechnologiesDAO 
{
	public void deleteTechnologies(int technologiesId);
	public void updateTechnologies(Technologies tech);
	public Technologies getTechnologiesById(int technologiesId);
	public List<Technologies>getAllTechnologies();
	public void addTechnologies(Technologies tech);

	
	}
