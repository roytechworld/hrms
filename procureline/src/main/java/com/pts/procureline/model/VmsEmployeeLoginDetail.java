package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_employee_login_details database table.
 * 
 */
@Entity
@Table(name="vms_employee_login_details")
@NamedQuery(name="VmsEmployeeLoginDetail.findAll", query="SELECT v FROM VmsEmployeeLoginDetail v")
public class VmsEmployeeLoginDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="block_status")
	private String blockStatus;

	@Column(name="change_password")
	private String changePassword;

	@Column(name="consultant_email")
	private String consultantEmail;

	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.DATE)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="is_delete")
	private String isDelete;

	private String password;

	private String status;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_id")
	private int vendorId;

	public VmsEmployeeLoginDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getChangePassword() {
		return this.changePassword;
	}

	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}

	public String getConsultantEmail() {
		return this.consultantEmail;
	}

	public void setConsultantEmail(String consultantEmail) {
		this.consultantEmail = consultantEmail;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
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

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

}