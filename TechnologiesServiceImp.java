package com.spoc.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spoc.dao.TechnologiesDAO;
import com.spoc.model.Technologies;

@Service
@Transactional
public class TechnologiesServiceImp implements TechnologiesService 
{
public TechnologiesServiceImp() {
	super();
}
@Autowired
private TechnologiesDAO techDao;
@Override
public void deleteTechnologies(int technologiesId)
{
	techDao.deleteTechnologies(technologiesId);
}
@Override
public void updateTechnologies(Technologies tech)
{
	techDao.updateTechnologies(tech);
}
@Override
public Technologies getTechnologiesById(int TechnologiesId)
{
	return techDao.getTechnologiesById(TechnologiesId);
}
@Override
public List<Technologies>getAllTechnologies()
{
	return techDao.getAllTechnologies();
}
@Override
public void addTechnologies(Technologies tech)
{
	techDao.addTechnologies(tech);
}
}
