package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Adicionar</title>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"UTF-8\"> \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/estilo.css\"/>  \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <img id=\"imagem\" src=\"imagem/fundo.jpg\"/>\r\n");
      out.write("    <div class=\"texto\">Pontos Criticos - Ajude e Adicione </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form class=\"add\" method=\"post\" action=\"addponto\">\r\n");
      out.write("            <label > Endereco:</label>\r\n");
      out.write("            <input class=\"formInput formTextInput\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=id  type=\"text\" name=\"id\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("            \r\n");
      out.write("            <input class=\"formInput formTextInput\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=nome  type=\"text\" name=\"nome\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("            <input class=\"formInput formTextInput\" placeholder=\"Digite o Endereco \" id=endereco type=\"text\" name=\"endereco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <label> Tipo:</label>\r\n");
      out.write("            <input type=\"radio\" name=\"op\" value=\"Inchentes\"> Inchentes\r\n");
      out.write("            <input type=\"radio\" name=\"op\" value=\"Assaltos\"> Assaltos\r\n");
      out.write("            <input type=\"radio\" name=\"op\" value=\"Acidentes\"> Acidentes\r\n");
      out.write("            <label> Mensagem:</label>\r\n");
      out.write("            <textarea class=\"msg\" placeholder=\"Descreva o ocorrido\" name=\"mensagem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("            <input type=\"file\"  name=\"foto\">\r\n");
      out.write("            \r\n");
      out.write("            <input class=\"btn btn-confirm block\" type=\"submit\" value=\"Enviar\">\r\n");
      out.write("            <a href=\"ponte?user=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Voltar</a>  \r\n");
      out.write("            \r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
