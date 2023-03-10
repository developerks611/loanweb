package com.loan.web.model;

public class Brand {
	private int  brandid;
	private String brandname;
	private String branddescription;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brandid, String brandname, String branddescription) {
		super();
		this.brandid = brandid;
		this.brandname = brandname;
		this.branddescription = branddescription;
	}
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getBranddescription() {
		return branddescription;
	}
	public void setBranddescription(String branddescription) {
		this.branddescription = branddescription;
	}
	
}
