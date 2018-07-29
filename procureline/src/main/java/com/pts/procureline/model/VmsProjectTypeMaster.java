package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_project_type_master database table.
 * 
 */
@Entity
@Table(name="vms_project_type_master")
@NamedQuery(name="VmsProjectTypeMaster.findAll", query="SELECT v FROM VmsProjectTypeMaster v")
public class VmsProjectTypeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Lob
	@Column(name="project_type_details")
	private String projectTypeDetails;

	@Column(name="project_type_name")
	private String projectTypeName;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	public VmsProjectTypeMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getProjectTypeDetails() {
		return this.projectTypeDetails;
	}

	public void setProjectTypeDetails(String projectTypeDetails) {
		this.projectTypeDetails = projectTypeDetails;
	}

	public String getProjectTypeName() {
		return this.projectTypeName;
	}

	public void setProjectTypeName(String projectTypeName) {
		this.projectTypeName = projectTypeName;
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

}