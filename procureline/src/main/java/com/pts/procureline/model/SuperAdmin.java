package com.pts.procureline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="vms_superadmin_master")
public class SuperAdmin {

	@Id
	@Column
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sa_id;
	@Column
	private String sa_name;
	@Column
	private String sa_email;
	@Column
	private String sa_password;
	
	@Column
	private String forgot_password_otp;
	
	@Column
	private String file;
	
	@Column
	private String entry_date;
	
	@Column
	private String is_delete;

	@Column
	private String sadminid;
	
	@Column
	private String password;
	
	@Column
	private String sadminemail;
	
	@Column
	private String sadminname;
	
	
	
	public int getSa_id() {
		return sa_id;
	}


	public void setSa_id(int sa_id) {
		this.sa_id = sa_id;
	}


	public String getSa_name() {
		return sa_name;
	}


	public void setSa_name(String sa_name) {
		this.sa_name = sa_name;
	}


	public String getSa_email() {
		return sa_email;
	}


	public void setSa_email(String sa_email) {
		this.sa_email = sa_email;
	}



	public String getSa_password() {
		return sa_password;
	}


	public void setSa_password(String sa_password) {
		this.sa_password = sa_password;
	}


	public String getForgot_password_otp() {
		return forgot_password_otp;
	}



	public void setForgot_password_otp(String forgot_password_otp) {
		this.forgot_password_otp = forgot_password_otp;
	}

	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	public String getEntry_date() {
		return entry_date;
	}


	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}


	public String getIs_delete() {
		return is_delete;
	}


	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}


	public String getSadminid() {
		return sadminid;
	}


	public void setSadminid(String sadminid) {
		this.sadminid = sadminid;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getSadminemail() {
		return sadminemail;
	}

	public void setSadminemail(String sadminemail) {
		this.sadminemail = sadminemail;
	}


	public String getSadminname() {
		return sadminname;
	}


	public void setSadminname(String sadminname) {
		this.sadminname = sadminname;
	}


	@Override
	public String toString() {
		return "SuperAdmin [sa_id=" + sa_id + ", sa_name=" + sa_name + ", sa_email=" + sa_email + ", sa_password="
				+ sa_password + ", forgot_password_otp=" + forgot_password_otp + ", file=" + file + ", entry_date="
				+ entry_date + ", is_delete=" + is_delete + ", sadminid=" + sadminid + ", password=" + password
				+ ", sadminemail=" + sadminemail + ", sadminname=" + sadminname + "]";
	}



	public SuperAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}







}
