package com.pts.procureline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vms_consultant")
public class Consultant {
	
	@Id
	@Column
	private int consultantId;
	@Column
	private int adminId;
	@Column
	private int vendorId;
	@Column
	private String employeeId;
	@Column
	private String consultantEmail;
	
	public int getConsultantId() {
		return consultantId;
	}
	public int getAdminId() {
		return adminId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getConsultantEmail() {
		return consultantEmail;
	}
	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public void setConsultantEmail(String consultantEmail) {
		this.consultantEmail = consultantEmail;
	}
	@Override
	public String toString() {
		return "Consultant [consultantId=" + consultantId + ", adminId=" + adminId + ", vendorId=" + vendorId
				+ ", employeeId=" + employeeId + ", consultantEmail=" + consultantEmail + "]";
	}
	
	
	

}
