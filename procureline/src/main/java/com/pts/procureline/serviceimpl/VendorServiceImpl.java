package com.pts.procureline.serviceimpl;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.pts.procureline.controller.VendorController;
import com.pts.procureline.model.Admin;
import com.pts.procureline.model.Vendor;
import com.pts.procureline.model.VmsVendorMaster;
import com.pts.procureline.service.VendorService;

public class VendorServiceImpl implements VendorService {
	private static final Logger logger = LoggerFactory.getLogger(VendorController.class);
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
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<VmsVendorMaster> getvendorData(Session session) {
		List<VmsVendorMaster> slist=new ArrayList<VmsVendorMaster>();
		
		try
		{
			String hql = "Select * from vms_vendor_master order by vendor_id desc";
			
			Query query = session.createSQLQuery((hql));
			List<Object> result = (List<Object>) query .list(); 
			Iterator<Object> itr = result.iterator();
			while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   VmsVendorMaster admindto=new VmsVendorMaster();
			/*   
			 admindto.setFile(obj[15].toString());
			 admindto.setFirstName(obj[4].toString());
			 admindto.setAdminCompanyName(obj[7].toString());
			 admindto.setAdminDesignation(obj[6].toString());
			 admindto.setAdminEmail(obj[9].toString());
			 admindto.setPhoneNo("NA");
			 admindto.setFaxNo("NA");
			 
			 slist.add(admindto);
		*/

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
	public int vendorDatasaveup(Vendor admin,Session session) {
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
	
}
