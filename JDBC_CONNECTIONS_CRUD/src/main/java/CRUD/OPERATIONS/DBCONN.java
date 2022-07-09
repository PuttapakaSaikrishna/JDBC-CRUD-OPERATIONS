package CRUD.OPERATIONS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCONN {
	public static final String DB_URl = "jdbc:mysql://localhost:3306/Andrabank";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "24531395";
	
	 
	
	public static Connection dbconn() throws ClassNotFoundException , SQLException {
			Connection con =null;
		try {
		// register the vendor driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// establish the connection
				 con = DriverManager.getConnection(DB_URl, USERNAME, PASSWORD);
				
				if (con !=null) {
					System.out.println("Sucessfully connected .");
				}
				else {
					 System.out.println("Failed to connect.");
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}	
	
}
