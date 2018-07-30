package firstproject;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc4 {

	public static void main(String[] args) {
	
try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";

			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			Statement stmt= con.createStatement();
			ResultSet st= stmt.executeQuery("Select * from employee");
			ResultSetMetaData md= st.getMetaData();
			DatabaseMetaData dmd= con.getMetaData();
			System.out.println(dmd.getDatabaseProductName());
			System.out.println(md.getColumnCount()+" "+"columns");
			System.out.println("first column name is"+" "+md.getColumnName(1));
			System.out.println(md.getColumnType(1)+" " +"column type");
			
			
			
}
catch (ClassNotFoundException e) {

	System.out.println("Driver not found");

} catch (SQLException se) {

	System.out.println("Sql Exception" + se.getMessage());

}

}
}