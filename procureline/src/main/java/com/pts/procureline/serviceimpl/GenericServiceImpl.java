package com.pts.procureline.serviceimpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.model.Admin;
import com.pts.procureline.model.SuperAdmin;
import com.pts.procureline.service.GenericService;

public class GenericServiceImpl <T> implements GenericService<T> {
	private static final Logger logger = LoggerFactory.getLogger(GenericServiceImpl.class);	
	
	@Autowired
	ServletContext c;
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public boolean validateAuthenticity(String fieldname ,String fieldvalue ,final Class<? extends T> typelass,Session session)
	{
    List<T> slist=new ArrayList<T>();
		
		boolean result=false;
		
		
		try
		{
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.eq(fieldname,fieldvalue));
			slist  =cr.list();
            if(!slist.isEmpty())
            {
            	result=true;	
            }
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
	
		
		return result;
	}
	
	
	@Transactional
	@Override
	public  List<T> getDataGeneric(Class<? extends T> typelass) {
		List<T> slist=new ArrayList<T>();
		
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
		
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.eq("sa_email","sadmin@procureline.us"));
			slist  =cr.list();
			
			
			
			
			
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
		finally
		{
			
			if(session!=null)
			{
				session.clear();
				session.close();
			}
			
			
		}
		
		return slist;
	}
	
	public  int loginCheckupdate(String fieldname ,String fieldvalue,String passwordfieldname, String password ,Class<? extends T> typelass) {
		// TODO Auto-generated method stub
		int i=0;
		
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();	
		System.out.println("password found "+password);
		
		Criteria cr = session.createCriteria(typelass);
		cr.add(Restrictions.disjunction()
				
	   .add(Restrictions.eq(fieldname,fieldvalue))
	   .add(Restrictions.eq(passwordfieldname,password))	
				
			);
		
		
	   List<SuperAdmin> list=cr.list();
		
		if(!list.isEmpty())
		{
		i=1;	
		}
		
		}
		catch(Exception e)
		{
			logger.error("An Exception occur"+i);
		}
		finally
		{
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		return i;
	}

	@SuppressWarnings("unchecked")
	public  List<T> getAnyDataGenericType(Class<? extends T> typelass,Session session) {
		List<T> slist=new ArrayList<T>();

		
		try
		{
		
			Criteria cr = session.createCriteria(typelass);
			slist  =cr.list();

		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
	
		
		return slist;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<T> retreiveAnydataWithonePARA(String fieldname ,String fieldvalue ,final Class<? extends T> typelass)
	{
    List<T> slist=new ArrayList<T>();
	
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.eq(fieldname,fieldvalue));
			slist  =cr.list();
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
		finally
		{
			
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		return slist;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<T> retreiveAnydataWithonePARA_NotEqual_Mode(String fieldname ,String fieldvalue ,final Class<? extends T> typelass)
	{
    List<T> slist=new ArrayList<T>();
	
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.ne(fieldname,fieldvalue));
			slist  =cr.list();
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
		finally
		{
			
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		return slist;
	}
	@Override
	@Transactional
	public String getAnyDataBasedOnOnePara(String fieldname ,String fieldvalue ,final Class<? extends T> typelass)
	{
		String val="";
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.eq(fieldname,fieldvalue));
			List<T> list = (List<T>)cr.list();
			
		    val=	list.get(0).toString();
			
			
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
		finally
		{
			
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		return val;
	}

	public List<T> retreiveAnydataWithonePARAAnytype(String fieldname ,Object fieldvalue ,final Class<? extends T> typelass)
	{
    List<T> slist=new ArrayList<T>();
	
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.eq(fieldname,fieldvalue));
			slist  =cr.list();
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
		finally
		{
			
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		return slist;
	}
	@Override
	public List<Object> retreiveAnydataWithJoining(String querys,String para,Session session)
	{
    List<Object> slist=new ArrayList<Object>();
	
	
		try
		{
			String hql = "SELECT C.*, S.*,e.* FROM vms_project_timesheet_period C, vms_project_master S, vms_employee_master e WHERE  e.`employee_id`=C.`employee_id` AND C.status='0'";
			Query query = session.createSQLQuery(hql);
			 slist=query.list();
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
	
		
		return slist;
	}
	
	@Override
	public  boolean saveFile(MultipartFile file,String name)
	{
		
		 name=file.getOriginalFilename();
			if (!file.isEmpty()) {
				try {

					byte[] bytes = file.getBytes();

					// Creating the directory to store file
					String rootPath = System.getProperty("catalina.home");
					File dir = new File(rootPath + File.separator + "tmpFiles");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					System.out.println(c.getRealPath("/resources/"+name));
					File serverFile = new File(c.getRealPath("/resources/"+name));
				
					BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(serverFile));
					stream.write(bytes);
					stream.close();

					logger.info("Server File Location=" + serverFile.getAbsolutePath());

				} catch (Exception e) {
					
				}
			} 
			else {
			
			}
		
		return false;
	}
	@Override
	public List<T> retreiveAnydataWithonePARAUpdate(String fieldname ,String fieldvalue ,final Class<? extends T> typelass,Session session)
	{
    List<T> slist=new ArrayList<T>();
	
		
		try
		{
			Criteria cr = session.createCriteria(typelass);
			cr.add(Restrictions.eq(fieldname,fieldvalue));
			slist  =cr.list();
		}
		catch(Exception e)  
		{
		logger.info("Error" +e);	
		}
	
		
		return slist;
	}

}
