package com.pts.util;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
public class DBConstant {
	//Server query
	public static final String logincheckquery="from SuperAdmin where sa_email=:email And sa_password=:password";
	public static final String sdamindatabyemail="from SuperAdmin where sa_email=:email";
	public static final String sdamindatabyemailandOtp="from SuperAdmin where sa_email=:email and forgot_password_otp=:otp";
	public static final String sdamindatabypassword="from SuperAdmin where sa_password=:password";
	
	//Server CSS
	public static final String fontstyleforerror="style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;";
	public static final String fontstylesuccess="style=color:green;font-size:15px;font-family: Arial, Helvetica, sans-serif;";
	
	//Path variable for admin
	public static final String imageupload="resources/admin/";

}
