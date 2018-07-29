package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_1099_files database table.
 * 
 */
@Entity
@Table(name="vms_1099_files")
@NamedQuery(name="Vms1099File.findAll", query="SELECT v FROM Vms1099File v")
public class Vms1099File implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="admin_form_status")
	private String adminFormStatus;

	@Column(name="admin_ucsic_approval")
	private String adminUcsicApproval;

	@Column(name="consultant_id")
	private int consultantId;

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

	@Column(name="sa_admin_ucsic_approval")
	private String saAdminUcsicApproval;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	public Vms1099File() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminFormStatus() {
		return this.adminFormStatus;
	}

	public void setAdminFormStatus(String adminFormStatus) {
		this.adminFormStatus = adminFormStatus;
	}

	public String getAdminUcsicApproval() {
		return this.adminUcsicApproval;
	}

	public void setAdminUcsicApproval(String adminUcsicApproval) {
		this.adminUcsicApproval = adminUcsicApproval;
	}

	public int getConsultantId() {
		return this.consultantId;
	}

	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
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

	public String getSaAdminUcsicApproval() {
		return this.saAdminUcsicApproval;
	}

	public void setSaAdminUcsicApproval(String saAdminUcsicApproval) {
		this.saAdminUcsicApproval = saAdminUcsicApproval;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}