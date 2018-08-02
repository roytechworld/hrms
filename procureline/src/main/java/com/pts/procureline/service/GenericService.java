package com.pts.procureline.service;

import java.util.List;

import org.hibernate.classic.Session;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.model.Admin;

public interface GenericService <T>{
	public boolean validateAuthenticity(String fieldname ,String fieldvalue ,final Class<? extends T> typelass,Session session);
	public List<T> getDataGeneric(Class<? extends T> typelass) ;
	public  int loginCheckupdate(String fieldname ,String fieldvalue,String passwordfieldname, String password ,Class<? extends T> typelass);
	public  List<T> getAnyDataGenericType(Class<? extends T> typelass,Session session);
	public List<T> retreiveAnydataWithonePARA(String fieldname ,String fieldvalue ,final Class<? extends T> typelass);
	public List<T> retreiveAnydataWithonePARA_NotEqual_Mode(String fieldname ,String fieldvalue ,final Class<? extends T> typelass);
	public String getAnyDataBasedOnOnePara(String fieldname ,String fieldvalue ,final Class<? extends T> typelass);
	public List<T> retreiveAnydataWithonePARAAnytype(String fieldname ,Object fieldvalue ,final Class<? extends T> typelass);
	public List<Object> retreiveAnydataWithJoining(String querys,String para,Session session);
	public  boolean saveFile(MultipartFile file,String name);
	public List<T> retreiveAnydataWithonePARAUpdate(String fieldname ,String fieldvalue ,final Class<? extends T> typelass,Session session);
}
