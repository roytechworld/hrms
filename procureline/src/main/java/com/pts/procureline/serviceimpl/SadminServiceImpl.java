package com.pts.procureline.serviceimpl;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.pts.procureline.model.SuperAdmin;
import com.pts.procureline.service.SadminService;

public class SadminServiceImpl implements SadminService {
	private static final Logger logger = LoggerFactory.getLogger(SadminServiceImpl.class);
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Autowired
	SessionFactory sessionFactory;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int addData(SuperAdmin add) {
		int status = 0;
		System.out.println("add:::::"+add.toString());
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction().begin();
			session.saveOrUpdate(add);
			status=1;
			System.out.println("status:::::"+status);

			session.flush();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		finally
		{
			if(session !=null)
			{
				session.clear();
				session.close();
			}
		}
		return status;
	}

	@Override
	public SuperAdmin loginCheck(SuperAdmin sad) {
		SuperAdmin status = null;
		System.out.println("add:::::"+sad.toString());
		Session session = sessionFactory.openSession();
		String hql="from SuperAdmin log where log.sadminemail=:sadminemail and log.password=:password";
		//String hql="select count(*) from SuperAdmin log where log.sadminemail=:sadminemail and log.password=:password";
		try {
			session.beginTransaction().begin();
			System.out.println(hql);
			
			Query query=session.createQuery(hql);
			query.setParameter("sadminemail", sad.getSadminemail());
			query.setParameter("password",    sad.getPassword());
			status=(SuperAdmin) query.uniqueResult();
			System.out.println("status" +status);
			
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
	@Transactional
	public int loginCheckupdate(String email, String password ,String query) {
		// TODO Auto-generated method stub
		int i=0;
		Session session=sessionFactory.openSession();
		try
		{
		session.beginTransaction().begin();	


		
		System.out.println("password found "+password);
		
		SuperAdmin sobj=(SuperAdmin)session.createQuery(query).setString("email", email).setString("password", password.toString()).uniqueResult();
		
		System.out.println(sobj);
		if(sobj!=null)	
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

	@Override
	public SuperAdmin getSuperAdminData(String email, String query) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		SuperAdmin sobj=new SuperAdmin();
		try
		{
		session.beginTransaction().begin();	
		logger.info("email"+email);	
		
		sobj=(SuperAdmin)
		session.createQuery(query)
	   .setString("email", email).uniqueResult();
		
		
		
		logger.info("connection check password get from cloud database : "+sobj.getSa_password());
		}
		catch(Exception e)
		{
			logger.error("An Exception occur"+e);
		}
		finally
		{
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		return sobj;
	}

	@Override
	public SuperAdmin getSuperAdminDataByOTPANDEMAIL(String OTP, String email, String query) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		SuperAdmin sobj=new SuperAdmin();
		try
		{
		session.beginTransaction().begin();	
		logger.info("email"+email);	
		
		sobj=(SuperAdmin)
		session.createQuery(query)
	   .setString("email", email).setString("otp", OTP)
	   .uniqueResult();
		
		}
		catch(Exception e)
		{
			logger.error("An Exception occur"+e);
		}
		finally
		{
			if(session!=null)
			{
				session.clear();
				session.close();
			}
		}
		
		return sobj;
	}
	

	

	
}
