package Customer_Servs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Customer_UpdProfile
 */
public class Customer_UpdProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_UpdProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try 
		{
			
			// register driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish a connection with the database
			String url = "jdbc:mysql://localhost:3306/MajorProj";
			String user = "root";
			String password = "MySqlPass1234";
		
			
			Connection con = DriverManager.getConnection(url,user,password); 
			if(con!=null) {
				System.out.println("connection  scuccesful");
			}
			
			HttpSession session = request.getSession();
	        String user1 = (String) session.getAttribute("uname");
			
	
			String phonenumber = request.getParameter("phone");
			String email = request.getParameter("email");
			
			System.out.println(phonenumber);
			 
		    String mysql="UPDATE CustomerRInfo SET phone ='"+phonenumber+"',email ='"+email+"' WHERE username ='" + user1 + "'";
		    Statement stmt = con.createStatement(); 
		    
			int result=stmt.executeUpdate(mysql);
			
			if(result == 1)
			{
				System.out.println("Updated!!");
			}
			
			con.close();
			
			response.sendRedirect("Customer.jsp");

		}
		catch(SQLException | ClassNotFoundException e) 
		{
			System.out.println(e);
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
