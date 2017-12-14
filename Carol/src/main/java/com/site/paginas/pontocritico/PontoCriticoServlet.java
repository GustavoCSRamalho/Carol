package com.site.paginas.pontocritico;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.dao.BancoDAO;

import com.site.dao.Inter;
import com.site.modelos.Conteudo;
import com.site.modelos.DadosUsuario;



@WebServlet(name = "PontoCriticoServlet", urlPatterns = {"addponto"}) 
public class PontoCriticoServlet extends HttpServlet {
    
	public static BancoDAO dao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//    	doPost(request, response);
    	System.out.println("OI");
    	request.getRequestDispatcher("teste.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	Conteudo po= new Conteudo();
    	dao = new BancoDAO();
    	String msg= request.getParameter("mensagem");
    	String end= request.getParameter("endereco");
    	po.setDetalhes(msg);
    	po.setEndereco(end);
    	dao.inserir(po);
    	request.getRequestDispatcher("ponte.jsp").forward(request, response);
    	
    }
}
