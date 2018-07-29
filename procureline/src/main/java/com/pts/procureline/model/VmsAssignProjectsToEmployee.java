package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_assign_projects_to_employee database table.
 * 
 */
@Entity
@Table(name="vms_assign_projects_to_employee")
@NamedQuery(name="VmsAssignProjectsToEmployee.findAll", query="SELECT v FROM VmsAssignProjectsToEmployee v")
public class VmsAssignProjectsToEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="is_assigned")
	private String isAssigned;

	@Column(name="is_employee_view")
	private String isEmployeeView;

	@Column(name="is_vendor_view")
	private String isVendorView;

	@Column(name="is_view")
	private String isView;

	@Column(name="project_id")
	private int projectId;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_id")
	private int vendorId;

	public VmsAssignProjectsToEmployee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIsAssigned() {
		return this.isAssigned;
	}

	public void setIsAssigned(String isAssigned) {
		this.isAssigned = isAssigned;
	}

	public String getIsEmployeeView() {
		return this.isEmployeeView;
	}

	public void setIsEmployeeView(String isEmployeeView) {
		this.isEmployeeView = isEmployeeView;
	}

	public String getIsVendorView() {
		return this.isVendorView;
	}

	public void setIsVendorView(String isVendorView) {
		this.isVendorView = isVendorView;
	}

	public String getIsView() {
		return this.isView;
	}

	public void setIsView(String isView) {
		this.isView = isView;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
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