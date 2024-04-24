package StudentDetails;
import java.sql.*;
import java.util.Scanner;

public class Student {

	Scanner scan = new Scanner(System.in);
	static Connection con = null;
	
	static void getConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rick" , "root" , "root");
	}
	
	void addStudent() throws Exception
	{
		System.out.println("Enter Student ID");
		int sId = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Student Name");
		String sName = scan.nextLine();
		String query = "insert into student values(?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, sId);
		st.setString(2, sName);
		int count = st.executeUpdate();
		System.out.println(count+" row/s effected");
		System.out.println("==================================");
	}
	
	void getStudentName() throws Exception
	{
		System.out.println("Enter the Student ID");
		int sId = scan.nextInt();
		String query = "select sName from student where sId = "+sId;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getString("sName"));
		}		
		System.out.println("==================================");
	}
	
	void getDetails() throws Exception
	{
		System.out.println("Enter the Student Name");
		String sName = scan.nextLine();
		String query = "select * from student where sName = '"+sName+"'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		System.out.println("==================================");
	}
	
	void getTable() throws Exception
	{
		String query = "select * from student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		System.out.println("==================================");
	}
	
	void removeStudent() throws Exception
	{
		System.out.println("Enter the Student Name");
		String sName = scan.nextLine();
		String query = "delete from student where sName = '"+sName+"'";
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count+" row/s effected");
		System.out.println("==================================");
	}
}
