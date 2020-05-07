package com.spoc.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoc.Verticals;
import com.spoc.dao.VerticalsDAO;
import com.spoc.service.VerticalsService;
@Service
@Transactional
public class VerticalServiceImpl implements VerticalsService{

	public VerticalServiceImpl() {
		super();
	
	}
	@Autowired
	private static VerticalsDAO verticalsdao;
	public static void deleteVerticals(int verticalId) {
		// TODO Auto-generated method stub
		verticalsdao.deleteVerticals(verticalId);
		
	}
	public static void updateVerticals(Verticals verticals) {
		// TODO Auto-generated method stub
		verticalsdao.updateVerticals(verticals);
		
	}
	public static  Verticals getVerticalsById(int verticalId) {
		// TODO Auto-generated method stub
		return verticalsdao.getVerticalsById(verticalId);
	}
	public static List<Verticals> getAllVerticals() {
		// TODO Auto-generated method stub
		return verticalsdao.getAllVerticals();
	}
	public static void addVerticals(Verticals verticals) {
		// TODO Auto-generated method stub
		verticalsdao.addVerticals(verticals);
		
	}
}
