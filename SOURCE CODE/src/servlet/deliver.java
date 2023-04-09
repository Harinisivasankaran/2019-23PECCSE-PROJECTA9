package servlet;

import imple.imple;
import inter.inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.deliverybean;

/**
 * Servlet implementation class deliver
 */
@WebServlet("/deliver")
public class deliver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deliver() {
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
		String name=request.getParameter("username");
		System.out.println("Name"+name);
		
		String taddress=request.getParameter("tdistrict");
		System.out.println("Email"+taddress);
		
		String pass=request.getParameter("pass");
		System.out.println("Pass"+pass);
		
		String cpass=request.getParameter("cpass");
		System.out.println("Cpass"+cpass);
		
		deliverybean c=new deliverybean();
		c.setName(name);
		c.setTaddress(taddress);
		c.setPass(pass);
		c.setCpass(cpass);
		
		inter n=new imple();
		int b=n.dreg(c);
		if(b==1){
			response.sendRedirect("deliveryhublog.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
	}

	}

