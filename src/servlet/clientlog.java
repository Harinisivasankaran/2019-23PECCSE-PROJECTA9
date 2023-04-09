package servlet;

import imple.imple;
import inter.inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.clientregbean;

/**
 * Servlet implementation class clientlog
 */
@WebServlet("/clientlog")
public class clientlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientlog() {
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
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		System.out.println("Email"+email);
		
		HttpSession session=request.getSession();
		session.setAttribute("cmail", email);
		
		String pass=request.getParameter("pass");
		System.out.println("Pass"+pass);
		
		clientregbean l=new clientregbean();
		l.setEmail(email);
		l.setPass(pass);
		
		inter n=new imple();
		boolean v=n.log(l);
		if(v==true){
			response.sendRedirect("clientmain.jsp");
			
		}
		else{
			response.sendRedirect("error.jsp");
		}
	}

}
