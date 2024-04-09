package reqst_disptcher_pack;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Enter your details : ");
		
		String user=request.getParameter("username");
		String pss=request.getParameter("userpass");
		
		if(pss.equals("servlet"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request,response);
		}
		else
		{
			out.println("Sorry username or password error!");
			out.println("Try again");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request,response);
		}
		
	}

}
