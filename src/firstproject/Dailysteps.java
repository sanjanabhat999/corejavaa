package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Dailysteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			con.setAutoCommit(false);
			PreparedStatement pstmt;

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name;
			Date date1;
			int steps;

			System.out.println("enter name, date(yyyy-mm-dd), steps");

			name = br.readLine();
			date1 = Date.valueOf(br.readLine());
			steps = Integer.parseInt(br.readLine());

			String sql = "INSERT  INTO DAILYSTEPS VALUES(?,?,?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setDate(2, date1);
			pstmt.setInt(3, steps);

			int i = pstmt.executeUpdate();//

			String sql2 = "update totalsteps set steps=steps+" + steps + " where name='" + name + "'";
			System.out.println(sql2);
			pstmt = con.prepareStatement(sql2);

			int j = pstmt.executeUpdate(); // 1st
			if (i > 0 && j > 0) {
				con.commit();
				System.out.println("commit.");
			}

			else {
				con.rollback();

				System.out.println("---rollback");
			}

		} catch (ClassNotFoundException e) {

			System.out.println("Driver not found");

		} catch (SQLException se) {

			System.out.println("Sql Exception" + se.getMessage());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
