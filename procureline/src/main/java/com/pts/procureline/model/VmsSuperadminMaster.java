package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_superadmin_master database table.
 * 
 */
@Entity
@Table(name="vms_superadmin_master")
@NamedQuery(name="VmsSuperadminMaster.findAll", query="SELECT v FROM VmsSuperadminMaster v")
public class VmsSuperadminMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sa_id")
	private int saId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	private String file;

	@Column(name="forgot_password_otp")
	private String forgotPasswordOtp;

	@Column(name="is_delete")
	private String isDelete;

	private String password;

	@Column(name="sa_email")
	private String saEmail;

	@Column(name="sa_name")
	private String saName;

	@Column(name="sa_password")
	private String saPassword;

	private String sadminemail;

	private int sadminid;

	private String sadminname;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	public VmsSuperadminMaster() {
	}

	public int getSaId() {
		return this.saId;
	}

	public void setSaId(int saId) {
		this.saId = saId;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getForgotPasswordOtp() {
		return this.forgotPasswordOtp;
	}

	public void setForgotPasswordOtp(String forgotPasswordOtp) {
		this.forgotPasswordOtp = forgotPasswordOtp;
	}

	public String getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSaEmail() {
		return this.saEmail;
	}

	public void setSaEmail(String saEmail) {
		this.saEmail = saEmail;
	}

	public String getSaName() {
		return this.saName;
	}

	public void setSaName(String saName) {
		this.saName = saName;
	}

	public String getSaPassword() {
		return this.saPassword;
	}

	public void setSaPassword(String saPassword) {
		this.saPassword = saPassword;
	}

	public String getSadminemail() {
		return this.sadminemail;
	}

	public void setSadminemail(String sadminemail) {
		this.sadminemail = sadminemail;
	}

	public int getSadminid() {
		return this.sadminid;
	}

	public void setSadminid(int sadminid) {
		this.sadminid = sadminid;
	}

	public String getSadminname() {
		return this.sadminname;
	}

	public void setSadminname(String sadminname) {
		this.sadminname = sadminname;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}