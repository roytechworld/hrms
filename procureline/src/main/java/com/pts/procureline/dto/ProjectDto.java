package com.pts.procureline.dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProjectDto {
	private String timesheetid;
	private String projectcode;
	private String projectname;
	private String code;
	private String name;
	private String type;
	private String startdate;
	private String enddate;
	private String st;
	private String ot;
	private String timesheetstatus;
	
	public String getTimesheetid() {
		return timesheetid;
	}
	public void setTimesheetid(String timesheetid) {
		this.timesheetid = timesheetid;
	}
	public String getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public String getOt() {
		return ot;
	}
	public void setOt(String ot) {
		this.ot = ot;
	}
	public String getTimesheetstatus() {
		return timesheetstatus;
	}
	public void setTimesheetstatus(String timesheetstatus) {
		this.timesheetstatus = timesheetstatus;
	}
	public ProjectDto(String timesheetid, String projectcode, String projectname, String code, String name, String type,
			String startdate, String enddate, String st, String ot, String timesheetstatus) {
		super();
		this.timesheetid = timesheetid;
		this.projectcode = projectcode;
		this.projectname = projectname;
		this.code = code;
		this.name = name;
		this.type = type;
		this.startdate = startdate;
		this.enddate = enddate;
		this.st = st;
		this.ot = ot;
		this.timesheetstatus = timesheetstatus;
	}
	public ProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProjectDto [timesheetid=" + timesheetid + ", projectcode=" + projectcode + ", projectname="
				+ projectname + ", code=" + code + ", name=" + name + ", type=" + type + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", st=" + st + ", ot=" + ot + ", timesheetstatus=" + timesheetstatus + "]";
	}
	
	

}
