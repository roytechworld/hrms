package com.pts.procureline.serviceimpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.model.Admin;

public class AdminServiceImpl implements com.pts.procureline.service.AdminService {

	private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
	
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
	public String uploadFile(String name, MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				//String rootPath="E:/WorkSpace/procureline/src/main/webapp/WEB-INF/uploadFile";
				
				
						
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name
					+ " because the file was empty.";
		}
	}
	
	@Transactional
	@Override
	public List<Admin> getAdminData() {
		List<Admin> slist=new ArrayList<Admin>();
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		try
		{
		
			Criteria cr = session.createCriteria(Admin.class);
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
