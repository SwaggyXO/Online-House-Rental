package AdminServs;

import java.sql.*;

public class AdminConnection {
	
	static Connection con = null;

	public static Connection getCon() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/majorproj";

		    String user = "root";

		    String pass = "MySqlPass1234";
			
			con = DriverManager.getConnection(url, user, pass);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

}
