package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_project_timesheet_mast database table.
 * 
 */
@Entity
@Table(name="vms_project_timesheet_mast")
@NamedQuery(name="VmsProjectTimesheetMast.findAll", query="SELECT v FROM VmsProjectTimesheetMast v")
public class VmsProjectTimesheetMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="approved_by_status")
	private String approvedByStatus;

	@Column(name="employee_id")
	private int employeeId;

	@Column(name="end_time")
	private String endTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_time")
	private Date entryTime;

	@Column(name="is_vendor_view")
	private String isVendorView;

	@Column(name="is_view")
	private String isView;

	@Column(name="over_time")
	private double overTime;

	

	@Temporal(TemporalType.DATE)
	@Column(name="project_date")
	private Date projectDate;

	@Column(name="project_id")
	private int projectId;

	@Column(name="start_time")
	private String startTime;

	private String status;

	@Column(name="timesheet_period_id")
	private int timesheetPeriodId;

	@Column(name="tot_time")
	private double totTime;

	@Column(name="total_time")
	private double totalTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	public VmsProjectTimesheetMast() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApprovedByStatus() {
		return this.approvedByStatus;
	}

	public void setApprovedByStatus(String approvedByStatus) {
		this.approvedByStatus = approvedByStatus;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getEntryTime() {
		return this.entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
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

	public double getOverTime() {
		return this.overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}



	public Date getProjectDate() {
		return this.projectDate;
	}

	public void setProjectDate(Date projectDate) {
		this.projectDate = projectDate;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTimesheetPeriodId() {
		return this.timesheetPeriodId;
	}

	public void setTimesheetPeriodId(int timesheetPeriodId) {
		this.timesheetPeriodId = timesheetPeriodId;
	}

	public double getTotTime() {
		return this.totTime;
	}

	public void setTotTime(double totTime) {
		this.totTime = totTime;
	}

	public double getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}