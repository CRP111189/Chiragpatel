package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class allcookies_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

  Cookie[] cookies = request.getCookies();
  if (cookies == null)
    cookies = new Cookie[0];
  Date thisVisit = new Date();
  // add data cookie to session
  Cookie c = new Cookie("lastVisit",""+thisVisit);
  response.addCookie(c);
  // add cookie to session
  String name = request.getParameter("name");
  String value = request.getParameter("value");
  Cookie added = null;
  if (name!=null && value!=null && name.length()>0) {
    added = new Cookie(name,value);
    response.addCookie(added);
  }

      out.write("\n");
      out.write("<HTML>\n");
      out.write("  <HEAD>\n");
      out.write("    <TITLE>Cookie List</TITLE>\n");
      out.write("  </HEAD>\n");
      out.write("  <BODY>\n");
      out.write("    <H1>Cookie List</H1>\n");
      out.write("    This visit: ");
      out.print( thisVisit );
      out.write("<BR>\n");
      out.write("    Number of cookies: ");
      out.print( cookies.length );
      out.write("<BR>\n");
      out.write("    <H2>Cookies</H2>\n");
      out.write("    ");

    for (int i=0; i<cookies.length; i++) {
      out.println(cookies[i].getName()+":\t"+
        cookies[i].getValue()+"<BR>");
      // check if added cookie already present
      if (added!=null && added.getName().equals(cookies[i].getName()))
        added = null;
    }
    if (added != null)
      out.println("new cookie: "+added.getName()+":\t"+
        added.getValue()+"<BR>");
    
      out.write("\n");
      out.write("    <H2>New cookie</H2>\n");
      out.write("    <FORM>\n");
      out.write("      <P>Name: <INPUT TYPE='TEXT' NAME='name'></P>\n");
      out.write("      <P>Value: <INPUT TYPE='TEXT' NAME='value'></P>\n");
      out.write("      <INPUT TYPE='SUBMIT' VALUE='Add new value'>\n");
      out.write("    </FORM>\n");
      out.write("  </BODY>\n");
      out.write("</HTML>");
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
