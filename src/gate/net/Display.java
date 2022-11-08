package gate.net;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Display() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qualification =request.getParameter("qual");
		String address=request.getParameter("address");
		
		Cookie[] c=request.getCookies();
		
		PrintWriter out=response.getWriter();
		

		out.println("SID :" +c[0].getValue());
		out.println("password :" +c[1].getValue());
		out.println("email :" +c[2].getValue());
		out.println("mobile :" +c[3].getValue());
		
		out.println("qualification :" +qualification);
		out.println("address :" +address);
		
		
		
	}

}
