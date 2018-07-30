package firstproject;

import java.sql.*;

public class Statementmethoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			// String name= "Allan";
			// String salary= "20000";
			// String department= "bowling";

			// for date Date doj1= Date.valueOf(doj);
			Connection con = DriverManager.getConnection(jdbcURL,username,password);
			Statement stmt = con.createStatement();

			String sql = "INSERT  INTO EMPLOYEE VALUES('Allan',20000,'bowling')";
			int rowsAffected = stmt.executeUpdate(sql);
			if (rowsAffected > 0)
				System.out.println("Successfully record is inserted");
			else
				System.out.println("Not inserted");
		} catch (ClassNotFoundException e) {

			System.out.println("Driver not found");

		} catch (SQLException se) {

			System.out.println("Sql Exception" + se.getMessage());

		}

	}

}
