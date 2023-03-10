package com.loan.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loan.web.model.Brand;
import com.loan.web.model.Category;
import com.loan.web.model.Product;
import com.loan.web.service.ProductService;


public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String systemmsg="";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
	}
	
	
	public void insert(HttpServletRequest request, HttpServletResponse response) {
		Product product=new Product();
		ProductService pservice=new ProductService();
		Brand brand=new Brand();
		Category categ=new Category();
		brand.setBrandid(Integer.parseInt(request.getParameter("bid")));
		categ.setCatid(Integer.parseInt(request.getParameter("cid")));
		product.setBrand(brand);
		
	}

}
