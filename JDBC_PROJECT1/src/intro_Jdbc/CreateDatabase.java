package intro_Jdbc;
import java.sql.*;

public class CreateDatabase {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306";
		String uName = "root";
		String pwd = "root";
		String query = "create database rick";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pwd);
		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		while(rs.next())
//		{
//			System.out.println(rs.getString("sName"));
//		}
		
		st.execute(query);
		System.out.println("Database created successfully...!");
		st.close();
		con.close();
	}
}
