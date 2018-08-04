package com.pts.procureline.controller;

import java.math.BigInteger;
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

import com.pts.procureline.model.Employee;
import com.pts.procureline.model.Vendor;
import com.pts.procureline.model.VmsClientMaster;
import com.pts.procureline.model.VmsEmployeeMaster;
import com.pts.procureline.service.AdminService;
import com.pts.procureline.service.EmployeeService;
import com.pts.procureline.service.GenericService;
import com.pts.util.MD5Convertor;

/**
 * @author  * @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	GenericService<VmsEmployeeMaster>employeeservicegeneric;
	
	@Autowired
	GenericService<Vendor>vendorgenericservice;
	
	@Autowired
	GenericService<VmsClientMaster>clientservice;
	
	@Autowired
	VmsEmployeeMaster propertyobj;
	
	@Autowired
	List<VmsEmployeeMaster> propertyobjlist;
	
	@Autowired 
	AdminService adminservice;
	
	
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
		
		mav.addObject("consultantlist", employeeservicegeneric.retreiveAnydataWithtwoPARAOrderBy("employeeType", "C","employeeId", VmsEmployeeMaster.class, session));
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
	
	@RequestMapping(value = "/consultantaddCall", method = RequestMethod.GET)
	public ModelAndView consultanAddcall(@ModelAttribute Vendor vendor) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		mav.addObject("vendorlist", vendorgenericservice.getAnyDataGenericTypeOrderByPARA(Vendor.class, session, "vendorId"));
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
		
		mav.setViewName("addConsultantForm");
		
		return mav;
	}
	
	@RequestMapping(value = "/employeeaddCall", method = RequestMethod.GET)
	public ModelAndView employeeaddCall(@ModelAttribute Vendor vendor) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();

		mav.addObject("clientlist", clientservice.getClientData(session, ""));
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
		
		mav.setViewName("addEmployeeForm");
		return mav;
	}
	

	@RequestMapping(value = "/consultadd", method = RequestMethod.POST)
	public ModelAndView showDashboard(@RequestParam("file") MultipartFile[] files ,HttpServletRequest request) 
	{
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		java.util.Date date=new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		
    	try
		{
    	session.beginTransaction().begin();	
		String photo=files[0].getOriginalFilename();
		String doc=files[1].getOriginalFilename();
		propertyobj.setFirstName(request.getParameter("fname"));
		propertyobj.setLastName(request.getParameter("lname"));
		propertyobj.setAdminId(0);
		propertyobj.setClientId(0);
		propertyobj.setEmployeeEmail("Not Recorded");
		propertyobj.setEmployeeCode("Not Generated");
		propertyobj.setNamePrefix("Not Recorded");
		propertyobj.setEmployeeType("C");
		propertyobj.setEmployeeDesignation("Not Recorded");
		propertyobj.setEmployeeCategory(request.getParameter("category"));
		propertyobj.setPhoneExt(0);
		propertyobj.setPhoneNo(new BigInteger(request.getParameter("phoneno")));
		propertyobj.setFaxNo(Integer.parseInt(request.getParameter("fax")));
		propertyobj.setAddress(request.getParameter("address"));
		propertyobj.setResumeFile(doc);
		propertyobj.setFile(photo);
		propertyobj.setPayStaffFile("Not recorded");
		propertyobj.setW2File("Not recorded");
		propertyobj.setDateOfJoining("0000-00-00");
		propertyobj.setEmployeeBillRate(request.getParameter("billrate"));
		propertyobj.setEmployeePayRate("Not recorded");
		propertyobj.setEmpBillRateType("Not recorded");
		propertyobj.setEmpPayRateType("Not recorded");
		propertyobj.setEmployeeOtRate("Not recorded");
		propertyobj.setVEmployeeBillRate("Not recorded");
		propertyobj.setStatus("0");
		propertyobj.setBlockStatus("0");
		propertyobj.setEntryDate("0000-00-00 00:00:00");
		propertyobj.setUpdatedDate("0000-00-00 00:00:00");
		propertyobj.setForgotPasswordOtp("");
		propertyobj.setIsDelete("0");
		propertyobj.setEmployeeId(0);
		propertyobj.setEmployeeAddress(request.getParameter("address"));
		propertyobj.setEmployeeEmail("Not Recorded");

		int saveresult=employeeservicegeneric.saveupdateAnyPojo(propertyobj, session);
		if(saveresult>0)
		{
			
		for(MultipartFile file:files)
		{
		
		boolean uploadimage=employeeservicegeneric.saveFile(file, file.getOriginalFilename());

		}
		mav.addObject("message", "Sucess ok");	
		
		}
		else
		{
		mav.addObject("message", "error");	
		}
        session.getTransaction().commit();
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
		
		mav.setViewName("addConsultantForm");
		return mav;
	}
	
	
	
	
	@RequestMapping(value = "/employeereport", method = RequestMethod.GET)
	public ModelAndView employeereport(@ModelAttribute Vendor vendor) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		List<VmsEmployeeMaster> plist=employeeservicegeneric.retreiveAnydataWithtwoPARAOrderBy("employeeType", "E","employeeId", VmsEmployeeMaster.class, session);
		/*
		for(VmsEmployeeMaster v:plist)
		{
			
		//Binding task pending	
			
		}
		*/
		
		mav.addObject("employeelist", plist);
		
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
		
		mav.setViewName("employeereport");
		
		return mav;
	}
	
}
