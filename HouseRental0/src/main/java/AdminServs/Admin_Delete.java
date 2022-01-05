package AdminServs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin_Delete
 */
public class Admin_Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id = request.getQueryString();
		String[] ids = id.split("=");
		System.out.println(ids[1]);
		String query = ids[1];
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/MajorProj";

	    	String user = "root";

	    	String pass = "MySqlPass1234";

	    	Connection con = DriverManager.getConnection(url, user, pass);
	    	
	    	PreparedStatement pstmt = con.prepareStatement("delete from HOwnerRInfo where username = ?");
        	pstmt.setString(1, query);
        	
        	int update = pstmt.executeUpdate();
        	
        	if (update == 1)
        	{
        		System.out.println("Deleted Successfully!!");
        	}
        	
        	else
        	{
        		System.out.println("Record not found!");
        	}
        	
        	response.sendRedirect("Admin_Edit");
        	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
