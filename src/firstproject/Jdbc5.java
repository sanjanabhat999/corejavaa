package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbc5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			
			Connection con = DriverManager.getConnection(jdbcURL,username,password);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
			PreparedStatement psmt= con.prepareStatement(sql);
			psmt.setString(1,"Kety perry");
			psmt.setLong(2, 22000);
			psmt.setString(3, "Blah");
			psmt.addBatch();
			psmt.setString(1,"Britney Spears");
			psmt.setLong(2, 22000);
			psmt.setString(3, "Kentwood");
			psmt.addBatch();
		    psmt.executeBatch();
			
			
//			int rowsAffected = psmt.executeUpdate();
//			if (rowsAffected > 0)
//				System.out.println("Successfully record is inserted");
//			else
//				System.out.println("Not inserted");
		} catch (ClassNotFoundException e) {

			System.out.println("Driver not found");

		} catch (SQLException se) {

			System.out.println("Sql Exception" + se.getMessage());

		}
		

	}

}
