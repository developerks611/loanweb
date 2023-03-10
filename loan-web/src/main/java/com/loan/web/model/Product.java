package com.loan.web.model;

public class Product {

	private int productid;
	private String productname;
	private String productdes;
	private Category category;
	private Brand brand;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, String productdes, Category category, Brand brand,
			double price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdes = productdes;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdes() {
		return productdes;
	}
	public void setProductdes(String productdes) {
		this.productdes = productdes;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
