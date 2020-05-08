package com.spoc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spoc.model.Technologies;

@Repository
@Transactional
public class TechnologiesDAOImp implements TechnologiesDAO
{
public TechnologiesDAOImp()
{
	super();
}
@Autowired
@PersistenceContext
private EntityManager entityManager;

public TechnologiesDAOImp(EntityManager theEntityManager)
{
	entityManager = theEntityManager; 
}

@Override
public void deleteTechnologies(int technologiesId) {
	// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	Query theQuery = currentSession.createQuery("delete from Technologies where id=:technologiesId");
    theQuery.setParameter("technologiesId",technologiesId);
    theQuery.executeUpdate();
}

@Override
public void updateTechnologies(Technologies tech) {
	// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	currentSession.saveOrUpdate(tech);
}

@Override
public Technologies getTechnologiesById(int technologiesId) {
	// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	return currentSession.get(Technologies.class,technologiesId);
	
}

@Override
public List<Technologies> getAllTechnologies() {
	// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	Query<Technologies> theQuery = currentSession.createQuery("from TrainingDetails", Technologies.class);
	List<Technologies> request = theQuery.getResultList();		
	return request;
}

@Override
public void addTechnologies(Technologies tech) {
	// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	currentSession.saveOrUpdate(tech);
}
}
