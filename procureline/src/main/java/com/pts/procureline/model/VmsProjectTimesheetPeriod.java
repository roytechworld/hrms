package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * The persistent class for the vms_project_timesheet_period database table.
 * 
 */
@Component
@Entity
@Table(name="vms_project_timesheet_period")
@NamedQuery(name="VmsProjectTimesheetPeriod.findAll", query="SELECT v FROM VmsProjectTimesheetPeriod v")
@Access( AccessType.FIELD )
public class VmsProjectTimesheetPeriod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Lob
	@Column(name="admin_comment")
	private String adminComment;

	@Column(name="approved_by")
	private String approvedBy;

	@Column(name="approved_by_id")
	private int approvedById;

	private String comment;

	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	private String period;

	@Column(name="project_id")
	private int projectId;

	@Lob
	@Column(name="sadmin_comment")
	private String sadminComment;
	
	@Column(name="status")
	private String status;

	@Column(name="timesheet_id")
	private String timesheetId;

	
	
	public VmsProjectTimesheetPeriod() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getAdminComment() {
		return this.adminComment;
	}

	public void setAdminComment(String adminComment) {
		this.adminComment = adminComment;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public int getApprovedById() {
		return this.approvedById;
	}

	public void setApprovedById(int approvedById) {
		this.approvedById = approvedById;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getSadminComment() {
		return this.sadminComment;
	}

	public void setSadminComment(String sadminComment) {
		this.sadminComment = sadminComment;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimesheetId() {
		return this.timesheetId;
	}

	public void setTimesheetId(String timesheetId) {
		this.timesheetId = timesheetId;
	}

	

	
	
	
}