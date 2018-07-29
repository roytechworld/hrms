package com.pts.procureline.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.model.Admin;
@Transactional
@Service
public interface AdminService {

	public int adminData(Admin admin);
	public String uploadFile(String name,MultipartFile file);
	
	public List<Admin> getAdminData();
}
