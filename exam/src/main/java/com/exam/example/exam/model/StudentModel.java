package com.exam.example.exam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class StudentModel {

	@Id
	private int id;
	
	private String Name;
	private String RegNo;
	private String Semister;
	private long MobileNo;
	
	
	public StudentModel() {
	}
	
	public StudentModel(int id, String name, String regNo, String semister, long mobileNo) {
		this.id = id;
		Name = name;
		RegNo = regNo;
		Semister = semister;
		MobileNo = mobileNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getSemister() {
		return Semister;
	}
	public void setSemister(String semister) {
		Semister = semister;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	
}

