package com.site.paginas.deletar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.dao.BancoDAO;

import com.site.dao.Inter;
import com.site.modelos.Conteudo;
import com.site.modelos.DadosUsuario;



@WebServlet(name = "DeletaServlet", urlPatterns = {"deletar"}) 
public class DeletaServlet extends HttpServlet {
    
	public static BancoDAO dao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {    	
//    	dao = new BancoDAO();
//    	HttpSession sessao = request.getSession();
//    	String user = (String)sessao.getAttribute("user");
		BancoDAO bd = new BancoDAO();
		String user = request.getParameter("user");
		String id = request.getParameter("id");
		
		
//		BancoDAO bd = new BancoDAO();
		 
		 List<Object> lista = bd.findAll("Conteudo");
//    	
//    	if(lista.isEmpty()) {
//    		request.setAttribute("user", user);
//    		request.getRequestDispatcher("atualizar.jsp").forward(request, response);
//    	}
    	List<Conteudo> listaConteudo = new ArrayList<Conteudo>();
    	for(Object ob : lista) {
    		Conteudo conteudo = (Conteudo) ob;
    		if(user.equals(conteudo.getNome())) {
    			listaConteudo.add(conteudo);
    		}
////    		
    	}
    	if(id != null) {
			if(Integer.parseInt(id) != 0) {
				bd.remove(Integer.parseInt(id), "Conteudo");
//				request.setAttribute("id", 0);
				lista = bd.findAll("Conteudo");
				listaConteudo = new ArrayList<Conteudo>();
		    	for(Object ob : lista) {
		    		Conteudo conteudo = (Conteudo) ob;
		    		if(user.equals(conteudo.getNome())) {
		    			listaConteudo.add(conteudo);
		    		}
////		    		
		    	}
				request.setAttribute("lista", listaConteudo);
		    	request.setAttribute("user", user);
				request.getRequestDispatcher("deletar.jsp").forward(request, response);
			}
			
		}
    	request.setAttribute("lista", listaConteudo);
    	request.setAttribute("user", user);
		request.getRequestDispatcher("deletar.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	      
    }
}
