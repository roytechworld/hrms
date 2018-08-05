package com.pts.procureline.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pts.procureline.model.Admin;
import com.pts.procureline.model.SuperAdmin;
import com.pts.procureline.model.Vendor;
import com.pts.procureline.service.AdminService;
import com.pts.procureline.service.GenericService;
import com.pts.util.DBConstant;
import com.pts.util.FileUploadToolForPTS;
import com.pts.util.MD5Convertor;

/**
 * * @author Pradipto Roy (Java Developer in PTS Development team)
 *
 * @param <T>
 */
@Controller
public class AdminController<T> {

	
//--------------------------------Auto wire and other configuration starts here----------------------------------------------------	
	@Autowired
	AdminService adminservice;
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	Admin adminobj;
	
	@Autowired
	GenericService<Admin> adservice;
	
	@Autowired
	ServletContext c;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
//--------------------------------Auto wire and other configuration ends here----------------------------------------------------	
	
	

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView addDataPage() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adminform");
		mav.addObject("message", "");	
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
	//**************************************************************************************************************
	//**************************************Admin Data fetch in table***********************************************
	//**************************************************************************************************************
	
	// Note : This method will load only first 6 records from database desc order. Other records are binded with pagination.
	//This method overcome the problem of loading large data at once and also increase the performance and speed of query fetch.
	
	
	@RequestMapping(value = "/adminreport/{pageid}")
	public ModelAndView addminreportcall(@PathVariable int pageid) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
		  session.beginTransaction().begin();
		
	      int total=6;  
	      if(pageid==0){}  
	       else
	       {  
	            pageid=(pageid)*total+1;  
	       } 
	      

		 mav.addObject("adminlist", adminservice.getAdminData(session, pageid, total));
		
	     int paginationval=adminservice.getAdminData(session).size()/total;
		  
		    List<Integer> paginationcounter=new ArrayList<Integer>();
			for(int i=0;i<paginationval;i++)
			{
				paginationcounter.add(i);
			}
		
		mav.addObject("adminlist", adminservice.getAdminData(session, pageid, total));
		mav.addObject("paginationlist", paginationcounter); 
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
		
		mav.setViewName("adminreport");
		
		return mav;
	}
	//*******************************************************************************************************************
	//**************************************Admin Data fetch in table ends***********************************************
	//*******************************************************************************************************************
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody
	String uploadFileHandler(@RequestParam("name") String name,
	@RequestParam("file") MultipartFile file,HttpServletRequest request ) {
    boolean uploadstatus=adminservice.uploadFile(name, file)	;
	return "";
    }

	
//******************************************** Admin Data save Process begins here **********************************************	
	@RequestMapping(value = "/imageupload", method = RequestMethod.POST)
	public ModelAndView showDashboard(@RequestParam("file") MultipartFile file ,HttpServletRequest request) 
	{
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{	
	    session.beginTransaction().begin();
		adminobj.setFirstName(request.getParameter("fname"));
		adminobj.setLastName(request.getParameter("lname"));
		adminobj.setAdminDesignation(request.getParameter("admin_designation"));
		adminobj.setAdminCompanyName(request.getParameter("admin_company_name"));
		adminobj.setAdminEmployeeId(request.getParameter("admin_employee_id"));
		adminobj.setAdminEmail(request.getParameter("email"));
		adminobj.setAdminPassword(MD5Convertor.getMD5Data("password"));
		adminobj.setPhoneNo(request.getParameter("phone"));
		adminobj.setFaxNo(request.getParameter("fax"));
		adminobj.setAddress(request.getParameter("address"));
		adminobj.setFile(file.getOriginalFilename());
		adminobj.setBlockStatus(1);
		adminobj.setIsAdmin(0);
		adminobj.setIsDelete(0);
		adminobj.setNamePrefix("NA");
		adminobj.setPhoneExt("0");
		adminobj.setId(0);
		adminobj.setChangePassword(1);
		adminobj.setStatus(1);
		adminobj.setForgotPasswordOtp("456");
		 java.util.Date date=new java.util.Date();
         java.sql.Date sqlDate=new java.sql.Date(date.getTime());
         java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		 adminobj.setEntryDate(sqlTime);
		 adminobj.setUpdatedDate(sqlTime);
		 adminobj.setNamePrefix(request.getParameter("name_prefix"));
		 
		int i=	adminservice.adminDatasaveup(adminobj, session);
		session.getTransaction().commit();
		if(i>0)
		{
				
			boolean uploadimage=FileUploadToolForPTS.saveFile(file,  c.getRealPath("/resources/admin/"+file.getOriginalFilename()));
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
	//******************************************** Admin Data save Process ends here **********************************************	
	
	//******************************************** Admin Data edit Brgins  here **********************************************	
	@RequestMapping(value = "/editadmin" , method = RequestMethod.POST )
	public ModelAndView editadmin(HttpServletRequest request, @RequestParam("id") String id) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println(id);
        Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();
		
		List<Admin> adminlist=adminservice.getAdminDataByEmail(session,id);
		for(Admin admin:adminlist)
		{
			adminobj=admin;
		}
		
		request.setAttribute("firstname", adminobj.getFirstName());
		
		request.setAttribute("lastname", adminobj.getLastName());
		request.setAttribute("designation", adminobj.getAdminDesignation());
		request.setAttribute("companyname", adminobj.getAdminCompanyName());
		request.setAttribute("employeeid", adminobj.getAdminEmployeeId());
		request.setAttribute("phonenumber", adminobj.getPhoneNo());
		request.setAttribute("faxno", adminobj.getFaxNo());
		request.setAttribute("address", adminobj.getAddress());
		request.setAttribute("email", adminobj.getAdminEmail());
		
		mav.addObject("admin", adminobj);	
		
		}
		catch(Exception e)
		{
			System.out.println("Exception occur"+e);
		}
		
		
		mav.setViewName("editadminform");
		
		return mav;
	}
	
	@RequestMapping(value = "/adminrecordsupdate", method = RequestMethod.POST)
	public ModelAndView adminrecordsupdate(@RequestParam("file") MultipartFile file ,HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		Session session=sessionFactory.openSession();
		try
		{
	    session.beginTransaction().begin();
	    String   query="Select * from vms_admin_master where admin_id='"+request.getParameter("id").toString()+"' order by admin_id desc";
		List<Admin> adminlist=adminservice.getAdminDataByPara(session, query);
		for(Admin admin:adminlist)
		{
			adminobj=admin;
		}
	    
		adminobj.setFirstName(request.getParameter("fname"));
		adminobj.setLastName(request.getParameter("lname"));
		adminobj.setAdminDesignation(request.getParameter("admin_designation"));
		adminobj.setAdminCompanyName(request.getParameter("admin_company_name"));
		adminobj.setAdminEmployeeId(request.getParameter("admin_employee_id"));
		adminobj.setAdminEmail(request.getParameter("email"));
		adminobj.setAdminPassword(MD5Convertor.getMD5Data("password"));
		adminobj.setPhoneNo(request.getParameter("phone"));
		adminobj.setFaxNo(request.getParameter("fax"));
		adminobj.setAddress(request.getParameter("address"));
		adminobj.setFile(file.getOriginalFilename());
		adminobj.setBlockStatus(1);
		adminobj.setIsAdmin(0);
		adminobj.setIsDelete(0);
		adminobj.setNamePrefix("NA");
		adminobj.setPhoneExt("0");
		adminobj.setId(0);
		adminobj.setChangePassword(1);
		adminobj.setStatus(1);
		adminobj.setForgotPasswordOtp("456");
		 adminobj.setNamePrefix(request.getParameter("name_prefix"));
		 java.util.Date date=new java.util.Date();
         java.sql.Date sqlDate=new java.sql.Date(date.getTime());
         java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		
		 adminobj.setEntryDate(sqlTime);
		 adminobj.setUpdatedDate(sqlTime);
		int i=	adminservice.adminDatasaveup(adminobj, session);
		session.getTransaction().commit();
		if(i>0)
		{
//			boolean uploadimage=adminservice.uploadFile(file.getOriginalFilename(), file);
			
			boolean uploadimage=FileUploadToolForPTS.saveFile(file,  c.getRealPath("/resources/admin/"+file.getOriginalFilename()));
			
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
		
		mav.setViewName("editadminform");
		return mav;
	}
	//******************************************** Admin Data ends  here **********************************************
}
