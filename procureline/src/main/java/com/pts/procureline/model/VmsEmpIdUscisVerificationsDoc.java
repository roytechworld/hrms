package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_emp_id_uscis_verifications_doc database table.
 * 
 */
@Entity
@Table(name="vms_emp_id_uscis_verifications_doc")
@NamedQuery(name="VmsEmpIdUscisVerificationsDoc.findAll", query="SELECT v FROM VmsEmpIdUscisVerificationsDoc v")
public class VmsEmpIdUscisVerificationsDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="admin_status")
	private String adminStatus;

	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.DATE)
	@Column(name="entry_date")
	private Date entryDate;

	private int id;

	@Column(name="list_a_docs")
	private String listADocs;

	@Column(name="list_a_docs_id")
	private int listADocsId;

	@Column(name="list_b_docs")
	private String listBDocs;

	@Column(name="list_b_docs_id")
	private int listBDocsId;

	@Column(name="list_c_docs")
	private String listCDocs;

	@Column(name="list_c_docs_id")
	private int listCDocsId;

	@Column(name="sadmin_status")
	private String sadminStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	public VmsEmpIdUscisVerificationsDoc() {
	}

	public String getAdminStatus() {
		return this.adminStatus;
	}

	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListADocs() {
		return this.listADocs;
	}

	public void setListADocs(String listADocs) {
		this.listADocs = listADocs;
	}

	public int getListADocsId() {
		return this.listADocsId;
	}

	public void setListADocsId(int listADocsId) {
		this.listADocsId = listADocsId;
	}

	public String getListBDocs() {
		return this.listBDocs;
	}

	public void setListBDocs(String listBDocs) {
		this.listBDocs = listBDocs;
	}

	public int getListBDocsId() {
		return this.listBDocsId;
	}

	public void setListBDocsId(int listBDocsId) {
		this.listBDocsId = listBDocsId;
	}

	public String getListCDocs() {
		return this.listCDocs;
	}

	public void setListCDocs(String listCDocs) {
		this.listCDocs = listCDocs;
	}

	public int getListCDocsId() {
		return this.listCDocsId;
	}

	public void setListCDocsId(int listCDocsId) {
		this.listCDocsId = listCDocsId;
	}

	public String getSadminStatus() {
		return this.sadminStatus;
	}

	public void setSadminStatus(String sadminStatus) {
		this.sadminStatus = sadminStatus;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}