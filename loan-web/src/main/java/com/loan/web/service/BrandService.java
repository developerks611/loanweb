package com.loan.web.service;

import java.sql.SQLException;
import java.util.List;

import com.loan.web.database.BrandDb;
import com.loan.web.model.Brand;

public class BrandService {
	public boolean InsertData(Brand brand) throws ClassNotFoundException, SQLException {
		return BrandDb.InsertData(brand);
	}
	
	public List<Brand>viewAll() throws ClassNotFoundException, SQLException{
		return BrandDb.viewAll();
		
	}
	
	public Brand search(Brand brandid)throws ClassNotFoundException, SQLException{
		return BrandDb.search(brandid);
		
		
	}
	
	public boolean update(Brand brand) throws ClassNotFoundException, SQLException {
		return BrandDb.update(brand);
		
	}
}
