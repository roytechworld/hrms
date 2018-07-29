package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_payment_master database table.
 * 
 */
@Entity
@Table(name="vms_payment_master")
@NamedQuery(name="VmsPaymentMaster.findAll", query="SELECT v FROM VmsPaymentMaster v")
public class VmsPaymentMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="approved_by")
	private String approvedBy;

	@Column(name="approved_by_id")
	private int approvedById;

	@Column(name="bill_rate")
	private float billRate;

	@Lob
	private String comment;

	@Column(name="employee_id")
	private int employeeId;

	@Column(name="end_date")
	private String endDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Lob
	@Column(name="invoice_code")
	private String invoiceCode;

	@Column(name="is_view")
	private String isView;

	private String month;

	@Column(name="ot_rate")
	private float otRate;

	@Column(name="over_time")
	private String overTime;

	@Column(name="over_time_pay")
	private double overTimePay;

	@Column(name="payment_type")
	private int paymentType;

	@Column(name="start_date")
	private String startDate;

	private String status;

	@Column(name="timesheet_period_id")
	private int timesheetPeriodId;

	@Column(name="tot_time")
	private String totTime;

	@Column(name="tot_time_pay")
	private double totTimePay;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_id")
	private int vendorId;

	@Column(name="work_duration")
	private int workDuration;

	private String year;

	public VmsPaymentMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getBillRate() {
		return this.billRate;
	}

	public void setBillRate(float billRate) {
		this.billRate = billRate;
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

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getIsView() {
		return this.isView;
	}

	public void setIsView(String isView) {
		this.isView = isView;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public float getOtRate() {
		return this.otRate;
	}

	public void setOtRate(float otRate) {
		this.otRate = otRate;
	}

	public String getOverTime() {
		return this.overTime;
	}

	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}

	public double getOverTimePay() {
		return this.overTimePay;
	}

	public void setOverTimePay(double overTimePay) {
		this.overTimePay = overTimePay;
	}

	public int getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
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

	public String getTotTime() {
		return this.totTime;
	}

	public void setTotTime(String totTime) {
		this.totTime = totTime;
	}

	public double getTotTimePay() {
		return this.totTimePay;
	}

	public void setTotTimePay(double totTimePay) {
		this.totTimePay = totTimePay;
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

	public int getWorkDuration() {
		return this.workDuration;
	}

	public void setWorkDuration(int workDuration) {
		this.workDuration = workDuration;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}