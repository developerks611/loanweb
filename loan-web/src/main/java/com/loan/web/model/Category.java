package com.loan.web.model;

public class Category {
private int catid;
private String catname;
private String catdes;
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(int catid, String catname, String catdes) {
	super();
	this.catid = catid;
	this.catname = catname;
	this.catdes = catdes;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}
public String getCatdes() {
	return catdes;
}
public void setCatdes(String catdes) {
	this.catdes = catdes;
}


}
