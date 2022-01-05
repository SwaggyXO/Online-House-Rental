package house_Owner;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update1
 */
public class update1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update1() {
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
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/MajorProj";
			String user = "root";
			String password = "MySqlPass1234";
		
			
			Connection con = DriverManager.getConnection(url,user,password); 
			if(con!=null) {
				System.out.println("connection  scuccesful");
			}
				
			String hid = request.getParameter("hid");
			String hdescrip = request.getParameter("hdescrip");
			String hcost = request.getParameter("hcost");
			String hmonth = request.getParameter("hmonth");
			String hsecurity = request.getParameter("hsecurity");
		 
			String mysql="UPDATE housedetails SET hdescrip ='"+hdescrip+"',hcost ='"+hcost+"',hmonth ='"+hmonth+"',hsecurity ='"+hsecurity+"' WHERE hid ="+hid;
			Statement stmt = con.createStatement(); 	
			int result=stmt.executeUpdate(mysql);
			
			response.sendRedirect("HOwnerView");
		 
			con.close(); 
         
        
        
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
		doGet(request, response);
	}

}
