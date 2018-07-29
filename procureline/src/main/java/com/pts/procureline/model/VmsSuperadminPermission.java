package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_superadmin_permission database table.
 * 
 */
@Entity
@Table(name="vms_superadmin_permission")
@NamedQuery(name="VmsSuperadminPermission.findAll", query="SELECT v FROM VmsSuperadminPermission v")
public class VmsSuperadminPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="is_add")
	private String isAdd;

	@Column(name="is_delete")
	private String isDelete;

	@Column(name="is_download")
	private String isDownload;

	@Column(name="is_edit")
	private String isEdit;

	@Column(name="is_view")
	private String isView;

	@Column(name="menu_id")
	private int menuId;

	@Column(name="sa_id")
	private int saId;

	public VmsSuperadminPermission() {
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

	public String getIsAdd() {
		return this.isAdd;
	}

	public void setIsAdd(String isAdd) {
		this.isAdd = isAdd;
	}

	public String getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getIsDownload() {
		return this.isDownload;
	}

	public void setIsDownload(String isDownload) {
		this.isDownload = isDownload;
	}

	public String getIsEdit() {
		return this.isEdit;
	}

	public void setIsEdit(String isEdit) {
		this.isEdit = isEdit;
	}

	public String getIsView() {
		return this.isView;
	}

	public void setIsView(String isView) {
		this.isView = isView;
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getSaId() {
		return this.saId;
	}

	public void setSaId(int saId) {
		this.saId = saId;
	}

}