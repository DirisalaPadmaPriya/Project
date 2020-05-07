package com.spoc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spoc.Verticals;
import com.spoc.service.VerticalsService;

@Controller
public class VerticalsController {
@Autowired
private VerticalsService vservice;
@RequestMapping(value = "/viewVerticals", method = RequestMethod.GET)
public ModelAndView viewDetails(@ModelAttribute("viewverticals") Verticals verticals) throws IOException {
	 ModelAndView model=new ModelAndView();
	List<Verticals> vertical= VerticalsService.getAllVerticals();
	 model.addObject("vertical",vertical);
	 model.setViewName("Verticleslist");
	
	return model;
}
@RequestMapping(value = "/newVerticals", method = RequestMethod.GET)
public ModelAndView addDetails(ModelAndView model) {
	Verticals vertical = new Verticals();
	model.addObject("vertical", vertical);
	model.setViewName("VerticalForm");
	return model;
}
@RequestMapping(value = "/saveVerticals", method = RequestMethod.POST)
public ModelAndView saveDetails(@ModelAttribute Verticals verticals) {
	if (verticals.getVerticalId() == 0) { 
		VerticalsService.addVerticals(verticals);
	} else {
		VerticalsService.updateVerticals(verticals);
		
	}
	
	return new ModelAndView("redirect:/viewVerticals");
}
@RequestMapping(value = "/deleteVerticals", method = RequestMethod.GET)
public ModelAndView deleteDetails(HttpServletRequest request) {
	int VerticalId = Integer.parseInt(request.getParameter("verticalId"));
	VerticalsService.deleteVerticals(VerticalId);
	return new ModelAndView("redirect:/viewVerticals");
}
@RequestMapping(value = "/editTdetails", method = RequestMethod.GET)
public ModelAndView editDetails(HttpServletRequest request) {
	int verticalId = Integer.parseInt(request.getParameter("verticalId"));
	Verticals vertical = VerticalsService.getVerticalsById(verticalId);
	ModelAndView model = new ModelAndView("VerticalForm");
    model.addObject("vertical", vertical);
    
   
	return model;
}
}
