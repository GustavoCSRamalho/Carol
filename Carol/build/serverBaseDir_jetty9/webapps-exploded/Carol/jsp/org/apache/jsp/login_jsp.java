package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("   \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pontos Criticos da Cidade - Facilitando o Dia-a-Dia</title>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"indicando os pontos criticos da cidade de sao jose dos campos\"/>\n");
      out.write("        <meta name\"keywords\" content=\"problemas,ruas,acidentes,inchentes,congestionamento\" />\n");
      out.write("        <meta name=\"author\" content=\"Caroline Teixeira\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"C:\\Users\\Carol\\Desktop\\SIte\\estilo.css\"/>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("   <script>\n");
      out.write("     $(document).ready(function() {\n");
      out.write("         $(\"#login\").click(function() {\n");
      out.write("             servletCall();\n");
      out.write("         });\n");
      out.write("\n");
      out.write("     });\n");
      out.write("     function servletCall() {\n");
      out.write("         $.post(\n");
      out.write("             \"login\", \n");
      out.write("             {name : \"Message from jsp\"}, //meaasge you want to send\n");
      out.write("             function(result) {\n");
      out.write("             $('#somediv').html('Here is your result : <strong>' + result + '</strong>'); //message you want to show\n");
      out.write("         \n");
      out.write("             });\n");
      out.write("     };\n");
      out.write("     function logar() {\n");
      out.write(" \t\t$.ajax({\n");
      out.write("             url: \"login\",\n");
      out.write("             type: \"POST\",\n");
      out.write("             data: {user: $(\"#usuario\").val()},\n");
      out.write("             success: function(form){\n");
      out.write("                 $(\"#somediv\").html(form);\n");
      out.write("             }\n");
      out.write("         });\n");
      out.write("   </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("                <img id=\"imagem\" src=\"C:\\Users\\Carol\\Desktop\\SIte\\img\\fundo.jpg\"/>\n");
      out.write("                <div class=\"texto\">Pontos Criticos </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <form class=\"baseForm\" method=\"post\" action=\"login\">\n");
      out.write("            Nome de Usuário:\n");
      out.write("            <input class=\"formInput formTextInput\" id=usuario type=\"text\" name=\"usuario\"> \n");
      out.write("            Senha:\n");
      out.write("            <input class=\"formInput formTextInput\" id=senha type=\"password\" name=\"senha\">\n");
      out.write("            <input id=\"login\" class=\"formInput submit\" type=\"submit\" >\n");
      out.write("            <a  href=\"cadastro\" id=\"cadastro\">Cadastrar</a> \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            <div id=\"somediv\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
