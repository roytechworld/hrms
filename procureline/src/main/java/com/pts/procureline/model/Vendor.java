package com.pts.procureline.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="vms_vendor_master")
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vendor_id")
	private int vendorId;

	@Column(name="additional_contact_person")
	private String additionalContactPerson;

	@Column(name="additional_email_address")
	private String additionalEmailAddress;

	@Column(name="additional_phone_no")
	private String additionalPhoneNo;

	@Lob
	private String address;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="billing_contact_person")
	private String billingContactPerson;

	@Column(name="billing_email_address")
	private String billingEmailAddress;

	@Column(name="billing_phone_no")
	private String billingPhoneNo;

	@Column(name="block_status")
	private String blockStatus;

	@Column(name="change_password")
	private String changePassword;
	
	@Column(name="city")
	private int city;

	@Column(name="client_support_cal")
	private String clientSupportCal;

	@Column(name="client_support_cal_file")
	private String clientSupportCalFile;

	@Column(name="client_support_pen")
	private String clientSupportPen;

	@Column(name="client_support_pen_file")
	private String clientSupportPenFile;

	@Column(name="client_support_pu")
	private String clientSupportPu;

	@Column(name="client_support_pu_file")
	private String clientSupportPuFile;

	@Column(name="companyname")
	private String companyId;

	@Temporal(TemporalType.DATE)
	@Column(name="contract_from_date")
	private Date contractFromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="contract_to_date")
	private Date contractToDate;

	private int country;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="fax_no")
	private BigInteger faxNo;

	@Column(name="federal_tax_id")
	private String federalTaxId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="forgot_password_otp")
	private String forgotPasswordOtp;

	@Column(name="is_delete")
	private String isDelete;

	@Column(name="last_name")
	private String lastName;

	@Column(name="main_contact_person")
	private String mainContactPerson;

	@Column(name="main_email_address")
	private String mainEmailAddress;

	@Column(name="main_phone_no")
	private String mainPhoneNo;

	@Column(name="name_prefix")
	private String namePrefix;

	private String nglcc;

	@Column(name="nglcc_file")
	private String nglccFile;

	private String nmsdc;

	@Column(name="nmsdc_file")
	private String nmsdcFile;

	@Column(name="phone_ext")
	private int phoneExt;

	@Column(name="phone_no")
	private BigInteger phoneNo;

	private String photo;

	@Column(name="reg_code")
	private String regCode;

	@Column(name="reg_verification")
	private String regVerification;

	@Lob
	@Column(name="remittance_address")
	private String remittanceAddress;

	@Column(name="sa_id")
	private int saId;

	private String sba;

	@Column(name="sba_file")
	private String sbaFile;

	private int state;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_company_name")
	private String vendorCompanyName;

	@Column(name="vendor_designation")
	private String vendorDesignation;

	@Column(name="vendor_email")
	private String vendorEmail;

	@Column(name="vendor_password")
	private String vendorPassword;

	private String vetbiz;

	@Column(name="vetbiz_file")
	private String vetbizFile;

	private String wbenc;

	@Column(name="wbenc_file")
	private String wbencFile;

	public Vendor() {
	}

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getAdditionalContactPerson() {
		return this.additionalContactPerson;
	}

	public void setAdditionalContactPerson(String additionalContactPerson) {
		this.additionalContactPerson = additionalContactPerson;
	}

	public String getAdditionalEmailAddress() {
		return this.additionalEmailAddress;
	}

	public void setAdditionalEmailAddress(String additionalEmailAddress) {
		this.additionalEmailAddress = additionalEmailAddress;
	}

	public String getAdditionalPhoneNo() {
		return this.additionalPhoneNo;
	}

	public void setAdditionalPhoneNo(String additionalPhoneNo) {
		this.additionalPhoneNo = additionalPhoneNo;
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

	public String getBillingContactPerson() {
		return this.billingContactPerson;
	}

	public void setBillingContactPerson(String billingContactPerson) {
		this.billingContactPerson = billingContactPerson;
	}

	public String getBillingEmailAddress() {
		return this.billingEmailAddress;
	}

	public void setBillingEmailAddress(String billingEmailAddress) {
		this.billingEmailAddress = billingEmailAddress;
	}

	public String getBillingPhoneNo() {
		return this.billingPhoneNo;
	}

	public void setBillingPhoneNo(String billingPhoneNo) {
		this.billingPhoneNo = billingPhoneNo;
	}

	public String getBlockStatus() {
		return this.blockStatus;
	}

	public void setBlockStatus(String blockStatus) {
		this.blockStatus = blockStatus;
	}

	public String getChangePassword() {
		return this.changePassword;
	}

	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}

	public int getCity() {
		return this.city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getClientSupportCal() {
		return this.clientSupportCal;
	}

	public void setClientSupportCal(String clientSupportCal) {
		this.clientSupportCal = clientSupportCal;
	}

	public String getClientSupportCalFile() {
		return this.clientSupportCalFile;
	}

	public void setClientSupportCalFile(String clientSupportCalFile) {
		this.clientSupportCalFile = clientSupportCalFile;
	}

	public String getClientSupportPen() {
		return this.clientSupportPen;
	}

	public void setClientSupportPen(String clientSupportPen) {
		this.clientSupportPen = clientSupportPen;
	}

	public String getClientSupportPenFile() {
		return this.clientSupportPenFile;
	}

	public void setClientSupportPenFile(String clientSupportPenFile) {
		this.clientSupportPenFile = clientSupportPenFile;
	}

	public String getClientSupportPu() {
		return this.clientSupportPu;
	}

	public void setClientSupportPu(String clientSupportPu) {
		this.clientSupportPu = clientSupportPu;
	}

	public String getClientSupportPuFile() {
		return this.clientSupportPuFile;
	}

	public void setClientSupportPuFile(String clientSupportPuFile) {
		this.clientSupportPuFile = clientSupportPuFile;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		
		System.out.println("company id found "+companyId);
		this.companyId = companyId;
	}





	public Date getContractFromDate() {
		return this.contractFromDate;
	}

	public void setContractFromDate(Date contractFromDate) {
		this.contractFromDate = contractFromDate;
	}

	public Date getContractToDate() {
		return this.contractToDate;
	}

	public void setContractToDate(Date contractToDate) {
		this.contractToDate = contractToDate;
	}

	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public BigInteger getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(BigInteger faxNo) {
		this.faxNo = faxNo;
	}

	public String getFederalTaxId() {
		return this.federalTaxId;
	}

	public void setFederalTaxId(String federalTaxId) {
		this.federalTaxId = federalTaxId;
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

	public String getMainContactPerson() {
		return this.mainContactPerson;
	}

	public void setMainContactPerson(String mainContactPerson) {
		this.mainContactPerson = mainContactPerson;
	}

	public String getMainEmailAddress() {
		return this.mainEmailAddress;
	}

	public void setMainEmailAddress(String mainEmailAddress) {
		this.mainEmailAddress = mainEmailAddress;
	}

	public String getMainPhoneNo() {
		return this.mainPhoneNo;
	}

	public void setMainPhoneNo(String mainPhoneNo) {
		this.mainPhoneNo = mainPhoneNo;
	}

	public String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getNglcc() {
		return this.nglcc;
	}

	public void setNglcc(String nglcc) {
		this.nglcc = nglcc;
	}

	public String getNglccFile() {
		return this.nglccFile;
	}

	public void setNglccFile(String nglccFile) {
		this.nglccFile = nglccFile;
	}

	public String getNmsdc() {
		return this.nmsdc;
	}

	public void setNmsdc(String nmsdc) {
		this.nmsdc = nmsdc;
	}

	public String getNmsdcFile() {
		return this.nmsdcFile;
	}

	public void setNmsdcFile(String nmsdcFile) {
		this.nmsdcFile = nmsdcFile;
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

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getRegCode() {
		return this.regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRegVerification() {
		return this.regVerification;
	}

	public void setRegVerification(String regVerification) {
		this.regVerification = regVerification;
	}

	public String getRemittanceAddress() {
		return this.remittanceAddress;
	}

	public void setRemittanceAddress(String remittanceAddress) {
		this.remittanceAddress = remittanceAddress;
	}

	public int getSaId() {
		return this.saId;
	}

	public void setSaId(int saId) {
		this.saId = saId;
	}

	public String getSba() {
		return this.sba;
	}

	public void setSba(String sba) {
		this.sba = sba;
	}

	public String getSbaFile() {
		return this.sbaFile;
	}

	public void setSbaFile(String sbaFile) {
		this.sbaFile = sbaFile;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
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

	public String getVendorCompanyName() {
		return this.vendorCompanyName;
	}

	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
	}

	public String getVendorDesignation() {
		return this.vendorDesignation;
	}

	public void setVendorDesignation(String vendorDesignation) {
		this.vendorDesignation = vendorDesignation;
	}

	public String getVendorEmail() {
		return this.vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public String getVendorPassword() {
		return this.vendorPassword;
	}

	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}

	public String getVetbiz() {
		return this.vetbiz;
	}

	public void setVetbiz(String vetbiz) {
		this.vetbiz = vetbiz;
	}

	public String getVetbizFile() {
		return this.vetbizFile;
	}

	public void setVetbizFile(String vetbizFile) {
		this.vetbizFile = vetbizFile;
	}

	public String getWbenc() {
		return this.wbenc;
	}

	public void setWbenc(String wbenc) {
		this.wbenc = wbenc;
	}

	public String getWbencFile() {
		return this.wbencFile;
	}

	public void setWbencFile(String wbencFile) {
		this.wbencFile = wbencFile;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", additionalContactPerson=" + additionalContactPerson
				+ ", additionalEmailAddress=" + additionalEmailAddress + ", additionalPhoneNo=" + additionalPhoneNo
				+ ", address=" + address + ", adminId=" + adminId + ", billingContactPerson=" + billingContactPerson
				+ ", billingEmailAddress=" + billingEmailAddress + ", billingPhoneNo=" + billingPhoneNo
				+ ", blockStatus=" + blockStatus + ", changePassword=" + changePassword + ", city=" + city
				+ ", clientSupportCal=" + clientSupportCal + ", clientSupportCalFile=" + clientSupportCalFile
				+ ", clientSupportPen=" + clientSupportPen + ", clientSupportPenFile=" + clientSupportPenFile
				+ ", clientSupportPu=" + clientSupportPu + ", clientSupportPuFile=" + clientSupportPuFile
				+ ", companyId=" + companyId + ", contractFromDate=" + contractFromDate + ", contractToDate="
				+ contractToDate + ", country=" + country + ", entryDate=" + entryDate + ", faxNo=" + faxNo
				+ ", federalTaxId=" + federalTaxId + ", firstName=" + firstName + ", forgotPasswordOtp="
				+ forgotPasswordOtp + ", isDelete=" + isDelete + ", lastName=" + lastName + ", mainContactPerson="
				+ mainContactPerson + ", mainEmailAddress=" + mainEmailAddress + ", mainPhoneNo=" + mainPhoneNo
				+ ", namePrefix=" + namePrefix + ", nglcc=" + nglcc + ", nglccFile=" + nglccFile + ", nmsdc=" + nmsdc
				+ ", nmsdcFile=" + nmsdcFile + ", phoneExt=" + phoneExt + ", phoneNo=" + phoneNo + ", photo=" + photo
				+ ", regCode=" + regCode + ", regVerification=" + regVerification + ", remittanceAddress="
				+ remittanceAddress + ", saId=" + saId + ", sba=" + sba + ", sbaFile=" + sbaFile + ", state=" + state
				+ ", status=" + status + ", updatedDate=" + updatedDate + ", vendorCompanyName=" + vendorCompanyName
				+ ", vendorDesignation=" + vendorDesignation + ", vendorEmail=" + vendorEmail + ", vendorPassword="
				+ vendorPassword + ", vetbiz=" + vetbiz + ", vetbizFile=" + vetbizFile + ", wbenc=" + wbenc
				+ ", wbencFile=" + wbencFile + "]";
	}

	private String adminname;

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	
}
