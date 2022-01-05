package house_Owner;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HouseOwnerDB
 */
	public class HouseOwnerServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HouseOwnerServ1() {
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
		//doGet(request, response);
		
		String username = request.getParameter("uname");
		String passw = request.getParameter("psw");
		String submitType = request.getParameter("submit");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		/*
		 * HttpSession session = request.getSession();
		 * 
		 * session.setAttribute("username", username);
		 */
		
		HouseOwnerDB HODB = new HouseOwnerDB();
		
		try {
			HODB.Login(username, passw);
			
			if (submitType.equals("house_owner_login") && passw != null)
			{
				session.setAttribute("uname", username);
				out.println("<a href = 'HOwnerView'>Click Here </a>");
				Cookie loginCookie = new Cookie("user",username);
				loginCookie.setMaxAge(60);
				response.addCookie(loginCookie);
				//request.getRequestDispatcher("Howner.jsp").forward(request, response);
				response.sendRedirect("Howner.jsp");
			}
			
			else
			{
				request.setAttribute("message","Username/Password combination does not match!");
				request.getRequestDispatcher("").forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
