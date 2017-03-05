package com.madlabs.starter.modal;

import java.util.Date;

public class Employee {

	private Double commissionPCT;
	private Long depID;
	private String email;
	private Long empID;
	private String fName;
	private Date hireDate;
	private String jobID;
	private String lName;
	private Long managerID;
	private String phoneNumber;
	private Double Salary;

	public Double getCommissionPCT() {
		return commissionPCT;
	}

	public Long getDepID() {
		return depID;
	}

	public String getEmail() {
		return email;
	}

	public Long getEmpID() {
		return empID;
	}

	public String getfName() {
		return fName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public String getJobID() {
		return jobID;
	}

	public String getlName() {
		return lName;
	}

	public Long getManagerID() {
		return managerID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setCommissionPCT(Double commissionPCT) {
		this.commissionPCT = commissionPCT;
	}

	public void setDepID(Long depID) {
		this.depID = depID;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setManagerID(Long managerID) {
		this.managerID = managerID;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobID=" + jobID + ", Salary=" + Salary
				+ ", commissionPCT=" + commissionPCT + ", managerID=" + managerID + ", depID=" + depID + "]";
	}

}
