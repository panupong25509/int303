package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PrimeNumberView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>:: Prime Site ::</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: blanchedalmond; \n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        div {\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            background-color: white;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            text-align: center;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("        .result {\n");
      out.write("            color: cadetblue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div><h1>Check Prime Number ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1></div><hr>\n");
      out.write("        <p>Enter number : </p>\n");
      out.write("        <form action=\"PrimeNumberServlet\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"number\"/>\n");
      out.write("            <input type=\"submit\"/>\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        <h1> :: Result :: </h1><h1 class=\"result\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${primenumber.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${primenumber.check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1> \n");
      out.write("    </body>\n");
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
