package house_Owner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HOwnerRegisterDB {
	
	public void Register(String username, String passw, String phone, String email) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/MajorProj";

    	String user = "root";

    	String pass = "MySqlPass1234";

    	Connection con = DriverManager.getConnection(url, user, pass);
    	
    	PreparedStatement ps = con.prepareStatement("select * from HOwnerRInfo where username=? and pass=? and phone=? and email=?");
		
		ps.setString(1, username);
		ps.setString(2, passw);
		ps.setString(3, phone);
		ps.setString(4, email);
		
		ps.executeQuery();
		
		PreparedStatement pst = con.prepareStatement("INSERT INTO HOwnerRInfo (Username, Pass, Phone, Email) VALUES (?,?,?,?)");
		
		pst.setString(1, username);
		pst.setString(2, passw);
		pst.setString(3, phone);
		pst.setString(4, email);
		
		int upd = pst.executeUpdate();
		
		if(upd == 1)
		{
			System.out.println("Success!");
		}
		
		else
		{
			System.out.println("Not added!");
		}
		
		con.close();
	}

}
