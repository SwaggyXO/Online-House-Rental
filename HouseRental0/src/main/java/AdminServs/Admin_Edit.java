package AdminServs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin_Edit
 */
public class Admin_Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession();
        String user1 = (String) session.getAttribute("uname");
        
        System.out.println(user1);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/MajorProj";
			String user = "root";
			String password = "MySqlPass1234";
			
			Connection con = DriverManager.getConnection(url,user,password); 
			Statement stmt = con.createStatement();
			
			String query = "select * from HOwnerRInfo";
			
			/*
			 * PreparedStatement pstmt = con.prepareStatement(query);
			 * 
			 * pstmt.setString(1, (String) user1);
			 */
			
			ResultSet rst = stmt.executeQuery(query);
			
			out.print("<html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"></head><table class='table table-bordered border-primary' border='1' width='100%'"
        			+ "<body>"
        			+ "<tr><th>Username</th>"
        			+ "<th>Pass</th>"
        			+ "<th>Phone No.</th>"
        			+ "<th>Email</th>"
        			+ "<th>Delete</th>"
        			+ "</tr>"
        			+ "</body>"        			
        			+ "</html>");
        	
        	while (rst.next())
        	{
        		out.print("<tr>"
        				+ "<td>"+rst.getString(1)+"</td>"
        				+ "<td>"+rst.getString(2)+"</td>"
        				+ "<td>"+rst.getString(3)+"</td>"
        				+ "<td>"+rst.getString(4)+"</td>"
        				+ "<td><a href='Admin_Delete?user="+rst.getString(1)+"'>Delete<a></td>"
        				+ "</tr>");
        	}
			
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
		//doGet(request, response);
	}

}
