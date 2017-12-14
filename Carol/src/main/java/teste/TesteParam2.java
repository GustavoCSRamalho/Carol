package teste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.dao.BancoDAO;

import com.site.dao.Inter;
import com.site.modelos.Conteudo;
import com.site.modelos.DadosUsuario;



@WebServlet(name = "TesteParam2", urlPatterns = {"teste123"}) 
public class TesteParam2 extends HttpServlet {
    
	public static BancoDAO dao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	String conteudo = request.getParameter("id");
    	System.out.println("Conteudo "+conteudo);
//		request.setAttribute("lista", lista);
    	request.setAttribute("id", conteudo);
    	request.getRequestDispatcher("forteste.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
    	
    }
}
