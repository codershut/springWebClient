package com.webclient.reqmodal;

public class RequestModelTest {
	
	private String id;
	private String empName;
	private String add;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "RequestModelTest [id=" + id + ", empName=" + empName + ", add=" + add + "]";
	}
}
