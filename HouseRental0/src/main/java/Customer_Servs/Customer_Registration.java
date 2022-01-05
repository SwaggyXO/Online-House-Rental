package Customer_Servs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import house_Owner.HOwnerRegisterDB;

/**
 * Servlet implementation class Customer_Registration
 */
public class Customer_Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String username = request.getParameter("uname");
		String pass = request.getParameter("psw");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String submitType = request.getParameter("submit");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		CustomerRegisterDB crdb = new CustomerRegisterDB();
		
		try {
			crdb.Register(username, pass, phone, email);
			
			if (submitType.equals("customer_register") && pass != null)
			{
				session.setAttribute("uname", username);
				out.println("<html><body><h2> Registration Successful!! </h2></body></html>");
				out.println("<a href = 'Customer.jsp'>Click here to visit the homepage!</a>");
				Cookie loginCookie = new Cookie("user",username);
				loginCookie.setMaxAge(60);
				response.addCookie(loginCookie);
			}
			
			else
			{
				request.setAttribute("message","Username/Password combination does not match!");
				request.getRequestDispatcher("").forward(request, response);
			}
		
	}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
