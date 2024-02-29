import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/login"})
public class Login extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3177365705098477772L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		if((name.equals("giap") && password.equals("123456")) || (name.equals("thanh") && password.equals("123456"))) {
			Cookie cookie = new Cookie("username", name);
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			resp.sendRedirect("/testLogin/welcome");
		}
		
		else {
			resp.sendRedirect("/testLogin/index.jsp");
		}
		
	}
}









