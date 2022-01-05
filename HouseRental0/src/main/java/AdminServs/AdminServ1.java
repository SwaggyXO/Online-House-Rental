package AdminServs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServ1
 */
public class AdminServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServ1() {
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
		
		if (request.getAttribute("loggedIn")=="true")
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
		AdminInfo aInfo = new AdminDB();
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("psw");
		String submitType = request.getParameter("submit");
		AdminUP a = aInfo.getAdminUP(uname, pwd);
		
		if (submitType.equals("admin_login") && a.getPassword()!=null)
		{
			Cookie loginCookie = new Cookie("user",uname);
			loginCookie.setMaxAge(60);
			response.addCookie(loginCookie);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("message","Username/Password combination does not match!");
			request.getRequestDispatcher("").forward(request, response);
		}
	}

}
