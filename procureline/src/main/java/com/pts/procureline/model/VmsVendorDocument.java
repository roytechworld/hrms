package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_vendor_documents database table.
 * 
 */
@Entity
@Table(name="vms_vendor_documents")
@NamedQuery(name="VmsVendorDocument.findAll", query="SELECT v FROM VmsVendorDocument v")
public class VmsVendorDocument implements Serializable {
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

	private String status;

	public VmsVendorDocument() {
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}