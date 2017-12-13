import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "GetUserServlet", urlPatterns = { "GetUserServlet" }, loadOnStartup = 1)
public class GetUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1");
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2");
		String text = "Update successfull"; // message you will recieve
		String name = request.getParameter("name");
		// PrintWriter out = response.getWriter();
		// out.println(name + " " + text);
		request.setAttribute("name", name + " " + text + " Foi!!2313");
		request.getRequestDispatcher("teste.jsp").forward(request, response);

	}
}