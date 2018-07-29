package com.pts.procureline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vms_admin_master")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@Column(name="admin_id")
	private int adminID;
	@Column(name="sa_id")
	private int saId;
	@Column(name="admin_type_id")
	private int adminTypeId;
	
	@Column(name="name_prefix")
	private String namePrefix;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="admin_designation")
	private String adminDesignation;
	@Column(name="admin_company_name")
	private String adminCompanyName;
	@Column(name="admin_employee_id")
	private String adminEmployeeId;
	@Column(name="admin_email")
	private String adminEmail;
	@Column(name="admin_password")
	private String adminPassword;
	@Column(name="confirm_password")
	private String confirmPassword;
	@Column(name="phone_ext")
	private String phoneExt;
	@Column(name="phone_no")
	private String phoneNo;
	@Column(name="fax_no")
	private String faxNo;
	@Column(name="address")
	private String address;
	@Column(name="file")
	private String file;
	@Column(name="entry_date")
	private Date entryDate;
	@Column(name="updated_date")
	private Date updatedDate;
	@Column(name="change_password")
	private int changePassword;
	@Column(name="status")
	private int status;
	@Column(name="block_status")
	private int blockStatus;
	@Column(name="is_admin")
	private int isAdmin;
	@Column(name="forgot_password_otp")
	private String forgotPasswordOtp;
	@Column(name="is_delete")
	private int isDelete;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public int getAdminTypeId() {
		return adminTypeId;
	}
	public void setAdminTypeId(int adminTypeId) {
		this.adminTypeId = adminTypeId;
	}
	
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdminDesignation() {
		return adminDesignation;
	}
	public void setAdminDesignation(String adminDesignation) {
		this.adminDesignation = adminDesignation;
	}
	public String getAdminCompanyName() {
		return adminCompanyName;
	}
	public void setAdminCompanyName(String adminCompanyName) {
		this.adminCompanyName = adminCompanyName;
	}
	public String getAdminEmployeeId() {
		return adminEmployeeId;
	}
	public void setAdminEmployeeId(String adminEmployeeId) {
		this.adminEmployeeId = adminEmployeeId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPhoneExt() {
		return phoneExt;
	}
	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFaxNo() {
		return faxNo;
	}
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public int getChangePassword() {
		return changePassword;
	}
	public void setChangePassword(int changePassword) {
		this.changePassword = changePassword;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBlockStatus() {
		return blockStatus;
	}
	public void setBlockStatus(int blockStatus) {
		this.blockStatus = blockStatus;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getForgotPasswordOtp() {
		return forgotPasswordOtp;
	}
	public void setForgotPasswordOtp(String forgotPasswordOtp) {
		this.forgotPasswordOtp = forgotPasswordOtp;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	
	@Override
	public String toString() {
		return "Admin [Id=" + Id + ", adminID=" + adminID + ", saId=" + saId + ", adminTypeId=" + adminTypeId
				+ ", namePrefix=" + namePrefix + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", adminDesignation=" + adminDesignation + ", adminCompanyName=" + adminCompanyName
				+ ", adminEmployeeId=" + adminEmployeeId + ", adminEmail=" + adminEmail + ", adminPassword="
				+ adminPassword + ", confirmPassword=" + confirmPassword + ", phoneExt=" + phoneExt + ", phoneNo="
				+ phoneNo + ", faxNo=" + faxNo + ", address=" + address + ", file=" + file + ", entryDate=" + entryDate
				+ ", updatedDate=" + updatedDate + ", changePassword=" + changePassword + ", status=" + status
				+ ", blockStatus=" + blockStatus + ", isAdmin=" + isAdmin + ", forgotPasswordOtp=" + forgotPasswordOtp
				+ ", isDelete=" + isDelete + "]";
	}
	
}
