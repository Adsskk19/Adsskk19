package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductData {
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/testdb";
			String userName = "postgres";
			String password = "kiran19";
			
			Connection con = DriverManager.getConnection(url,userName ,password);
			
			Statement stmt = (Statement)con.createStatement();
			
			createTable(stmt);
			
//     		ResultSet rs = ((java.sql.Statement)stmt).executeQuery("Select*from product");
		
			
			/*
			 * while(rs.next()) {
			 * System.out.println("ID: "+rs.getString("prod_id")+" Name: "+rs.getString(
			 * "prod_name")); }
			 */
			
			/*if(con!=null) {
				System.out.println("Successfully connected:: ");
			}else {
				System.out.println("Connection refused:: ");
			}*/
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void createTable(Statement stmt) throws SQLException {
		String query = "create table Person1(pers_id varchar(4) primary key,"
				+"pers_name varchar(20) not null,"
				+"age numeric(2))";
		
		    try {
			    stmt.execute(query);
				System.out.println("Table successfully created..");
			}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

//Insert data in to the table.
//update a row in person table.
//delete a row from person table.
