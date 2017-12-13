package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class informacoes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cadastro</title>\n");
      out.write("        <meta charset=\"UTF-8\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">  \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \t<img id=\"imagem\" src=\"imagem/fundo.jpg\">\n");
      out.write("        <div class=\"texto\">Pontos Criticos -  Cadastramento </div>\n");
      out.write("    \t \n");
      out.write("    \t<form id=\"test\" class=\"baseForm\" method=\"post\" action=\"cadastro\"> <!-- method=\"post\"  action=\"cadastro\" -->\n");
      out.write("            Nome Completo:\n");
      out.write("            <input class=\"formInput formTextInput\" id=\"nome\" type=\"text\" name=\"nome\">\n");
      out.write("            <label for=\"cpf\">CPF:</label>\n");
      out.write("            <input class=\"formInput formTextInput\" id=\"cpf\" type=\"number\" name=\"cpf\">\n");
      out.write("            Endereço:\n");
      out.write("            <input class=\"formInput formTextInput\" id=\"endereco\" type=\"text\" name=\"endereco\">\n");
      out.write("            Email:\n");
      out.write("            <input class=\"formInput formTextInput\" id=email type=\"text\" name=\"email\">\n");
      out.write("            Nome de Usuario:\n");
      out.write("            <input class=\"formInput formTextInput\" id=usuario type=\"text\" name=\"usuario\"> \n");
      out.write("            Senha:\n");
      out.write("            <input class=\"formInput formTextInput\" id=senha type=\"password\" name=\"senha\">\n");
      out.write("            Sexo:\n");
      out.write("            <input type=\"radio\" name=\"feminino\" value=\"Feminino\"> Feminino\n");
      out.write("            <input type=\"radio\" name=\"masculino\" value=\"Masculino\"> Masculino\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("           \t<button class=\"formInput submitButton\" type=\"submit\">Submit</button> <!-- //value=\"Cadastrar\"> //onclick=\"showName(e)\"    -->\n");
      out.write("           \t<button class=\"btn btn-default\" type=\"reset\"> Limpar</button>           \n");
      out.write("           \t<a href=\"javascript:void(0);\" class=\"btn btn-confirm\" onclick=\"showName()\">Enviar</a>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\t<script>\n");
      out.write("    \tfunction showName(){\n");
      out.write("        \t//armazenando os valores no em uma variavel para evitar ficar percorrendo no DOM, ajuda em performance\n");
      out.write("           \tvar form = document.getElementById(\"test\");\n");
      out.write("           \tvar nome = document.getElementById(\"nomeCompleto\").value;\n");
      out.write("           \tvar cpf = document.getElementById(\"cpf\").value;\n");
      out.write("           \tvar endereco = document.getElementById(\"endereco\").value;\n");
      out.write("           \tvar email = document.getElementById(\"email\").value;\n");
      out.write("           \tvar nomeUsuario = document.getElementById(\"nomeUsuario\").value;\n");
      out.write("           \tvar sexo = document.getElementById(\"test\").elements[\"Sexo\"].value;\n");
      out.write("\n");
      out.write("           \tvar pessoa = {\n");
      out.write("           \t\tnome : nome,\n");
      out.write("           \t\tcpf : cpf,\n");
      out.write("           \t\tendereco : endereco,\n");
      out.write("           \t\temail : email,\n");
      out.write("           \t\tnomeUsuario : nomeUsuario,\n");
      out.write("           \t\tsexo : sexo\n");
      out.write("           \t};\n");
      out.write("\n");
      out.write("           \t//Template string, do EcmaScript2016\n");
      out.write("           \tform.innerHTML = `\n");
      out.write("           \t\t<div>\n");
      out.write("           \t\t\t<p><strong>Nome</strong> :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("           \t\t\t<p><strong>CPF</strong> :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("           \t\t\t<p><strong>EndereÃ§o</strong> :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("           \t\t\t<p><strong>Email</strong> :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("           \t\t\t<p><strong>Nome de UsuÃ¡rio</strong> :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.nomeUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("           \t\t\t<p><strong>Sexo</strong> :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.sexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("           \t\t</div> \n");
      out.write("           \t`;\n");
      out.write("           \t\t};\n");
      out.write("           \t</script>\n");
      out.write("</html>\n");
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
