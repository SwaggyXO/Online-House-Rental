package house_Owner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HouseOwnerDB {
	
	public void Login(String username, String passw) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/MajorProj";
		String user = "root";
		String password = "MySqlPass1234";
		
		Connection con = DriverManager.getConnection(url,user,password); 
		Statement stmt = con.createStatement();
		
		PreparedStatement ps = con.prepareStatement("select * from HOwnerInfo where username=? and pass=?");
		
		ps.setString(1, username);
		ps.setString(2, password);
		
		ps.executeQuery();
	}

}
