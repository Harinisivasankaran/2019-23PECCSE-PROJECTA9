package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class manage
 */
@WebServlet("/manage")
public class manage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public manage() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fdistrict=request.getParameter("fdistrict");
		System.out.println("fdistrict "+fdistrict);
		

		HttpSession session=request.getSession();
		session.setAttribute("umail",fdistrict);
		
		String pass=request.getParameter("regid");
		System.out.println("password "+pass);
		
		
	
		
			
		
		if(fdistrict.equals("CHENNAI") && pass.equals("CHENNAI")) {
				
			response.sendRedirect("managermain.jsp");
			
		}
		
		else if(fdistrict.equals("TRICY") && pass.equals("TRICY")){
			
			response.sendRedirect("managermain.jsp");
		}
		
else if(fdistrict.equals("KANYAKUMARI") && pass.equals("KANYAKUMARI")){
			
	response.sendRedirect("managermain.jsp");
		}
		
		
else if(fdistrict.equals("COIMBATORE") && pass.equals("COIMBATORE")){
			
	response.sendRedirect("managermain.jsp");
		}
/*		
else if(fdistrict.equals("THIRUNELVELI") && pass.equals("Th123")){
			
	response.sendRedirect("managermain.jsp");
		}*/
else if(fdistrict.equals("THIRUNELVELI") && pass.equals("THIRUNELVELI")){
	
	response.sendRedirect("managermain.jsp");
		}
		
else if(fdistrict.equals("ERODE") && pass.equals("ERODE")){
			
	response.sendRedirect("managermain.jsp");
		}
		
		

					
	else{
		response.sendRedirect("Error.jsp");
	}

		
		
	}



}
