package com.loan.web.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.loan.web.model.*;

public class CategoryDb {
public static boolean InsertData(Category category) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call addcategory(?,?)}";
		CallableStatement  ps = connection.prepareCall(query);
		ps.setString(1, category.getCatname());
		ps.setString(2, category.getCatdes());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
	
	public static List<Category>viewAll() throws ClassNotFoundException, SQLException{
		
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call getallcategory()}";
		CallableStatement  ps = connection.prepareCall(query);
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		List<Category>categorylist=new ArrayList();
		while(rs.next()) {
			Category cate=new Category(rs.getInt("categoryid"),rs.getString("categoryname"),rs.getString("categorydescription"));
			categorylist.add(cate);;
		}
		ps.close();
		connection.close();
		return categorylist;
	}
	
	public static Category search(Category category) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call searchcateg(?)}";
		CallableStatement  ps = connection.prepareCall(query);
		ps.setInt(1, category.getCatid());
		ResultSet rs=ps.executeQuery();
		Category categorydata=new Category();
		if(rs.next()) {
			Category categ=new Category(rs.getInt("categoryid"),rs.getString("categoryname"),rs.getString("categorydescription"));
			categorydata=categ;
		}
		ps.close();
		connection.close();
		return categorydata;
		
	}
	
	public static boolean update(Category category) throws ClassNotFoundException, SQLException {
		
		DbConnector connector =new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query = "call updatecateg(?,?,?)";
		CallableStatement ps = connection.prepareCall(query);
		ps.setInt(1, category.getCatid());
		ps.setString(2, category.getCatname());
		ps.setString(3, category.getCatdes());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
}