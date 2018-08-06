package com.pts.procureline.serviceimpl;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.model.Admin;

public class AdminServiceImpl implements com.pts.procureline.service.AdminService {

	private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
	@Autowired
	ServletContext c;
	
	HibernateTemplate hibernateTemplate;
	SessionFactory sessionFactory;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public int adminData(Admin admin) {
		int status = 0;
		System.out.println("admin:::::"+admin.toString());
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction().begin();
			status = (Integer) session.save(admin);
			System.out.println("status:::::"+status);

			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			sessionFactory.close();
			session.close();
		}
		return status;
	}

	@Override
	public boolean uploadFile(String name, MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

			
				String rootPath = System.getProperty("catalina.home");
						
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location=" + serverFile.getAbsolutePath());

			
			} catch (Exception e) {
				
			}
		} else {
			
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Admin> getAdminData(Session session) {
		List<Admin> slist=new ArrayList<Admin>();
		
		try
		{
			String hql = "Select * from vms_admin_master order by admin_id desc Limit 10";
			
			Query query = session.createSQLQuery((hql));
			List<Object> result = (List<Object>) query .list(); 
			Iterator<Object> itr = result.iterator();
			while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   Admin admindto=new Admin();
			   
			 admindto.setFile(obj[15].toString());
			 admindto.setFirstName(obj[4].toString());
			 admindto.setAdminCompanyName(obj[7].toString());
			 admindto.setAdminDesignation(obj[6].toString());
			 admindto.setAdminEmail(obj[9].toString());
			 admindto.setPhoneNo("NA");
			 admindto.setFaxNo("NA");
			 admindto.setAdminID(Integer.parseInt(obj[0].toString()));
			 
			 slist.add(admindto);
		

			   //same way for all obj[2], obj[3], obj[4]
			}
			
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}

		
		return slist;
	}
	@Override
	public List<Admin> getAdminData(Session session,Integer pageid,Integer total) {
		List<Admin> slist=new ArrayList<Admin>();
		
		try
		{
			String hql = "Select * from vms_admin_master order by admin_id desc Limit "+pageid+","+total;
			
			Query query = session.createSQLQuery((hql));
			List<Object> result = (List<Object>) query .list(); 
			Iterator<Object> itr = result.iterator();
			while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   Admin admindto=new Admin();
			   if(obj[15].toString().equals(""))
			   {
				   admindto.setFile("user.png");   
			   }
			   else
			   {
				   admindto.setFile(obj[15].toString());   
			   }
			
			 admindto.setFirstName(obj[4].toString());
			 admindto.setAdminCompanyName(obj[7].toString());
			 admindto.setAdminDesignation(obj[6].toString());
			 admindto.setAdminEmail(obj[9].toString());
			 admindto.setPhoneNo(obj[12].toString());
			 admindto.setFaxNo(obj[13].toString());
			 admindto.setAdminID(Integer.parseInt(obj[0].toString()));
			 
			 slist.add(admindto);
		

			   //same way for all obj[2], obj[3], obj[4]
			}
			
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}

		
		return slist;
	}
	
	
	
	
	@Override
	public int adminDatasaveup(Admin admin,Session session) {
		int status = 0;
		
		
		try {
			
			session.saveOrUpdate(admin);
			System.out.println("status:::::"+status);
            status=1;
		
			
			
			
		} catch (Exception e) {
			logger.error("Exception e"+e);
		}
		return status;
	}
	@Override
	public List<Admin> getAdminDataByEmail(Session session,String emailid)
	{
	List<Admin> slist=new ArrayList<Admin>();
		try
		{
			String hql = "Select * from vms_admin_master where admin_id='"+emailid+"' order by admin_id desc";
			
			Query query = session.createSQLQuery((hql));
			List<Object> result = (List<Object>) query .list(); 
			Iterator<Object> itr = result.iterator();
			while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   Admin admindto=new Admin();
			   
			 admindto.setFile(obj[15].toString());
			 admindto.setFirstName(obj[4].toString());
			 admindto.setAdminCompanyName(obj[7].toString());
			 admindto.setAdminDesignation(obj[6].toString());
			 admindto.setAdminEmail(obj[9].toString());
			 admindto.setPhoneNo(obj[12].toString());
			 admindto.setFaxNo(obj[13].toString());
			 admindto.setLastName(obj[5].toString());
			 admindto.setAdminEmployeeId(obj[8].toString());
			 admindto.setAddress(obj[14].toString());
			 admindto.setAdminID(Integer.parseInt(obj[0].toString()));
			 
			 slist.add(admindto);
		

			   //same way for all obj[2], obj[3], obj[4]
			}
			
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}

		
		return slist;
	}
	
	
	@Override
	public List<Admin> getAdminDataByPara(Session session,String querys)
	{
	List<Admin> slist=new ArrayList<Admin>();
		
		try
		{
			String hql =querys;
			
			Query query = session.createSQLQuery((hql));
			List<Object> result = (List<Object>) query .list(); 
			Iterator<Object> itr = result.iterator();
			while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   Admin admindto=new Admin();
			   
			 admindto.setFile(obj[15].toString());
			 admindto.setFirstName(obj[4].toString());
			 admindto.setAdminCompanyName(obj[7].toString());
			 admindto.setAdminDesignation(obj[6].toString());
			 admindto.setAdminEmail(obj[9].toString());
			 admindto.setPhoneNo("NA");
			 admindto.setFaxNo("NA");
			 admindto.setLastName(obj[5].toString());
			 admindto.setAdminEmployeeId(obj[8].toString());
			 admindto.setAddress(obj[14].toString());
			 admindto.setAdminID(Integer.parseInt(obj[0].toString()));
			 
			 slist.add(admindto);
		

			   //same way for all obj[2], obj[3], obj[4]
			}
			
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}

		
		return slist;
	}
	
}
