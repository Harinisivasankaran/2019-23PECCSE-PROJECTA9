package servlet;

import imple.imple;
import inter.inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.clientformbean;

/**
 * Servlet implementation class clientform
 */
@WebServlet("/clientform")
public class clientform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientform() {
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
		System.out.println("name"+name);
		
		String email=request.getParameter("email");
		System.out.println("Email"+email);
		
		String cnumber=request.getParameter("num");
		System.out.println("cnumber"+cnumber);
		
		String faddress=request.getParameter("address");
		System.out.println("faddress"+faddress);
		
		String fdistrict=request.getParameter("fdistrict");
		System.out.println("fdistrict"+fdistrict);
		
		String fstate=request.getParameter("fstate");
		System.out.println("fstate"+fstate);
		
		String taddress=request.getParameter("taddress");
		System.out.println("taddress"+taddress);
		
		String tdistrict=request.getParameter("tdistrict");
		System.out.println("tdistrict"+tdistrict);
		
		String tstate=request.getParameter("tstate");
		System.out.println("tstate"+tstate);
		
		String weight=request.getParameter("kl");
		System.out.println("weigth"+weight);
		
		String date=request.getParameter("date");
		System.out.println("date"+date);
		
	
		
		clientformbean c=new clientformbean();
		c.setName(name);
		c.setEmail(email);
		c.setCnumber(cnumber);
		c.setFaddress(faddress);
		c.setFdistrict(fdistrict);
		c.setFstate(fstate);
		c.setTaddress(taddress);
		c.setTdistrict(tdistrict);
		c.setTstate(tstate);
		c.setWeight(weight);
		c.setDate(date);
		
		
		inter n=new imple();
		int b=n.form(c);
		if(b==1){
			response.sendRedirect("clientmain.jsp");
			
		}
		else{
			response.sendRedirect("error.jsp");
		}
		
	}

}
