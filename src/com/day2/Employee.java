package com.day2;

public class Employee {
	String eid;
	String empName;
	int empAge;
	double empSal;
	String EmpDept;

	public Employee() {

	}

	public Employee(String eid, String empName, int empAge, double empSal, String empDept) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
		EmpDept = empDept;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal
				+ ", EmpDept=" + EmpDept + "]";
	}
}
