package intro_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoTable {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/rick";
		String uName = "root";
		String pwd = "root";
		int sId = 101;
		String sName = "Rick";
		String query = "insert into student values ("+sId+",'"+sName+"')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pwd);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count+" number of row/s effected");
		st.close();
		con.close();
	}
}
