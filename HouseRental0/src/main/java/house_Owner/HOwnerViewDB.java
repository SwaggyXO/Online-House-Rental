package house_Owner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HOwnerViewDB {
	
	public void View(String username) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/MajorProj";
		String user = "root";
		String password = "MySqlPass1234";
		
		Connection con = DriverManager.getConnection(url,user,password); 
		Statement stmt = con.createStatement();
		
		String uname1 = username;
		
		String query = "select * from housedetails where username="+uname1;
		
		ResultSet rst = stmt.executeQuery(query);
		
		while(rst.next())
		{
			int hno = rst.getInt(2);
			int hfloor = rst.getInt(3);
			String hdescp = rst.getString(4);
			long hmonth = rst.getLong(5);
			long hcost = rst.getLong(6);
			long hsec = rst.getLong(7);
		}
		
	}

}
