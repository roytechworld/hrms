package com.pts.procureline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pts.procureline.model.Admin;
import com.pts.procureline.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminservice;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adminform");
		
		return mav;
	}
	
	@RequestMapping(value = "/adminData", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Admin admin,@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		
		System.out.println("admin::::::"+admin.toString());
		int i=adminservice.adminData(admin);
		ModelAndView mav = new ModelAndView();
		adminservice.uploadFile(name,file);
		mav.setViewName("success");
		
		return mav;
	}
	

	
	//File Upload-------------------------------------------------------------------------------------
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public ModelAndView uploadFile() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("upload");
		
		return mav;
	}
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public ModelAndView uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		
		System.out.println("i am inside controller");
		System.out.println("name::::::"+name.toString()+", "+file);
		String status=adminservice.uploadFile(name,file);
		ModelAndView mav = new ModelAndView();
		mav.addObject("status",status);
		mav.setViewName("success");
		
		return mav;
	}
}
