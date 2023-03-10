package com.loan.web.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDbConnector implements DbConnector {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/loandatabase";
	    String userName="root";
		String password="123456";
		return DriverManager.getConnection(url,userName,password);
			
		
	}


}
