package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vms_emp_id_list_a database table.
 * 
 */
@Entity
@Table(name="vms_emp_id_list_a")
@NamedQuery(name="VmsEmpIdListA.findAll", query="SELECT v FROM VmsEmpIdListA v")
public class VmsEmpIdListA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	@Column(name="list_a_name")
	private String listAName;

	private int status;

	public VmsEmpIdListA() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListAName() {
		return this.listAName;
	}

	public void setListAName(String listAName) {
		this.listAName = listAName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}