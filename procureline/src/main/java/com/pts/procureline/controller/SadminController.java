package com.pts.procureline.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.pts.procureline.dto.ProjectDto;
import com.pts.procureline.model.Admin;
import com.pts.procureline.model.Consultant;

import com.pts.procureline.model.SuperAdmin;
import com.pts.procureline.model.Vendor;
import com.pts.procureline.model.VmsEmployeeMaster;
import com.pts.procureline.model.VmsProjectMaster;
import com.pts.procureline.model.VmsProjectTimesheetPeriod;
import com.pts.procureline.service.AdminService;
import com.pts.procureline.service.GenericService;
import com.pts.procureline.service.SadminService;
import com.pts.util.DBConstant;
import com.pts.util.MD5Convertor;
import com.pts.util.OTPGenerateEngine;


@Controller
@SessionAttributes("SuperAdmin")
public class SadminController<T> extends DBConstant {
	private static final Logger logger = LoggerFactory.getLogger(SadminController.class);
	@ModelAttribute
	public SuperAdmin getSuperAdminDetails()
	{
		return new SuperAdmin();
	}
	   @ModelAttribute("user")
	   public SuperAdmin setUpUserForm() 
	   {
	      return new SuperAdmin();
	   }
	@Autowired
	List<VmsProjectTimesheetPeriod>   timesheetlist;
	   
	@Autowired
	SadminService addDataService;
	SuperAdmin sobj;
	
	@Autowired
	ProjectDto projectdto;
	
	@Autowired
	AdminService adminservice;

	@Autowired
	GenericService<SuperAdmin> superadminservice;
	
	@Autowired
	GenericService<Admin> adminservicegeneric;
	
	@Autowired
	GenericService<Vendor>vendorservicegeneric;
	
	@Autowired
	GenericService<Consultant>consultantservicegeneric;
	
	@Autowired
	GenericService<VmsEmployeeMaster>employeeservicegeneric;
	
	@Autowired
	GenericService<VmsProjectTimesheetPeriod>timesheetservice;
	
	@Autowired
	List<ProjectDto> projectdtolist;
	
	@Autowired
	VmsProjectMaster projectmaster;
	
	@Autowired
	GenericService<VmsProjectMaster> projectservice;
	
	@Autowired
	GenericService<Object> objectlist;
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	
	
	//[Registration page code:]-------------------------------------------------------------------------------
	@RequestMapping(value = "/sadmin", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		
		return mav;
	}
	
	@RequestMapping(value = "/addData", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute SuperAdmin add) {
		
		System.out.println("add::::::"+add.toString());
		addDataService.addData(add);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("dashboard");
		
		return mav;
	}
	
	
	//[Login page code:]--------------------------------------------------------------------------------------
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView somthing() {
		
	
		
		return new ModelAndView("login","command",new SuperAdmin());  
	}
	
	@RequestMapping(value = "/loginCheckold", method = RequestMethod.POST)
	public ModelAndView loginCheckold(@ModelAttribute SuperAdmin sad) {
		
		System.out.println("add::::::"+sad.toString());
		
		sad.setPassword(MD5Convertor.getMD5Data(sad.getPassword()));
		
		addDataService.loginCheck(sad);
		ModelAndView mav = new ModelAndView();
		
		
		
		if (addDataService.loginCheck(sad)!= null) {
	        System.out.println("true");
	        mav.setViewName("dashboard");
	    } else {
	        System.out.println("false");
	        mav.setViewName("login");
	    }
		//mav.setViewName("dashboard");
		
		return mav;
	}
	
	
	//******************************************************************************************************************
	//*******************************Login code ,forgot password updation started on 23.07.18***************************
	//******************************************************************************************************************
	
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST,params={"email","password","type"})
	public String loginCheck( @ModelAttribute("user") SuperAdmin user ,Model model,@RequestParam("email") String email,@RequestParam("password") String password,
			@RequestParam("type") String type) {

		int i=0;
		
		
		if(type.equalsIgnoreCase("superadmin"))
		{
			i=superadminservice.loginCheckupdate("sa_email", email, "sa_password", password, SuperAdmin.class);
			
		}
		else if(type.equalsIgnoreCase("admin"))
		{
//			i=adminservicegeneric.loginCheckupdate("admin_email", email, "admin_password", password, Admin.class);
			
			i=1;//Temporary
		}
			
		
	    if(i>0)
	    {
	    	
	    model.addAttribute("message", "Sucess ok")	;
	    }
	    else
	    {
	    model.addAttribute("message", "error")	;	
	    }

	
		return "message";
	}
	
	@RequestMapping(value = "/dash", method = RequestMethod.POST)
	public ModelAndView showDashboard(@ModelAttribute("user") SuperAdmin user, HttpServletRequest request ) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println("type found"+request.getParameter("type"));
		String redirectpage="";
		String sa_email="";
		sa_email=user.getSa_email();
		Session session=sessionFactory.openSession();
		
		try
		{
		session.beginTransaction().begin();
		
		if(request.getParameter("type").toString().equalsIgnoreCase("superadmin"))
		{
			
			
			boolean checkUserSuperAdminAuthenticity=superadminservice.validateAuthenticity("sa_email",sa_email, SuperAdmin.class,session);
			if(checkUserSuperAdminAuthenticity)
			{
				mav.addObject("admincount", adminservice.getAdminData(session).size());
				mav.addObject("vendorcount", vendorservicegeneric.getAnyDataGenericType(Vendor.class,session).size());
				mav.addObject("consultantcount", consultantservicegeneric.getAnyDataGenericType(Consultant.class,session).size());
				mav.addObject("employeecount", employeeservicegeneric.getAnyDataGenericType(VmsEmployeeMaster.class,session).size());
				
				//Work pending will be completed later 
				/*
				List<Object> list=objectlist.retreiveAnydataWithJoining("", "",session);
				
				Iterator<Object> itr=list.iterator();
				while (itr.hasNext()) 
				{
					ProjectDto dto=new ProjectDto();
				    Object rows[] = (Object[])itr.next();
					
					dto.setTimesheetid(rows[3].toString());
					dto.setProjectcode(rows[14].toString());
					dto.setProjectname(rows[18].toString());
					dto.setCode(rows[35].toString());
					dto.setName(rows[37].toString());
					dto.setType(rows[17].toString());
					dto.setStartdate("NA");
					dto.setEnddate("NA");
					dto.setSt("NA");
					dto.setName("NA");
					dto.setTimesheetstatus("Pending");
					projectdtolist.add(dto);
				}
			
				System.out.println(projectdtolist.size());
				
				*/
				
				mav.addObject("stlist", projectdtolist);
				mav.setViewName(redirectpage="dashboard");
				
				
				session.getTransaction().commit();
			}
			else
			{
			mav.addObject("message", "<b "+fontstyleforerror+">Invalid Authentication !!</b>");		
			mav.setViewName("login");
			}

		}
		else if(request.getParameter("type").toString().equalsIgnoreCase("admin"))
		{
			boolean checkUserSuperAdminAuthenticity=adminservicegeneric.validateAuthenticity("admin_email",sa_email, Admin.class,session);
			if(checkUserSuperAdminAuthenticity)
			{
				redirectpage="admindashboard";
				mav.setViewName(redirectpage);
			}
			else
			{
			mav.addObject("message", "<b "+fontstyleforerror+">Invalid Authentication !!</b>");		
			mav.setViewName("login");
			}
		}
		else if(request.getParameter("type").toString().equalsIgnoreCase("consultant"))
		{
			redirectpage="consultant";
			mav.setViewName(redirectpage);
		}
		
		else if(request.getParameter("type").toString().equalsIgnoreCase("employee"))
		{
			redirectpage="emloyeedashboard";
			mav.setViewName(redirectpage);
		}
		}
		catch(Exception e)
		{
			session.getTransaction().rollback();
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
			
		return mav;
	}
	
	@RequestMapping(value = "/forgotpasscall", method = RequestMethod.GET)
	public ModelAndView forgotpasscall(HttpServletRequest request ) {
		
	
		ModelAndView mav = new ModelAndView();
		mav.setViewName("forgotpass");
		mav.addObject("message", "");
		
		return mav;
	}
	
	@RequestMapping(value = "/forgotoperation", method = RequestMethod.POST)
	public ModelAndView forgotoperation(HttpServletRequest request ) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("email",request.getParameter("sadminemail"))	;
		
		SuperAdmin sobj=addDataService.getSuperAdminData(request.getParameter("sadminemail"), sdamindatabyemail);
		
		boolean validation=false;
		
		if(sobj!=null)
		{
			
			sobj.setForgot_password_otp(OTPGenerateEngine.generateOTP());
			int i=addDataService.addData(sobj);
			if(i>0)
			{
			
			mav.addObject("message", "<b "+fontstylesuccess+"> OTP sent in your registered email id !! </b>");		
			validation=true;
			}
			else
			{
			mav.addObject("message", "<b "+fontstyleforerror+">Otp not generated !!</b>");	
			validation=false;
			}

		}
		else
		{
			mav.addObject("message", "<b "+fontstyleforerror+"> This email is not registered !!</b>");	
			validation=false;
		}
		
		if(validation)
		{
		mav.setViewName("forgotpasssuccess");	
		}
		else
		{
		mav.setViewName("forgotpass");		
		}

		return mav;
	}
	
	
	@RequestMapping(value = "/otpvalidate", method = RequestMethod.POST)
	public ModelAndView otpvalidate(HttpServletRequest request ) {
		
		boolean validation=false;
		ModelAndView mav = new ModelAndView();
		mav.addObject("email",request.getParameter("email"))	;	
		if(addDataService.getSuperAdminDataByOTPANDEMAIL(request.getParameter("otp"), request.getParameter("email"), sdamindatabyemailandOtp)!=null)
		{
		
			mav.addObject("message", "<b "+fontstylesuccess+"> </b>");	
			validation=true;
		}
		else
		{
			mav.addObject("message", "<b "+fontstyleforerror+">  Wrong otp entered!! </b>");	
			validation=false;	
		}
		if(validation)
		{
			
		mav.setViewName("newPassword");	
		}
		else
		{
		mav.addObject("message", "<b "+fontstyleforerror+">  Wrong otp entered !! </b>");		
		mav.setViewName("forgotpasssuccess");		
		}
	
		
		return mav;
	}
	
	@RequestMapping(value = "/newpasswordcr", method = RequestMethod.POST)
	public ModelAndView newpasswordcr(HttpServletRequest request ) {
		
		boolean validation=false;
		ModelAndView mav = new ModelAndView();
		sobj=addDataService.getSuperAdminData( request.getParameter("email"),sdamindatabyemail);
		if(sobj!=null)
		{
			sobj.setSa_password(MD5Convertor.getMD5Data(request.getParameter("password")));
			int i=addDataService.addData(sobj);
			if(i>0)
			{
			validation=true;
			}
			else
			{
			mav.addObject("message", "<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Password updation un successfull try again !!</b>");	
			validation=false;
			}
			mav.addObject("message", "<b style=color:green;font-size:15px;font-family: Arial, Helvetica, sans-serif;>  </b>");	
			validation=true;
		}
		else
		{
			mav.addObject("message", "<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;> Password updation un successfull try again !! </b>");	
			validation=false;	
		}
		if(validation)
		{
		mav.addObject("message", "<b style=color:green;font-size:15px;font-family: Arial, Helvetica, sans-serif;> Your password is updated sucessfully. <br/> We are redirecting you to Login page !! </b>");		
		mav.setViewName("passwordcomplete");	
		}
		else
		{
		mav.addObject("message", "<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>  Password updation un successfull try again !! </b>");		
		mav.setViewName("forgotpass");		
		}
	
		return mav;
	}
	

	//******************************************************************************************************************
	//*******************************Login code ,forgot password ends here *********************************************
	//******************************************************************************************************************	
	

}
