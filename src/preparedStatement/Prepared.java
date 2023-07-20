package preparedStatement;
import java.sql.*;
import java.util.*;

public class Prepared {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//	 Step-1:Load and register the Driver
		Connection conn=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		step-2:Create connection
		String url="jdbc:mysql://localhost:3306/preparestatement";
		String user="root";
		String pass="Manish@123";
		conn=DriverManager.getConnection(url, user, pass);
//		step-3:Create statement
		String query="select * from product";
		PreparedStatement st=conn.prepareStatement(query);
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString (4));
		}
//		Take data From user to update
		
		
		
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
