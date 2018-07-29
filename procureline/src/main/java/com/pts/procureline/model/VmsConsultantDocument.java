package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_consultant_documents database table.
 * 
 */
@Entity
@Table(name="vms_consultant_documents")
@NamedQuery(name="VmsConsultantDocument.findAll", query="SELECT v FROM VmsConsultantDocument v")
public class VmsConsultantDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="document_name")
	private String documentName;

	@Temporal(TemporalType.DATE)
	@Column(name="entry_date")
	private Date entryDate;

	private String file;

	@Column(name="required_for")
	private String requiredFor;

	private String status;

	public VmsConsultantDocument() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
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

	public String getRequiredFor() {
		return this.requiredFor;
	}

	public void setRequiredFor(String requiredFor) {
		this.requiredFor = requiredFor;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}