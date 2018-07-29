package com.pts.procureline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pts.procureline.model.Consultant;
import com.pts.procureline.service.ConsultantService;

@Controller
public class ConsultantController {
	
	@Autowired
	ConsultantService consultantservice;
	
	private static final Logger logger = LoggerFactory.getLogger(ConsultantController.class);
	
	
	@RequestMapping(value = "/consultant", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("consultantpage");
		
		return mav;
	}
	
	@RequestMapping(value = "/consultantData", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Consultant consultant) {
		
		System.out.println("consultant::::::"+consultant.toString());
		consultantservice.consultantData(consultant);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		
		return mav;
	}
}
