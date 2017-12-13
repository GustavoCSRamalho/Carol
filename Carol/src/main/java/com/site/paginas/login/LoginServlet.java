package com.site.paginas.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"login"}, loadOnStartup = 1) 
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//    	doPost(request, response);
    	request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	request.getRequestDispatcher("ponte.jsp").forward(request, response);
//        String name = request.getParameter("name");
//        if (name == null) name = "World";
//        request.setAttribute("user", name);
//        request.getRequestDispatcher("teste/response.jsp").forward(request, response); 
    }
}