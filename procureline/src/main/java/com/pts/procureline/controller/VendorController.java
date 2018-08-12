package com.pts.procureline.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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

import com.pts.procureline.service.AdminService;
import com.pts.procureline.service.GenericService;
import com.pts.procureline.service.VendorService;
import com.pts.util.MD5Convertor;

/**
 * @author Pradipto Roy java developer in PTS development team
 *
 */
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
	GenericService<Admin> admingenservice;
	
	
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
		List<Vendor> vbindedlist=new ArrayList<Vendor>();
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		
		for(Vendor h: vendorservicegeneric.getAnyDataGenericType(Vendor.class,session))
		{
		List<Admin> admindto=	admingenservice.retreiveAnydataWithonePARAUpdate
		("adminID", h.getAdminId()+"", Admin.class, session);
		
		
		System.out.println("Admin name found "+ admindto.get(0).getFirstName()+" "+admindto.get(0).getLastName());	
		
	
		h.setAdminname(admindto.get(0).getFirstName()+" "+admindto.get(0).getLastName());
		
		vbindedlist.add(h);
			
		}
		
		
		mav.addObject("vendorlist", vbindedlist);
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
	
	
	
	@RequestMapping(value = "/vdadds", method = RequestMethod.POST)
	public ModelAndView vdadds(@RequestParam("file") MultipartFile file ,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		Vendor adminobj=new Vendor();
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
		adminobj.setNamePrefix("MR");
		adminobj.setFederalTaxId("0");
		
		adminobj.setCountry(0);
		adminobj.setState(0);
		adminobj.setCity(0);
		adminobj.setPhoneExt(0);
		adminobj.setPhoneNo(new BigInteger("0"));
		adminobj.setFaxNo(new BigInteger("0"));
		adminobj.setAddress("");
		adminobj.setRemittanceAddress("");
		adminobj.setMainContactPerson(request.getParameter("fname"));
		adminobj.setMainEmailAddress(request.getParameter("email"));
		adminobj.setMainPhoneNo("");
		adminobj.setBillingContactPerson("");
		adminobj.setBillingEmailAddress(request.getParameter("email"));
		adminobj.setBillingPhoneNo("");
		adminobj.setAdditionalContactPerson("");
		adminobj.setAdditionalEmailAddress("");
		adminobj.setAdditionalPhoneNo("");
		adminobj.setClientSupportCal("0");
		adminobj.setClientSupportCalFile("");
		adminobj.setClientSupportPen("0");
		adminobj.setClientSupportPenFile("");
		adminobj.setClientSupportPu("0");
		adminobj.setClientSupportPuFile("");
		adminobj.setNmsdc("0");
		adminobj.setNmsdcFile("");
		adminobj.setWbenc("0");
		adminobj.setWbencFile("");
		adminobj.setSba("0");
		adminobj.setSbaFile("");
		adminobj.setVetbiz("0");
		adminobj.setVetbizFile("");
		adminobj.setNglcc("0");
		adminobj.setNglccFile("");
		adminobj.setPhoto("");
		adminobj.setContractToDate(sqlTime);
		adminobj.setEntryDate(sqlTime);
		adminobj.setUpdatedDate(sqlTime);
		adminobj.setStatus("0");
		adminobj.setBlockStatus("0");
		adminobj.setChangePassword("0");
		adminobj.setRegCode("");
		adminobj.setRegVerification("0");
		adminobj.setForgotPasswordOtp("");
		adminobj.setIsDelete("0");
		adminobj.setCompanyId(request.getParameter("vendor_company_name"));
		adminobj.setAdminId(Integer.parseInt(request.getParameter("adminrecord")));
	
		int i=	vendorservicegeneric.saveupdateAnyPojo(adminobj, session);
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
		

		mav.setViewName("vendorform");
		return mav;
		
	}
	
	
	@RequestMapping(value = "/vendorEdit", method = RequestMethod.POST)
	public ModelAndView vendorEditProcess(HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println("ID found "+request.getParameter("sentid"));
        Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
			
		for(Vendor v:vendorservicegeneric.retreiveAnydataWithonePARAUpdate
		("vendorId", request.getParameter("sentid").toString(), 
		Vendor.class,session)) {adminobj=v;}

/*
		request.setAttribute("firstname", dtoObj.getFirstName());
		request.setAttribute("lastname", dtoObj.getLastName());
		request.setAttribute("designation", dtoObj.getVendorDesignation());
		request.setAttribute("companyname", dtoObj.getVendorCompanyName());
		request.setAttribute("employeeid", dtoObj.getAdminEmployeeId());
		request.setAttribute("phonenumber", dtoObj.getPhoneNo());
		request.setAttribute("faxno", dtoObj.getFaxNo());
		request.setAttribute("address", dtoObj.getAddress());
		request.setAttribute("email", dtoObj.getAdminEmail());
*/

		
		
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}

		mav.setViewName("vendoredit");
		return mav;
	}
	
	
	
	
}
