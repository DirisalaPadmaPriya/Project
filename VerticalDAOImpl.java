package com.spoc.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spoc.Verticals;

@Repository
@Transactional
public class VerticalDAOImpl implements VerticalsDAO{

	public VerticalDAOImpl() {
		super();
	}
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	public VerticalDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	@Override
	public void deleteVerticals(int verticalId) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from Verticals where id=:verticalId");
		theQuery.setParameter("VerticalId", verticalId);
		theQuery.executeUpdate();
	}
	@Override
	public void updateVerticals(Verticals verticals) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		 currentSession.saveOrUpdate(verticals);
		
	}
	@Override
	public Verticals getVerticalsById(int verticalId) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Verticals.class, verticalId);
	}

	@Override
	public List<Verticals> getAllVerticals() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Verticals> theQuery = currentSession.createQuery("from Verticals", Verticals.class);
		List<Verticals> request = theQuery.getResultList();		
		return request;
	}

	public void addTrainingDetails(Verticals verticals) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(verticals);
	}
	@Override
	public void addVerticals(Verticals verticals) {
		// TODO Auto-generated method stub
		
	}
}
