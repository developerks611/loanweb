/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-03-10 11:56:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/T:/softwares%20pro/Loan%20App/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/loan-web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1660112728163L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("textarea{\r\n");
      out.write("	resize:none;\r\n");
      out.write("	font-size:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  font-family: Arial, Tahoma, Serif;\r\n");
      out.write("  color: #263238;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content:space-between; \r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding: 1rem 2rem;\r\n");
      out.write("  background: #e06666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  list-style: none; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav li {\r\n");
      out.write("  padding-left: 1rem; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav a {\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  color: black;\r\n");
      out.write("  font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write(" text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".txt_input{\r\n");
      out.write("\r\n");
      out.write("	width:30%;\r\n");
      out.write("	height:auto;\r\n");
      out.write("	margin:10px;\r\n");
      out.write("	padding:10px;\r\n");
      out.write("	font-size:100%;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".createAccount{\r\n");
      out.write("\r\n");
      out.write("	background-color:green;\r\n");
      out.write("	outline: none;\r\n");
      out.write("    border: none;\r\n");
      out.write("    width:20%;\r\n");
      out.write("    height:50px;;\r\n");
      out.write("    font-size:100%;\r\n");
      out.write("    padding:10px;\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".msg{\r\n");
      out.write("	color:red;\r\n");
      out.write("	\r\n");
      out.write("	font-weight:bold;\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container{\r\n");
      out.write("	margin-top:10%;\r\n");
      out.write("}\r\n");
      out.write(" /* \r\n");
      out.write("  Extra small devices (phones, 600px and down) \r\n");
      out.write("*/\r\n");
      out.write("@media only screen and (max-width: 600px) {\r\n");
      out.write("  nav {\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("  }\r\n");
      out.write("  nav ul {\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    padding-top: 0.5rem;\r\n");
      out.write("  }\r\n");
      out.write("  nav li {\r\n");
      out.write("    padding: 0.5rem 0;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Customer Registration</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div  class=\"container\">\r\n");
      out.write("<div id=\"msg\" class=\"msg\"></div>\r\n");
      out.write("<p class=\"msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<p>\r\n");
      out.write("<form action=\"addData\" method=\"post\">\r\n");
      out.write("<input type=\"text\" name=\"fname\" placeholder=\"Name\" required class=\"txt_input\"><br>\r\n");
      out.write("<input type=\"date\" name=\"dob\" required class=\"txt_input\" id=\"dob\" onChange=\"ageCalculator()\"><br>\r\n");
      out.write("<textarea placeholder=\"Address\" required name=\"Customer Adress\" required class=\"txt_input\"></textarea ><br>\r\n");
      out.write("<input type=\"text\" name=\"nic\" placeholder=\"Nic\" required class=\"txt_input\"><br>\r\n");
      out.write("<input type=\"email\" name=\"email\" placeholder=\"Email\" required class=\"txt_input\"><br>\r\n");
      out.write("<input type=\"password\" name=\"password\" placeholder=\"Password\" required class=\"txt_input\"><br><br>\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"addClient\">\r\n");
      out.write("\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-success createAccount\">Create Account</button>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>  \r\n");
      out.write("function ageCalculator() {  \r\n");
      out.write("    var userinput = document.getElementById(\"dob\").value;  \r\n");
      out.write("    var dob = new Date(userinput);  \r\n");
      out.write(" \r\n");
      out.write("      \r\n");
      out.write("    //calculate month difference from current date in time  \r\n");
      out.write("    var month_diff = Date.now() - dob.getTime();  \r\n");
      out.write("      \r\n");
      out.write("    //convert the calculated difference in date format  \r\n");
      out.write("    var age_dt = new Date(month_diff);   \r\n");
      out.write("      \r\n");
      out.write("    //extract year from date      \r\n");
      out.write("    var year = age_dt.getUTCFullYear();  \r\n");
      out.write("      \r\n");
      out.write("    //now calculate the age of the user  \r\n");
      out.write("    var age = Math.abs(year - 1970);  \r\n");
      out.write("    \r\n");
      out.write("    if(age>=18){\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    else{\r\n");
      out.write("        \r\n");
      out.write("       document.getElementById(\"dob\").value = \"\";\r\n");
      out.write("       document.getElementById(\"msg\").innerHTML = \"*** Sorry Age not enough ***\";\r\n");
      out.write("         \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //display the calculated age  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("}  \r\n");
      out.write("</script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
