package com.pts.procureline.serviceimpl;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.pts.procureline.model.Consultant;
import com.pts.procureline.service.ConsultantService;

public class ConsultantServiceImpl implements ConsultantService {

	HibernateTemplate hibernateTemplate;
	SessionFactory sessionFactory;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public int consultantData(Consultant consultant) {
		int status = 0;
		System.out.println("consultant:::::"+consultant.toString());
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction().begin();
			status = (Integer) session.save(consultant);
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

}
