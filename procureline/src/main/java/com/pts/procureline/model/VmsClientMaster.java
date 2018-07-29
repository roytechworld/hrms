package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vms_client_master database table.
 * 
 */
@Entity
@Table(name="vms_client_master")
@NamedQuery(name="VmsClientMaster.findAll", query="SELECT v FROM VmsClientMaster v")
public class VmsClientMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="client_name")
	private String clientName;

	private String status;

	@Lob
	@Column(name="work_order_note")
	private String workOrderNote;

	public VmsClientMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWorkOrderNote() {
		return this.workOrderNote;
	}

	public void setWorkOrderNote(String workOrderNote) {
		this.workOrderNote = workOrderNote;
	}

}