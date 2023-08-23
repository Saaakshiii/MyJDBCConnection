package com;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConClass {

	public void MyConnection()
	{
		System.out.println("I am in connection class");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			
			String url = "jdbc:mysql://localhost:3306/my_jdbc";
			String Username ="root";
			String Password = "root";
			Connection conn = DriverManager.getConnection(url, Username, Password);			
			Statement stmn = conn.createStatement();
			
			String myQuery = "insert into mytable values ('4','Siya','Tester', 40000);";
			stmn.executeUpdate(myQuery);
			System.out.println("Query executed succesfully");
			conn.close();
			
			
		}catch(Exception e) {
			System.out.println("Database exception==>"+e);
		}		
	}
		
		public void DeleteMethod() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Driver myDriver = new com.mysql.jdbc.Driver();
				DriverManager.registerDriver(myDriver);			
				String url = "jdbc:mysql://localhost:3306/my_jdbc";
				String UserName="root";
				String Password="root";			
				Connection conn = DriverManager.getConnection(url, UserName, Password);			
				Statement stmn = conn.createStatement();
				
				String DeleteQuery = "delete from mytable where id = '4';";
				stmn.executeUpdate(DeleteQuery);
				conn.close();
				System.out.println("Query executed succesfully");
				
				
				
				
			}catch(Exception e) {
				
				
			}
			
			
			public void MyUpdateQuery() {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Driver myDriver = new com.mysql.jdbc.Driver();
					DriverManager.registerDriver(myDriver);			
					String url = "jdbc:mysql://localhost:3306/my_jdbc";
					String UserName="root";
					String Password="root";			
					Connection conn = DriverManager.getConnection(url, UserName, Password);			
					Statement stmn = conn.createStatement();
					
					String updateQuery = "UPDATE `mytable` SET `Salary` = '70000' WHERE (`id` = '2');\r\n"
							+ "";
					stmn.executeUpdate(updateQuery);
					conn.close();
					System.out.println("Query executed succesfully");
					
				}catch(Exception e) {
					
				}
			
		
	}
	
	public static void main(String[] args) {
		
		MyConClass m = new MyConClass();
		//m.MyConnection();
		//m.DeleteMethod();
		m.MyUpdateQuery();
	}

}
