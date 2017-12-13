package com.site.paginas.cadastroinformacoes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InformacoesServlet", urlPatterns = {"informacoes"}, loadOnStartup = 1) 
public class InformacoesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
    	request.getRequestDispatcher("informacoes.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//        String name = request.getParameter("name");
//        if (name == null) name = "World";
//        request.setAttribute("user", name);
//        request.getRequestDispatcher("teste/response.jsp").forward(request, response); 
    }
}
