package com.loan.web.service;

import java.sql.SQLException;
import java.util.List;

import com.loan.web.database.CategoryDb;
import com.loan.web.model.Brand;
import com.loan.web.model.Category;

public class CategoryService {
	public boolean InsertData(Category category) throws ClassNotFoundException, SQLException {
		return CategoryDb.InsertData(category);
		}
	
	public List<Category>viewAll() throws ClassNotFoundException, SQLException{
		
		return CategoryDb.viewAll();
	}
	
	public boolean update(Category categ) throws ClassNotFoundException, SQLException {
		return CategoryDb.update(categ);
		
	}
	
	public Category search(Category category) throws ClassNotFoundException, SQLException {
		return CategoryDb.search(category);
	}
}
