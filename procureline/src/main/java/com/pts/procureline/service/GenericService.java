package com.pts.procureline.service;

import java.util.List;

import com.pts.procureline.model.Admin;

public interface GenericService <T>{
	public boolean validateAuthenticity(String fieldname,String fieldvalue ,final Class<? extends T> typelass);
	public List<T> getDataGeneric(Class<? extends T> typelass) ;
	public  int loginCheckupdate(String fieldname ,String fieldvalue,String passwordfieldname, String password ,Class<? extends T> typelass);
	public  List<T> getAnyDataGenericType(Class<? extends T> typelass);
}
