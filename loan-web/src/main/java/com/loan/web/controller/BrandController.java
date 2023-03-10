package com.loan.web.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loan.web.model.Brand;
import com.loan.web.service.BrandService;

/**
 * Servlet implementation class BrandController
 */
public class BrandController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("viewall")) {
			viewData(request, response);
		}
		
		
		}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("insert")) {
			InsrtData(request, response);
		}
		
		else if(action.equals("searchdata")) {
			
			searchData(request, response);
		}
		else if(action.equals("updatedata")) {
			updateData(request, response);
			
		}
	}
  
	private void InsrtData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String serveletmsg="";	
	BrandService brandsevice=new BrandService();
	Brand brand=new Brand();
	RequestDispatcher rd;
	brand.setBrandname(request.getParameter("bname"));
	brand.setBranddescription(request.getParameter("bdescription"));
	try {
		boolean getdata=brandsevice.InsertData(brand);
		if(getdata) {
			serveletmsg="Insert Data";
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		serveletmsg=e.getMessage();
	}
	
		request.setAttribute("msg", serveletmsg);
		rd=request.getRequestDispatcher("brandadd.jsp");
		rd.forward(request, response);
		
	}
	private void viewData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serveletmsg="";	
		BrandService brandsevice=new BrandService();
		List<Brand> brand=new ArrayList();
		RequestDispatcher rd;
		try {
			brand=brandsevice.viewAll();
			
			if(brand.isEmpty()) {
				serveletmsg="Empty Data";
				
			}
			request.setAttribute("brandlist", brand);
		} catch (ClassNotFoundException | SQLException e) {
			serveletmsg=e.getMessage();
		}
		
		request.setAttribute("msg", serveletmsg);
		rd=request.getRequestDispatcher("viewbrand.jsp");
		rd.forward(request, response);
		
	}
	
	//search
	
	private void searchData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serveletmsg="";	
		BrandService brandsevice=new BrandService();
		Brand brand=new Brand();
		brand.setBrandid(Integer.parseInt(request.getParameter("bid")));
		RequestDispatcher rd;
		try {
			brand=brandsevice.search(brand);
			
			if(brand==null) {
				
				
			}
			request.setAttribute("brand", brand);
		} catch (ClassNotFoundException | SQLException e) {
			serveletmsg=e.getMessage();
		}
		
		request.setAttribute("msg", serveletmsg);
		rd=request.getRequestDispatcher("searchbrand.jsp");
		rd.forward(request, response);
		
	}
	
	
	private void updateData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serveletmsg="";	
		BrandService brandsevice=new BrandService();
		Brand brand=new Brand();
		brand.setBrandid(Integer.parseInt(request.getParameter("bid")));
		brand.setBrandname(request.getParameter("bname"));
		brand.setBranddescription(request.getParameter("bd"));
		;
		try {
			boolean updateresult=brandsevice.update(brand);
			if(updateresult) {
				serveletmsg="Product Updated";
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			serveletmsg=e.getMessage();
		}
		request.setAttribute("msg", serveletmsg);
		response.sendRedirect("/loan-web/viewBrand?action=viewall");
		
	}
	
	
}
