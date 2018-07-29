package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vms_emp_id_list_b database table.
 * 
 */
@Entity
@Table(name="vms_emp_id_list_b")
@NamedQuery(name="VmsEmpIdListB.findAll", query="SELECT v FROM VmsEmpIdListB v")
public class VmsEmpIdListB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	@Column(name="list_b_name")
	private String listBName;

	private int status;

	public VmsEmpIdListB() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListBName() {
		return this.listBName;
	}

	public void setListBName(String listBName) {
		this.listBName = listBName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}