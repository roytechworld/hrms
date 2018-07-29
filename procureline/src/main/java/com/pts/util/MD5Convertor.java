package com.pts.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Convertor {
	
	public static String getMD5Data(String userpassword)
	{
        String testString=userpassword;
        
        String md5data="";
        MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			 byte[] messageDigest = md.digest(testString.getBytes());
		     BigInteger number = new BigInteger(1, messageDigest);
		     md5data = number.toString(16);
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		return md5data;
	}
	
}
