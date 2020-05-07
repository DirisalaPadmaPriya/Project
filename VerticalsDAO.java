package com.spoc.dao;

import java.util.List;

import com.spoc.Verticals;

public interface VerticalsDAO {
	
		public  void deleteVerticals(int VerticalId);
		public  void updateVerticals(Verticals verticals);
		public   Verticals getVerticalsById(int VerticalId);
		public  List<Verticals> getAllVerticals();
		public  void addVerticals(Verticals verticals);
	}

