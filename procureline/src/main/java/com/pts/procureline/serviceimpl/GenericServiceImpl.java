package com.pts.procureline.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.pts.procureline.model.Admin;
import com.pts.procureline.model.SuperAdmin;
import com.pts.procureline.service.GenericService;

public class GenericServiceImpl <T> implements GenericService<T> {
	private static final Logger logger = LoggerFactory.getLogger(GenericServiceImpl.class);	
	
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
	public boolean validateAuthenticity(String fieldname ,String fieldvalue ,final Class<? extends T> typelass)
	{
    List<T> slist=new ArrayList<T>();
		
		boolean result=false;
		
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
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
		finally
		{
			
			if(session!=null)
			{
				session.clear();
				session.close();
			}
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

	public  List<T> getAnyDataGenericType(Class<? extends T> typelass) {
		List<T> slist=new ArrayList<T>();
		
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
		
			Criteria cr = session.createCriteria(typelass);
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

}
