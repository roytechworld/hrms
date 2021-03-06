package com.pts.procureline.service;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import java.util.List;

import org.hibernate.classic.Session;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.model.Admin;
import com.pts.procureline.model.VmsClientMaster;

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
	public  List<T> getAnyDataGenericTypeOrderByPARA(Class<? extends T> typelass,Session session,String propertyname);
	public int saveupdateAnyPojo(T pojoclass,Session session);
	public List<T> retreiveAnydataWithtwoPARAOrderBy(String fieldname ,String fieldvalue ,String orderbyPropertyfiled,final Class<? extends T> typelass,Session session);
	public List<VmsClientMaster> getClientData(Session session,String emailid);
	public String getAnyDataBasedOnOneParaByID(String fieldname ,Integer fieldvalue ,final Class<? extends T> typelass);
	public List<T> getDataInListByPassingIntegerParameter_BINDING(String fieldname ,Integer fieldvalue ,final Class<? extends T> typelass,Session session);
	public List<T> getDataInListByPassingStringParameter_BINDING(String fieldname ,String fieldvalue ,final Class<? extends T> typelass,Session session);
}
