package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbcuserinputdemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			
			Connection con = DriverManager.getConnection(jdbcURL,username,password);
			Statement stmt = con.createStatement();
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name");
			String name = br.readLine();
			System.out.println("Enter the salary");
			long salary =Long.parseLong(br.readLine());
			System.out.println("Enter the designation");
			String designation = br.readLine();

			String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
			PreparedStatement psmt= con.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setLong(2, salary);
			psmt.setString(3, designation);
			
			int rowsAffected = psmt.executeUpdate();
			if (rowsAffected > 0)
				System.out.println("Successfully record is inserted");
			else
				System.out.println("Not inserted");
		} catch (ClassNotFoundException e) {

			System.out.println("Driver not found");

		} catch (SQLException se) {

			System.out.println("Sql Exception" + se.getMessage());

		}
		catch(IOException ie) {
			System.out.println("IOException occured");
		}

	}

}
