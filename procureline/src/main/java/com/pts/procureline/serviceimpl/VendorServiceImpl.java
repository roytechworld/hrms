package com.pts.procureline.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.pts.procureline.model.Vendor;
import com.pts.procureline.service.VendorService;

public class VendorServiceImpl implements VendorService {
	
	HibernateTemplate hibernateTemplate;
	SessionFactory sessionFactory;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public int vendorData(Vendor vndor) {
		int status = 0;
		System.out.println("vndor:::::"+vndor.toString());
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction().begin();
			status = (Integer) session.save(vndor);
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
