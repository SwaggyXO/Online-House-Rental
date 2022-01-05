package house_Owner;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class insert
 */
public class AddHouse extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHouse() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // TODO Auto-generated method stub
    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String user1 = (String) session.getAttribute("uname");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/MajorProj";
            String user = "root";
            String password = "MySqlPass1234";
            Connection con = DriverManager.getConnection(url,user,password);

            Statement stmt1 = con.createStatement();
            String createtable = "create table if not exists housedetails(HID INT PRIMARY KEY, HNUM VARCHAR(10), HFLOOR INT, HLOC VARCHAR(60), HDESCRIP VARCHAR(200), HMONTH LONG, HCOST LONG, HSECURITY LONG, HUSER varchar(20), HSTATUS varchar(20))";
            stmt1.executeUpdate(createtable);
            String sql = "INSERT INTO housedetails (hid, hnum, hfloor, hloc, hdescrip, hmonth, hcost, hsecurity, huser, hstatus) VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, request.getParameter("hid"));
            stmt.setString(2, request.getParameter("hnum"));
            stmt.setString(3, request.getParameter("hfloor"));
            stmt.setString(4, request.getParameter("hloc"));
            stmt.setString(5, request.getParameter("hdescrip"));
            stmt.setString(6, request.getParameter("hmonth"));
            stmt.setString(7, request.getParameter("hcost"));
            stmt.setString(8, request.getParameter("hsecurity"));
            stmt.setString(9, user1);
            stmt.setString(10, "TO RENT");
        
        int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0)
        {
            System.out.println("Insertion Successful!");
        }
        
        response.sendRedirect("Howner.jsp");
    }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // TODO Auto-generated method stub
        
    }

}
