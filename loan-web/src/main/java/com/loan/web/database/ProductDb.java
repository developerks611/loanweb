package com.loan.web.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.loan.web.model.*;

public class ProductDb {
	
	public boolean insertdata(Product product) throws ClassNotFoundException, SQLException {
		DbConnector connector = new SqlDbConnector();
		Connection connection = connector.getConnection();
		String query="{call addBrand(?,?)}";
		CallableStatement  ps = connection.prepareCall(query);
		
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
	
}
