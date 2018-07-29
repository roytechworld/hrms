package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vms_consultant database table.
 * 
 */
@Entity
@Table(name="vms_consultant")
@NamedQuery(name="VmsConsultant.findAll", query="SELECT v FROM VmsConsultant v")
public class VmsConsultant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int consultantId;

	private int adminId;

	private String consultantEmail;

	private String employeeId;

	private int vendorId;

	public VmsConsultant() {
	}

	public int getConsultantId() {
		return this.consultantId;
	}

	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getConsultantEmail() {
		return this.consultantEmail;
	}

	public void setConsultantEmail(String consultantEmail) {
		this.consultantEmail = consultantEmail;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

}