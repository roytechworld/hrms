package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_employee_work_order database table.
 * 
 */
@Entity
@Table(name="vms_employee_work_order")
@NamedQuery(name="VmsEmployeeWorkOrder.findAll", query="SELECT v FROM VmsEmployeeWorkOrder v")
public class VmsEmployeeWorkOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="admin_signature")
	private String adminSignature;

	@Column(name="approved_by_admin")
	private String approvedByAdmin;

	@Column(name="approved_by_superadmin")
	private String approvedBySuperadmin;

	@Column(name="bill_rate")
	private double billRate;

	@Lob
	@Column(name="client_name")
	private String clientName;

	private String consultant;

	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Lob
	@Column(name="invoicing_terms")
	private String invoicingTerms;

	@Column(name="ot_rate")
	private double otRate;

	@Lob
	@Column(name="payment_terms")
	private String paymentTerms;

	@Column(name="project_duration")
	private String projectDuration;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_id")
	private int vendorId;

	@Lob
	@Column(name="vendor_ip")
	private String vendorIp;

	@Column(name="vendor_poc_designation")
	private String vendorPocDesignation;

	@Column(name="vendor_poc_name")
	private String vendorPocName;

	@Column(name="vendor_signature")
	private String vendorSignature;

	public VmsEmployeeWorkOrder() {
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

	public String getAdminSignature() {
		return this.adminSignature;
	}

	public void setAdminSignature(String adminSignature) {
		this.adminSignature = adminSignature;
	}

	public String getApprovedByAdmin() {
		return this.approvedByAdmin;
	}

	public void setApprovedByAdmin(String approvedByAdmin) {
		this.approvedByAdmin = approvedByAdmin;
	}

	public String getApprovedBySuperadmin() {
		return this.approvedBySuperadmin;
	}

	public void setApprovedBySuperadmin(String approvedBySuperadmin) {
		this.approvedBySuperadmin = approvedBySuperadmin;
	}

	public double getBillRate() {
		return this.billRate;
	}

	public void setBillRate(double billRate) {
		this.billRate = billRate;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getConsultant() {
		return this.consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
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

	public String getInvoicingTerms() {
		return this.invoicingTerms;
	}

	public void setInvoicingTerms(String invoicingTerms) {
		this.invoicingTerms = invoicingTerms;
	}

	public double getOtRate() {
		return this.otRate;
	}

	public void setOtRate(double otRate) {
		this.otRate = otRate;
	}

	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getProjectDuration() {
		return this.projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
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

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorIp() {
		return this.vendorIp;
	}

	public void setVendorIp(String vendorIp) {
		this.vendorIp = vendorIp;
	}

	public String getVendorPocDesignation() {
		return this.vendorPocDesignation;
	}

	public void setVendorPocDesignation(String vendorPocDesignation) {
		this.vendorPocDesignation = vendorPocDesignation;
	}

	public String getVendorPocName() {
		return this.vendorPocName;
	}

	public void setVendorPocName(String vendorPocName) {
		this.vendorPocName = vendorPocName;
	}

	public String getVendorSignature() {
		return this.vendorSignature;
	}

	public void setVendorSignature(String vendorSignature) {
		this.vendorSignature = vendorSignature;
	}

}