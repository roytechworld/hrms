package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_vendor_files database table.
 * 
 */
@Entity
@Table(name="vms_vendor_files")
@NamedQuery(name="VmsVendorFile.findAll", query="SELECT v FROM VmsVendorFile v")
public class VmsVendorFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	private String file;

	@Lob
	@Column(name="form_data")
	private String formData;

	@Lob
	@Column(name="form_name")
	private String formName;

	@Column(name="form_no")
	private int formNo;

	@Column(name="form_status")
	private String formStatus;

	@Column(name="is_superadmin_view")
	private String isSuperadminView;

	@Column(name="sa_form_status")
	private String saFormStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="vendor_id")
	private int vendorId;

	public VmsVendorFile() {
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

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFormData() {
		return this.formData;
	}

	public void setFormData(String formData) {
		this.formData = formData;
	}

	public String getFormName() {
		return this.formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public int getFormNo() {
		return this.formNo;
	}

	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}

	public String getFormStatus() {
		return this.formStatus;
	}

	public void setFormStatus(String formStatus) {
		this.formStatus = formStatus;
	}

	public String getIsSuperadminView() {
		return this.isSuperadminView;
	}

	public void setIsSuperadminView(String isSuperadminView) {
		this.isSuperadminView = isSuperadminView;
	}

	public String getSaFormStatus() {
		return this.saFormStatus;
	}

	public void setSaFormStatus(String saFormStatus) {
		this.saFormStatus = saFormStatus;
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

}