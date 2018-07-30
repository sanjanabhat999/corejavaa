package firstproject;

import java.sql.*;

public class Callabledemo {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			String sql = "{?=call BIG1(?,?)}";
			CallableStatement cstmt = con.prepareCall(sql);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setInt(2, 25);
			cstmt.setInt(3, 125);
			 cstmt.execute();
			System.out.println("SQL funtion executed successfully");
			System.out.println(cstmt.getInt(1));
			cstmt.close();
			con.close();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("Class not found");
		} catch (SQLException se) {
			System.out.println("SQL exception"+se.getMessage());
		}
		
		}
	

	}

