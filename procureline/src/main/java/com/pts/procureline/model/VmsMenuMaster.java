package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_menu_master database table.
 * 
 */
@Entity
@Table(name="vms_menu_master")
@NamedQuery(name="VmsMenuMaster.findAll", query="SELECT v FROM VmsMenuMaster v")
public class VmsMenuMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="menu_name")
	private String menuName;

	@Column(name="menu_url")
	private String menuUrl;

	@Column(name="page_name")
	private String pageName;

	@Column(name="parent_id")
	private int parentId;

	@Column(name="view_order")
	private int viewOrder;

	@Column(name="view_portal")
	private String viewPortal;

	public VmsMenuMaster() {
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

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getViewOrder() {
		return this.viewOrder;
	}

	public void setViewOrder(int viewOrder) {
		this.viewOrder = viewOrder;
	}

	public String getViewPortal() {
		return this.viewPortal;
	}

	public void setViewPortal(String viewPortal) {
		this.viewPortal = viewPortal;
	}

}