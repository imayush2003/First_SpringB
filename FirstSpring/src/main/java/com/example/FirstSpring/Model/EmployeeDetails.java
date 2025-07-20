package com.example.FirstSpring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {

	@Id
	@Column
	private Integer eid;
	@Column
	private String ename;
	@Column
	private String ecity;
	
	public Integer getEid() {
		return eid;
		
	}
	public void setEid(Integer eid) {
		this.eid=eid;
	}
	public String getEname() {
		return ename;
	}
	public void setSname(String ename) {
		this.ename=ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity=ecity;
	}
	public EmployeeDetails(Integer eid, String ename, String ecity) {
		super();
		this.eid=eid;
		this.ename=ename;
		this.ecity=ecity;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDetails [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + "]";
	}
}
