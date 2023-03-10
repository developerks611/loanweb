package com.loan.web.model;

public class Customer {
	private String cname;
	private String cdob;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cname, String cdob) {
		super();
		this.cname = cname;
		this.cdob = cdob;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdob() {
		return cdob;
	}
	public void setCdob(String cdob) {
		this.cdob = cdob;
	}
	
	
}
