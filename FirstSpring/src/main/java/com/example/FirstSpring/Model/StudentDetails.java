package com.example.FirstSpring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
	
	@Id
	@Column
	private Integer sid;
	@Column
	private String sname;
	@Column
	private String scity;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public StudentDetails(Integer sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDetails [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	
	

}
