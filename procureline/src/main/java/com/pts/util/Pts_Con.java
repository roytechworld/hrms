package com.pts.util;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class Pts_Con {
	
	@Autowired
	static SessionFactory sessionFactory;

	@Autowired
	static Session session;
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		Pts_Con.sessionFactory = sessionFactory;
	}
	
	public static Session getSession()
	{
		session=sessionFactory.getCurrentSession();
		if(session==null)
		{
		session.beginTransaction().begin();
		}
		return session;
	}
}
