package com.pts.procureline.serviceimpl;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.pts.procureline.model.Employee;
import com.pts.procureline.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	HibernateTemplate hibernateTemplate;
	SessionFactory sessionFactory;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public int employeeData(Employee emp) {
		int status = 0;
		System.out.println("emp:::::"+emp.toString());
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction().begin();
			status = (Integer) session.save(emp);
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
