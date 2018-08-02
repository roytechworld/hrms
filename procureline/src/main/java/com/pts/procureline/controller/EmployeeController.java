package com.pts.procureline.controller;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pts.procureline.model.Employee;
import com.pts.procureline.model.Vendor;
import com.pts.procureline.model.VmsEmployeeMaster;
import com.pts.procureline.service.EmployeeService;
import com.pts.procureline.service.GenericService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Autowired
	GenericService<VmsEmployeeMaster>employeeservicegeneric;
	
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employeepage");
		
		return mav;
	}
	
	@RequestMapping(value = "/employeeData", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Employee employee) {
		
		System.out.println("employee::::::"+employee.toString());
		empservice.employeeData(employee);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		
		return mav;
	}
	
	@RequestMapping(value = "/consultantreport", method = RequestMethod.GET)
	public ModelAndView consultantreport(@ModelAttribute Vendor vendor) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		
		mav.addObject("vendorlist", employeeservicegeneric.retreiveAnydataWithonePARAUpdate("employeeType", "C", VmsEmployeeMaster.class, session));
		}
		catch(Exception e)
		{
			logger.error("Exception occur"+e);
		}
		finally
		{
		if(session!=null)	
		{
			session.clear();
			session.close();
		}
		}
		
		mav.setViewName("consultantreport");
		
		return mav;
	}
	
	
	
}
