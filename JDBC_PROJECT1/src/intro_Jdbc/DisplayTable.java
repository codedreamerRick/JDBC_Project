package intro_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayTable {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/rick";
		String uName = "root";
		String pwd = "root";
		String query = "select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt("sId")+" : "+rs.getString("sName"));
		}
//		while(rs.next())
//		{
//			System.out.println(rs.getString(2));
//		}
		st.close();
		con.close();
	}
}
