package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_consultant_internal_files database table.
 * 
 */
@Entity
@Table(name="vms_consultant_internal_files")
@NamedQuery(name="VmsConsultantInternalFile.findAll", query="SELECT v FROM VmsConsultantInternalFile v")
public class VmsConsultantInternalFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="docs_name")
	private String docsName;

	@Column(name="employee_id")
	private int employeeId;

	@Column(name="employee_internal_files")
	private String employeeInternalFiles;

	@Temporal(TemporalType.DATE)
	@Column(name="entry_date")
	private Date entryDate;

	private String file;

	private String status;

	public VmsConsultantInternalFile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocsName() {
		return this.docsName;
	}

	public void setDocsName(String docsName) {
		this.docsName = docsName;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeInternalFiles() {
		return this.employeeInternalFiles;
	}

	public void setEmployeeInternalFiles(String employeeInternalFiles) {
		this.employeeInternalFiles = employeeInternalFiles;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}