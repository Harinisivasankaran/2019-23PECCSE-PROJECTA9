package servlet;

import imple.imple;
import inter.inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.clientregbean;

/**
 * Servlet implementation class clientreg
 */
@WebServlet("/clientreg")
public class clientreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientreg() {
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
		String name=request.getParameter("name");
		System.out.println("Name"+name);
		
		String email=request.getParameter("email");
		System.out.println("Email"+email);
		
		String pass=request.getParameter("pass");
		System.out.println("Pass"+pass);
		
		String cpass=request.getParameter("cpass");
		System.out.println("Cpass"+cpass);
		
		clientregbean c=new clientregbean();
		c.setName(name);
		c.setEmail(email);
		c.setPass(pass);
		c.setCpass(cpass);
		
		inter n=new imple();
		int b=n.reg(c);
		if(b==1){
			response.sendRedirect("clientlog.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
	}

}
