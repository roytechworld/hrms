package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the vms_employee_master database table.
 * 
 */
@Component
@Entity
@Table(name="vms_employee_master")
@NamedQuery(name="VmsEmployeeMaster.findAll", query="SELECT v FROM VmsEmployeeMaster v")
public class VmsEmployeeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int employeeId;

	@Lob
	private String address;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="block_status")
	private String blockStatus;

	@Column(name="client_id")
	private int clientId;

	@Column(name="date_of_joining")
	private String dateOfJoining;

	@Column(name="emp_bill_rate_type")
	private String empBillRateType;

	@Column(name="emp_pay_rate_type")
	private String empPayRateType;

	@Column(name="employee_bill_rate")
	private String employeeBillRate;

	@Column(name="employee_category")
	private String employeeCategory;

	@Column(name="employee_code")
	private String employeeCode;

	@Column(name="employee_designation")
	private String employeeDesignation;

	@Column(name="employee_email")
	private String employeeEmail;

	@Column(name="employee_ot_rate")
	private String employeeOtRate;

	@Column(name="employee_pay_rate")
	private String employeePayRate;

	@Column(name="employee_type")
	private String employeeType;

	private String employeeAddress;

	private String employeeName;


	@Column(name="entry_date")
	private String entryDate;

	@Column(name="fax_no")
	private int faxNo;

	private String file;

	@Column(name="first_name")
	private String firstName;

	@Column(name="forgot_password_otp")
	private String forgotPasswordOtp;

	@Column(name="is_delete")
	private String isDelete;

	@Column(name="last_name")
	private String lastName;

	@Column(name="name_prefix")
	private String namePrefix;

	@Column(name="pay_staff_file")
	private String payStaffFile;

	@Column(name="phone_ext")
	private int phoneExt;

	@Column(name="phone_no")
	private BigInteger phoneNo;

	@Column(name="resume_file")
	private String resumeFile;

	private String status;

	
	@Column(name="updated_date")
	private String updatedDate;

	@Column(name="v_employee_bill_rate")
	private String vEmployeeBillRate;

	@Column(name="vendor_id")
	private int vendorId;

	@Column(name="w2_file")
	private String w2File;

	public VmsEmployeeMaster() {
	}



	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getBlockStatus() {
		return this.blockStatus;
	}

	public void setBlockStatus(String blockStatus) {
		this.blockStatus = blockStatus;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}



	public String getEmpBillRateType() {
		return this.empBillRateType;
	}

	public void setEmpBillRateType(String empBillRateType) {
		this.empBillRateType = empBillRateType;
	}

	public String getEmpPayRateType() {
		return this.empPayRateType;
	}

	public void setEmpPayRateType(String empPayRateType) {
		this.empPayRateType = empPayRateType;
	}

	public String getEmployeeBillRate() {
		return this.employeeBillRate;
	}

	public void setEmployeeBillRate(String employeeBillRate) {
		this.employeeBillRate = employeeBillRate;
	}

	public String getEmployeeCategory() {
		return this.employeeCategory;
	}

	public void setEmployeeCategory(String employeeCategory) {
		this.employeeCategory = employeeCategory;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeDesignation() {
		return this.employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}



	public String getEmployeeOtRate() {
		return this.employeeOtRate;
	}

	public void setEmployeeOtRate(String employeeOtRate) {
		this.employeeOtRate = employeeOtRate;
	}

	public String getEmployeePayRate() {
		return this.employeePayRate;
	}

	public void setEmployeePayRate(String employeePayRate) {
		this.employeePayRate = employeePayRate;
	}

	public String getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmployeeAddress() {
		return this.employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public int getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(int faxNo) {
		this.faxNo = faxNo;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getPayStaffFile() {
		return this.payStaffFile;
	}

	public void setPayStaffFile(String payStaffFile) {
		this.payStaffFile = payStaffFile;
	}

	public int getPhoneExt() {
		return this.phoneExt;
	}

	public void setPhoneExt(int phoneExt) {
		this.phoneExt = phoneExt;
	}

	public BigInteger getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getResumeFile() {
		return this.resumeFile;
	}

	public void setResumeFile(String resumeFile) {
		this.resumeFile = resumeFile;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public String getVEmployeeBillRate() {
		return this.vEmployeeBillRate;
	}

	public void setVEmployeeBillRate(String vEmployeeBillRate) {
		this.vEmployeeBillRate = vEmployeeBillRate;
	}

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getW2File() {
		return this.w2File;
	}

	public void setW2File(String w2File) {
		this.w2File = w2File;
	}



	public String getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public String getEntryDate() {
		return entryDate;
	}



	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}



	public String getUpdatedDate() {
		return updatedDate;
	}



	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}



	public String getvEmployeeBillRate() {
		return vEmployeeBillRate;
	}



	public void setvEmployeeBillRate(String vEmployeeBillRate) {
		this.vEmployeeBillRate = vEmployeeBillRate;
	}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//----------------------------------------------Extra Dto---------------------------------------------------------------------	
	
	
	private String clientname;

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	
	
}