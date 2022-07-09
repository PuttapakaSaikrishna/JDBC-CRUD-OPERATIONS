package CRUD.OPERATIONS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DELETE_RECORDS {
public static void main(String[] args) {
	
	Connection conn = null;
	
	PreparedStatement preparedStatement = null;

	String query = "DELETE FROM EMPLOYEE " + 
	"WHERE EMPLOYEE_ID = 3 ";

	try{
		//get connection
		conn = DBCONN.dbconn();

		//create preparedStatement
		preparedStatement = conn.prepareStatement(query);

		//execute query
		preparedStatement.executeUpdate();

		//close connection
		preparedStatement.close();
		conn.close();

	     System.out.println("Record deleted successfully.");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
