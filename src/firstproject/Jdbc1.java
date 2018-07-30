package firstproject;
import java.sql.*;

public class Jdbc1 {
	public static void main(String[] args) {
		// Loading driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to locate the driver");
			System.out.println(e1.getMessage());
		}
		//Connect to server
		String jdbcURL="jdbc:oracle:thin:@localhost:1521:orcl";
		String username= "scott";
		String password= "tiger";
		
		
		
		try {
			Connection con= DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("Connection successful,you are connected to the database");
			
			Statement stmt= con.createStatement();
			ResultSet rs =stmt.executeQuery("Select * from employee");
			while(rs.next())
			{
				String name= rs.getString(1);
				String salary= rs.getString(2);
				String department= rs.getString(3);
				
				System.out.println(name+" "+salary+" "+department+" ");
				
			}
			rs.close();
			con.close();
			stmt.close();
		} catch (SQLException e) {
			
			System.out.println("could not connect to the server, some problems");
			System.out.println(e.getMessage());
		}
		
		//create statement object
		
		
		
		
		
		
	}

}
