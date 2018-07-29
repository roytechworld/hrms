package com.pts.procureline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.pts.procureline.model.Vendor;
import com.pts.procureline.service.VendorService;

@Controller
public class VendorController {

	@Autowired
	VendorService vendorservice;
	
	private static final Logger logger = LoggerFactory.getLogger(VendorController.class);
	
	
	@RequestMapping(value = "/vendor", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("vendorform");
		
		return mav;
	}
	
	@RequestMapping(value = "/vendorData", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Vendor vendor) {
		
		System.out.println("vendor::::::"+vendor.toString());
		vendorservice.vendorData(vendor);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		
		return mav;
	}
}
