package com.pts.procureline.service;

import java.util.List;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.pts.procureline.model.Admin;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
@Transactional
@Service
public interface AdminService {

	public int adminData(Admin admin);
	public boolean uploadFile(String name,MultipartFile file);
	public int adminDatasaveup(Admin admin,Session session) ;
	public List<Admin> getAdminData(Session session);
	public List<Admin> getAdminDataByEmail(Session session,String emailid);
	public List<Admin> getAdminDataByPara(Session session,String query);
}
