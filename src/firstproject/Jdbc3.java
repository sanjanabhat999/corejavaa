package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet st = stmt.executeQuery("Select * from employee");
			st.absolute(3);
			st.afterLast();
			while (st.previous()) {
				System.out.println(st.getString("name") + st.getLong("salary") + " " + st.getString("Department"));
			}
			st.close();
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {

			System.out.println("Driver not found");

		} catch (SQLException se) {

			System.out.println("Sql Exception" + se.getMessage());

		}

	}
}
