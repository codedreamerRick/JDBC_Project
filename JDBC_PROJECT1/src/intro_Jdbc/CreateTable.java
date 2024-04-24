package intro_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/rick";
		String uName = "root";
		String pwd = "root";
		String query = "create table student1(sId int, sName varchar(10))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pwd);
		Statement st = con.createStatement();
		st.execute(query);
		System.out.println("Table created successfully...!");
		st.close();
		con.close();
	}
}
