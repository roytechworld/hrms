package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the vms_project_master database table.
 * 
 */
@Component
@Entity
@Table(name="vms_project_master")
@NamedQuery(name="VmsProjectMaster.findAll", query="SELECT v FROM VmsProjectMaster v")
@Access( AccessType.FIELD )
public class VmsProjectMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="approx_total_time")
	private String approxTotalTime;

	@Column(name="client_name")
	private String clientName;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="is_deleted")
	private String isDeleted;

	@Column(name="is_vendor_view")
	private String isVendorView;

	@Column(name="monthly_payment")
	private int monthlyPayment;

	@Column(name="project_code")
	private String projectCode;

	@Lob
	@Column(name="project_details")
	private String projectDetails;

	@Column(name="project_name")
	private String projectName;

	@Column(name="project_type")
	private String projectType;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_id")
	private String vendorId;

	
	
	public VmsProjectMaster() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getApproxTotalTime() {
		return this.approxTotalTime;
	}

	public void setApproxTotalTime(String approxTotalTime) {
		this.approxTotalTime = approxTotalTime;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getIsVendorView() {
		return this.isVendorView;
	}

	public void setIsVendorView(String isVendorView) {
		this.isVendorView = isVendorView;
	}

	public int getMonthlyPayment() {
		return this.monthlyPayment;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectDetails() {
		return this.projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	
	
	

	
	
	



	
	
	
}