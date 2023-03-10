package com.loan.web.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.loan.web.model.Brand;

public class BrandDb {

	public static boolean InsertData(Brand brand) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call addBrand(?,?)}";
		CallableStatement  ps = connection.prepareCall(query);
		ps.setString(1,brand.getBrandname());
		ps.setString(2, brand.getBranddescription());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
	
	public static List<Brand>viewAll() throws ClassNotFoundException, SQLException{
		
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call viewallbrand()}";
		CallableStatement  ps = connection.prepareCall(query);
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		List<Brand>brandlist=new ArrayList();
		while(rs.next()) {
			Brand brand=new Brand(rs.getInt("brandid"),rs.getString("brandname"),rs.getString("branddescription"));
			brandlist.add(brand);
		}
		ps.close();
		connection.close();
		return brandlist;
	}
	
	public static Brand search(Brand brandid) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call searchbrand(?)}";
		CallableStatement  ps = connection.prepareCall(query);
		ps.setInt(1, brandid.getBrandid());
		ResultSet rs=ps.executeQuery();
		Brand brandlist=new Brand();
		if(rs.next()) {
			Brand brand=new Brand(rs.getInt("brandid"),rs.getString("brandname"),rs.getString("branddescription"));
			brandlist=brand;
		}
		ps.close();
		connection.close();
		return brandlist;
		
	}
	
	public static boolean update(Brand brand) throws ClassNotFoundException, SQLException {
		
		DbConnector connector =new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query = "call updatebrand(?,?,?)";
		CallableStatement ps = connection.prepareCall(query);
		ps.setInt(1, brand.getBrandid());
		ps.setString(2, brand.getBrandname());
		ps.setString(3, brand.getBranddescription());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
