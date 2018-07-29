package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vms_emp_id_list_c database table.
 * 
 */
@Entity
@Table(name="vms_emp_id_list_c")
@NamedQuery(name="VmsEmpIdListC.findAll", query="SELECT v FROM VmsEmpIdListC v")
public class VmsEmpIdListC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	@Column(name="list_c_name")
	private String listCName;

	private int status;

	public VmsEmpIdListC() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListCName() {
		return this.listCName;
	}

	public void setListCName(String listCName) {
		this.listCName = listCName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}