package Customer_Servs;

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
 * Servlet implementation class Customer_View
 */
public class Customer_View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_View() {
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
			
			String query = "select * from housedetails";
			
			/*
			 * PreparedStatement pstmt = con.prepareStatement(query);
			 * 
			 * pstmt.setString(1, (String) user1);
			 */
			
			ResultSet rst = stmt.executeQuery(query);
			
			out.print("<html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"></head><table class='table table-bordered border-primary' border='1' width='100%'"
        			+ "<body>"
        			+ "<tr><th>House ID</th>"
        			+ "<th>House No</th>"
        			+ "<th>Floor No</th>"
        			+ "<th>Location</th>"
        			+ "<th>House Description</th>"
        			+ "<th>Monthly Rent</th>"
        			+ "<th>Cost</th>"
        			+ "<th>Security Cost</th>"
        			+ "<th>Status</th>"
        			+ "<th>Rent</th>"
        			+ "</tr>"
        			+ "</body>"        			
        			+ "</html>");
        	
        	while (rst.next())
        	{
        		out.print("<tr>"
        				+ "<td>"+rst.getInt(1)+"</td>"
        				+ "<td>"+rst.getString(2)+"</td>"
        				+ "<td>"+rst.getInt(3)+"</td>"
        				+ "<td>"+rst.getString(4)+"</td>"
        				+ "<td>"+rst.getString(5)+"</td>"
        				+ "<td>"+rst.getLong(6)+"</td>"
        				+ "<td>"+rst.getLong(7)+"</td>"
        				+ "<td>"+rst.getLong(8)+"</td>"
        				+ "<td>"+rst.getString(10)+"</td>"
        				+ "<td><a href='Customer_Update.jsp'>Rent<a></td>"
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
		doGet(request, response);
	}

}
