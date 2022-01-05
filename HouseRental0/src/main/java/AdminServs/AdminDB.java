package AdminServs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDB implements AdminInfo{
	
	static Connection con;
	static PreparedStatement ps;
	@Override
	public AdminUP getAdminUP(String username, String password) {
		AdminUP a = new AdminUP();
		try
		{
			con = AdminConnection.getCon();
			ps=con.prepareStatement("select * from AdminInfo where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				a.setUsername(rs.getString(1));
				a.setPassword(rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return a;
	}

}
