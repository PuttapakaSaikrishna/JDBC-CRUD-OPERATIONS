package CRUD.OPERATIONS;
import java.sql.Connection;
import java.sql.PreparedStatement;

import CRUD.OPERATIONS.DBCONN;

public class Crete_table {
	public static void main(String[] args) {
		Connection con= null;
		PreparedStatement ps =null;
		
		String Query ="create table EMPLOYEE("
					+ "EMPLOYEE_ID INT(5) NOT NULL, "
					+ "NAME VARCHAR(20) NOT NULL, "
					+ "SALARY INT(10) NOT NULL, "
					+ "PRIMARY KEY (EMPLOYEE_ID) )";
		try{			
			//get connection
			con = DBCONN.dbconn();
 
			//create preparedStatement
			ps = con.prepareStatement(Query);
 
			//execute query
			ps.execute();
 
			//close connection
			ps.close();
			con.close();
 
		      System.out.println("Table created successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
}
