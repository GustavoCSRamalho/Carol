package com.site.paginas.ponte;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.dao.BancoDAO;
import com.site.modelos.DadosUsuario;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "PonteServlet", urlPatterns = {"ponte"}, loadOnStartup = 1) 
public class PonteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//    	doPost(request, response);
    	String user = request.getParameter("user");
    	request.setAttribute("user", user);
    	request.getRequestDispatcher("ponte.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	HttpSession sessao = request.getSession();
    	
    	
    	String user = request.getParameter("usuario");
    	String password = request.getParameter("senha");
    	BancoDAO dao = new BancoDAO();
    	
    	List<Object> listaRecebida =  (dao.findAll("DadosUsuario"));
    	for(Object objeto : listaRecebida) {
    		DadosUsuario du = (DadosUsuario)objeto;
    		if(user.equals(du.getUsuario()) && password.equals(du.getSenha())) {
    			sessao.setAttribute("user", du.getUsuario());
    			sessao.setAttribute("id",du.getId());
    			request.setAttribute("user", (String)sessao.getAttribute("user"));
    			request.getRequestDispatcher("ponte.jsp").forward(request, response);
    		
    		}
    	}
    	request.getRequestDispatcher("login.jsp").forward(request, response);
        
    }
}