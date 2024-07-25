package com.ebs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
	Connection c;
	Statement s;
	Conn() throws SQLException
	{
		c=DriverManager.getConnection("jdbc:myswl://localhost:3360/ebs","root","Deepa07**..");
		s=c.createStatement();
	}
}
