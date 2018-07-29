package com.pts.procureline.service;

import org.springframework.stereotype.Service;

import com.pts.procureline.model.SuperAdmin;

@Service
public interface SadminService {
	
	public int addData(SuperAdmin add);
	public SuperAdmin loginCheck(SuperAdmin sad);
	public int loginCheckupdate(String email,String password,String query);
	public SuperAdmin getSuperAdminData(String email,String query);
	public SuperAdmin getSuperAdminDataByOTPANDEMAIL(String OTP, String email, String query);
	
	
}
