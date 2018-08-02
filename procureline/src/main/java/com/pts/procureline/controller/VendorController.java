package com.pts.procureline.controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
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
import com.pts.procureline.model.Vendor;
import com.pts.procureline.model.VmsVendorMaster;
import com.pts.procureline.service.AdminService;
import com.pts.procureline.service.GenericService;
import com.pts.procureline.service.VendorService;
import com.pts.util.MD5Convertor;

@Controller
public class VendorController {

	@Autowired
	VendorService vendorservice;
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Autowired
	Vendor adminobj;

	@Autowired
	AdminService adminservice;
	
	@Autowired
	GenericService<Vendor>vendorservicegeneric;
	private static final Logger logger = LoggerFactory.getLogger(VendorController.class);
	
	
	@RequestMapping(value = "/vendor", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		
		mav.addObject("adminlist", adminservice.getAdminData(session));
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
	@RequestMapping(value = "/vendorreport", method = RequestMethod.GET)
	public ModelAndView vendorreport(@ModelAttribute Vendor vendor) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		
		for(Vendor h: vendorservicegeneric.getAnyDataGenericType(Vendor.class,session))
		{
			
		}
		
		
		mav.addObject("vendorlist", vendorservicegeneric.getAnyDataGenericType(Vendor.class,session));
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
		
		mav.setViewName("vendorreport");
		
		return mav;
	}
	
	
	
	
	@RequestMapping(value = "/vendoradd", method = RequestMethod.POST)
	public ModelAndView vendoradd(@RequestParam("file") MultipartFile file ,HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
	    session.beginTransaction().begin();
		adminobj.setFirstName(request.getParameter("first_name"));
		adminobj.setLastName(request.getParameter("last_name"));
		adminobj.setVendorDesignation(request.getParameter("vendor_designation"));
		adminobj.setVendorCompanyName(request.getParameter("vendor_company_name"));
		
		adminobj.setVendorEmail(request.getParameter("vendor_email"));
		adminobj.setVendorPassword(MD5Convertor.getMD5Data("password"));

		adminobj.setForgotPasswordOtp("456");
		
		 java.util.Date date=new java.util.Date();
         
         java.sql.Date sqlDate=new java.sql.Date(date.getTime());
         java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		
		 adminobj.setContractFromDate(sqlTime);
		 adminobj.setUpdatedDate(sqlTime);
		
		int i=	vendorservice.vendorData(adminobj);
		session.getTransaction().commit();
		if(i>0)
		{
			boolean uploadimage=adminservice.uploadFile(file.getOriginalFilename(), file);
			mav.addObject("message", "Sucess ok");	
		}
		else
		{
			mav.addObject("message", "error");	
		}
		}
		catch(Exception e)
		{
			session.getTransaction().rollback();
			mav.addObject("message", "error");	
			System.out.println("Exception occur"+e);
		}
		finally
		{
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		mav.setViewName("adminform");
		return mav;
	}
	
	
	
	@RequestMapping(value = "/vdadd", method = RequestMethod.POST)
	public ModelAndView vdadds(@RequestParam("file") MultipartFile file ,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
	    session.beginTransaction().begin();
		adminobj.setFirstName(request.getParameter("fname"));
		adminobj.setLastName(request.getParameter("lname"));
		adminobj.setVendorDesignation(request.getParameter("vendor_designation"));
		adminobj.setVendorCompanyName(request.getParameter("vendor_company_name"));
		
		adminobj.setVendorEmail(request.getParameter("email"));
		adminobj.setVendorPassword(MD5Convertor.getMD5Data("password"));

		adminobj.setForgotPasswordOtp("456");
		
		 java.util.Date date=new java.util.Date();
         
         java.sql.Date sqlDate=new java.sql.Date(date.getTime());
         java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		
		 adminobj.setContractFromDate(sqlTime);
		 adminobj.setUpdatedDate(sqlTime);
		
		int i=	vendorservice.vendorDatasaveup(adminobj,session);
		session.getTransaction().commit();
		if(i>0)
		{
			boolean uploadimage=adminservice.uploadFile(file.getOriginalFilename(), file);
			mav.addObject("message", "Sucess ok");	
		}
		else
		{
			mav.addObject("message", "error");	
		}
		}
		catch(Exception e)
		{
			session.getTransaction().rollback();
			mav.addObject("message", "error");	
			System.out.println("Exception occur"+e);
		}
		finally
		{
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		

		mav.setViewName("adminform");
		return mav;
		
	}
	
	
	
}
