package com.site.paginas.sair;

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

@WebServlet(name = "SairServlet", urlPatterns = {"sair"}, loadOnStartup = 1) 
public class SairServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//    	doPost(request, response);
    	request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	   
    }
}