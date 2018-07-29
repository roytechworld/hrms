package com.pts.procureline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.pts.procureline.model.VmsEmployeeMaster;
import com.pts.procureline.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employeepage");
		
		return mav;
	}
	
	@RequestMapping(value = "/employeeData", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute VmsEmployeeMaster employee) {
		
		System.out.println("employee::::::"+employee.toString());
		empservice.employeeData(employee);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		
		return mav;
	}
}
