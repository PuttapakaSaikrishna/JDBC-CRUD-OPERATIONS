package CRUD.OPERATIONS;

import java.sql.Connection;
import java.sql.PreparedStatement;

import CRUD.OPERATIONS.DBCONN;

public class Insert_values {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query ="insert into EMPLOYEE " +
				"(EMPLOYEE_ID, NAME, SALARY) " +
				"values (?,?,?)";
		try {
			//get connection
			con =DBCONN.dbconn();
			
			//create preparedstatment
			ps =con.prepareStatement(query);
			
			//set values
			ps.setInt(1, 3);
			ps.setString(2, "Bharat");
			ps.setInt(3, 62000);
			
			//execute query
			ps.executeUpdate();
 
			//close connection
			ps.close();
			con.close();
			
			System.out.println("Record inserted successfully.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
