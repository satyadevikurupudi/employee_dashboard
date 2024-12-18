package dbconnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class employeemanagement_dbconnection {
private static String Driver="com.mysql.cj.jdbc.Driver";
private static String username="root";
private static String password="Satya@22551A4230";
private static String url="jdbc:mysql://localhost:3306/employeemanagement";
public static Connection conn=null;
public static Connection getconnectConnection() {
	try {
		Class.forName(Driver);
		conn=DriverManager.getConnection(url, username, password);
	}catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
}
}
