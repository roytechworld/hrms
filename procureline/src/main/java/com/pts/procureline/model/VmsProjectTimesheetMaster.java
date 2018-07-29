package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_project_timesheet_master database table.
 * 
 */
@Entity
@Table(name="vms_project_timesheet_master")
@NamedQuery(name="VmsProjectTimesheetMaster.findAll", query="SELECT v FROM VmsProjectTimesheetMaster v")
public class VmsProjectTimesheetMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="approved_by_admin")
	private String approvedByAdmin;



	@Lob
	private String comment;

	@Column(name="employee_id")
	private int employeeId;


	@Column(name="end_time")
	private String endTime;

	

	
	@Column(name="entry_date")
	private Date entryDate;



	@Column(name="is_vendor_view")
	private String isVendorView;

	@Column(name="is_view")
	private String isView;

	private int isvendorView;



	@Column(name="over_time")
	private String overTime;



	@Temporal(TemporalType.DATE)
	@Column(name="project_date")
	private Date projectDate;

	@Column(name="project_id")
	private int projectId;




	@Column(name="start_time")
	private String startTime;



	private String status;

	@Column(name="tot_time")
	private String totTime;

	private String totalTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;


	public VmsProjectTimesheetMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApprovedByAdmin() {
		return approvedByAdmin;
	}

	public void setApprovedByAdmin(String approvedByAdmin) {
		this.approvedByAdmin = approvedByAdmin;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getIsVendorView() {
		return isVendorView;
	}

	public void setIsVendorView(String isVendorView) {
		this.isVendorView = isVendorView;
	}

	public String getIsView() {
		return isView;
	}

	public void setIsView(String isView) {
		this.isView = isView;
	}

	public int getIsvendorView() {
		return isvendorView;
	}

	public void setIsvendorView(int isvendorView) {
		this.isvendorView = isvendorView;
	}

	public String getOverTime() {
		return overTime;
	}

	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}

	public Date getProjectDate() {
		return projectDate;
	}

	public void setProjectDate(Date projectDate) {
		this.projectDate = projectDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotTime() {
		return totTime;
	}

	public void setTotTime(String totTime) {
		this.totTime = totTime;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}



}