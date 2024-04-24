package intro_Jdbc;

import java.sql.*;

public class InsertIntoTablePreparedStmt {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/rick";
		String uName = "root";
		String pwd = "root";
		int sId = 102;
		String sName = "Mahan";
		String query = "insert into student values (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pwd);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, sId);
		st.setNString(2, sName);
		int count = st.executeUpdate();
		System.out.println(count+" number of row/s effected");
		st.close();
		con.close();
	}
}
