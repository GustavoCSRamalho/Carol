package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ponte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("                <img id=\"imagem\" src=\"C:\\Users\\Carol\\Desktop\\SIte\\img\\fundo.jpg\"/>\n");
      out.write("                <div class=\"texto\">Pontos Criticos - Filtre ou Adicione </div>\n");
      out.write("       <form class=\"baseForm\" method=\"post\" action=\"\">\n");
      out.write("            Filtre pelo nome da rua:\n");
      out.write("            <input class=\"formInput formTextInput\" id=rua type=\"text\" name=\"rua\"> \n");
      out.write("            <input class=\"formInput submit\" type=\"submit\" value=\"Filtrar\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            Adicione um Novo Ponto Crítico:\n");
      out.write("            <a  href=\"teste.html\" id=\"cadastro\">Adicionar</a> \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("            \n");
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
