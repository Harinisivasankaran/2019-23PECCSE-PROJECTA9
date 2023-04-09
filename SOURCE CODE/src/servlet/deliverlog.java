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

import bean.deliverybean;

/**
 * Servlet implementation class deliverlog
 */
@WebServlet("/deliverlog")
public class deliverlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deliverlog() {
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
		String taddress=request.getParameter("fdistrict");
		System.out.println("Email"+taddress);
		
		HttpSession session=request.getSession();
		session.setAttribute("taddress", taddress);
		
		String pass=request.getParameter("pass");
		System.out.println("Pass"+pass);
		
		deliverybean c=new deliverybean();
		c.setTaddress(taddress);
		c.setPass(pass);
		
		inter n=new imple();
		boolean b=n.dlog(c);
		if(b==true){
			response.sendRedirect("deliverymain.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
	}
}