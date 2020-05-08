package com.spoc.controller;
import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spoc.model.Technologies;
import com.spoc.service.TechnologiesService;

@Controller
public class TechnologiesController {
	
	@Autowired
	private TechnologiesService techService;
	@RequestMapping(value = "/viewTech",method=RequestMethod.GET)
	public ModelAndView viewDetais(@ModelAttribute("tech") Technologies tech) throws IOException
	{
		 ModelAndView model=new ModelAndView();
		List<Technologies> Tech = techService.getAllTechnologies();
		 model.addObject("tech",tech);
		 model.setViewName("listofTechnologies");
		
		return model;
	}
	@RequestMapping(value = "/newTech", method = RequestMethod.GET)
	public ModelAndView addDetails(ModelAndView model)
	{
	Technologies tech = new Technologies();
	model.setViewName("trainingDetailsForm");
	return model;
	}

	 @RequestMapping(value = "/saveTech", method = RequestMethod.POST)
	    public ModelAndView saveDetails(@ModelAttribute Technologies tech) {
			if (tech.getTechnologiesId() == 0) { 
				techService.addTechnologies(tech);
			} else {
		techService.updateTechnologies(tech);
				
			}
			
			return new ModelAndView("redirect:/viewTech");
	    }
	 
	    
	    
	    @RequestMapping(value = "/deleteTech", method = RequestMethod.GET)
	    public ModelAndView deleteDetails(HttpServletRequest request) {
			int technologiesId = Integer.parseInt(request.getParameter("technologiesId"));
			techService.deleteTechnologies(technologiesId);
			return new ModelAndView("redirect:/viewTdetails");
	    }
	    @RequestMapping(value = "/editTech", method = RequestMethod.GET)
		public ModelAndView editDetails(HttpServletRequest request) {
			int technologiesId = Integer.parseInt(request.getParameter("technologiesId"));
			Technologies tech = techService.getTechnologiesById(technologiesId);
			ModelAndView model = new ModelAndView("technologiesForm");
		    model.addObject("tech", tech);
		    
		   
			return model;
		}
	
}

