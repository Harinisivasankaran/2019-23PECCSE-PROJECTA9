package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbcon.dbcon;

/**
 * Servlet implementation class Charge
 */
@WebServlet("/Charge")
public class Charge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Charge() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
String id = req.getParameter("id");
		
		String weight = req.getParameter("weight");
		
		String amount = req.getParameter("amount");
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		int z=0;
 		try {
 		Connection con=dbcon.create();
 			Statement st= con.createStatement();
     		//String sql="UPDATE bus.documents a SET details='"+up.getDetails()+"',datedone='"+up.getDone()+"',expiry='"+up.getExpiry()+"',busno='"+up.getBusno()+"',drivername='"+up.getDrivername()+"',filename='"+up.getFilename()+"' WHERE id='"+id+"'";
     		int row=0;
 			
 				row = st.executeUpdate("UPDATE transport.clientform SET charge='"+amount+"' WHERE id='"+id+"'");
 			System.out.println("jhggv"+row);
     		z=1;
        
          
          
           
             if(z==row) 
             {
             	resp.sendRedirect("parchalview.jsp");
             }
             else
             {
             	resp.sendRedirect("error.jsp");
             }
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}	
 		}
	}