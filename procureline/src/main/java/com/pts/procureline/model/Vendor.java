package com.pts.procureline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vms_vendor_master")
public class Vendor {
	@Id
	@Column
	private int companyId;
	@Column
	private String city;
	@Column
	private String address;
	@Column
	private String country;
	
	
	public int getCompanyId() {
		return companyId;
	}
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
	}
	public String getCountry() {
		return country;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Vendor [companyId=" + companyId + ", city=" + city + ", address=" + address + ", country=" + country
				+ "]";
	}
	
}
