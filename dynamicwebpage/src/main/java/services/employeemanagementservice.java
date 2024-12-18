package services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import models.employeemanagement;

public class employeemanagementservice {
private Connection conn;

public employeemanagementservice(Connection conn) {
	super();
	this.conn = conn;
}
public boolean addemployeemangement(employeemanagement e) {
	boolean f = false;
			try {
				String sql="insert into employeemanagement(rollnumber,name,email,password,phonenum,gender,address,pincode,salary) values(?,?,?,?,?,?,?,?,?)";
				
				
				PreparedStatement pmst = conn.prepareStatement(sql);
				int i=pmst.executeUpdate();
				if (i==1) {
					f = true;
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return f;
}
}
