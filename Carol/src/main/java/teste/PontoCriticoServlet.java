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



@WebServlet(name = "teste", urlPatterns = {"teste"}) 
public class PontoCriticoServlet extends HttpServlet {
    
	public static BancoDAO dao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//    	doPost(request, response);
    	System.out.println("OI");
    	List<String> lista = new ArrayList<>();
    	lista.add("Ola");
    	lista.add("eita");
    	request.setAttribute("lista", lista);
    	request.getRequestDispatcher("forteste.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
    	
    }
}
