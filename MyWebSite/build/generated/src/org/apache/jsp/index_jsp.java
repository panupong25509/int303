package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import product.mockup.model.Product;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>:: JOKSITE ::</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"img/logos/teddy-bear.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <!-- Custom fonts for this template -->\r\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"css/agency.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- data table -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/datatables.css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" id=\"mainNav\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">JOK SITE</a>\r\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    Menu\r\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("                    <ul class=\"navbar-nav text-uppercase ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#func\">Functions</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#simplecalc\">Simple Calculator</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("<!--                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#primenumber\">Prime nummber Checked</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#registerit\">Register IT</a>\r\n");
      out.write("                        </li>-->\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#productlist\">Product List</a>\r\n");
      out.write("                        </li> \r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#tablecal\">แม่สูตรคูณ</a>\r\n");
      out.write("                        </li> \r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link js-scroll-trigger\" href=\"#cart\"><i class=\"fa fa-cart-plus\"></i> (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")</a>\r\n");
      out.write("                        </li>    \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        <header class=\"masthead\">\r\n");
      out.write("            <div class=\"container\" style=\"min-height: 100vh;\">\r\n");
      out.write("                <div class=\"intro-text\">\r\n");
      out.write("                    <div class=\"col-sm-4 mx-auto\">\r\n");
      out.write("                        <div class=\"team-member\">\r\n");
      out.write("                            <img class=\"mx-auto rounded-circle\" src=\"img/team/1.jpg\" alt=\"\">\r\n");
      out.write("                            <h4>Panupong Joknoi</h4>\r\n");
      out.write("                            <p class=\"text-muted\">Web Programing</p>\r\n");
      out.write("                            <ul class=\"list-inline social-buttons\">\r\n");
      out.write("                                <li class=\"list-inline-item\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-instagram\"></i>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-inline-item\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-facebook\"></i>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list-inline-item\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-slack\"></i>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <!-- All -->\r\n");
      out.write("        <section style=\"min-height: 100vh;\" id=\"func\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                        <h2 class=\"section-heading text-uppercase\">Functions</h2>\r\n");
      out.write("                        <h3 class=\"section-subheading text-muted\">SELECT</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                    <a href=\"#simplecalc\" style=\"text-decoration: none;\" class=\"col-md-3 js-scroll-trigger\">\r\n");
      out.write("                        <div style=\"cursor: pointer;\" >\r\n");
      out.write("                            <span class=\"fa-stack fa-4x\">\r\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\r\n");
      out.write("                                <i class=\"fa fa-calculator fa-stack-1x fa-inverse\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <h4 class=\"service-heading\">Simple Calculator</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#page-top\" style=\"text-decoration: none;\" class=\"col-md-3 js-scroll-trigger\">\r\n");
      out.write("                        <div style=\"cursor: pointer;\">\r\n");
      out.write("                            <span class=\"fa-stack fa-4x\">\r\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\r\n");
      out.write("                                <i class=\"fa fa-check fa-stack-1x fa-inverse\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <h4 class=\"service-heading\">Prime number Checked</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#page-top\" style=\"text-decoration: none;\" class=\"col-md-3 js-scroll-trigger\">\r\n");
      out.write("                        <div style=\"cursor: pointer;\">\r\n");
      out.write("                            <span class=\"fa-stack fa-4x\">\r\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\r\n");
      out.write("                                <i class=\"fa fa-registered fa-stack-1x fa-inverse\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <h4 class=\"service-heading\">Register IT</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#productlist\" style=\"text-decoration: none;\" class=\"col-md-3 js-scroll-trigger\">\r\n");
      out.write("                        <div style=\"cursor: pointer;\">\r\n");
      out.write("                            <span class=\"fa-stack fa-4x\">\r\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\r\n");
      out.write("                                <i class=\"fa fa-shopping-basket fa-stack-1x fa-inverse\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <h4 class=\"service-heading\">Product List</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- SimpleCalc -->\r\n");
      out.write("        <section style=\"min-height: 100vh;background-color: #fed136;\" id=\"simplecalc\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-8 mx-auto\">\r\n");
      out.write("                        <form action=\"SimpleCalc\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-row\">\r\n");
      out.write("                                <div class=\"col-4\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"x\" placeholder=\"x\" name=\"x\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-2\">\r\n");
      out.write("                                    <select id=\"inputState\" class=\"form-control\" name=\"operator\">\r\n");
      out.write("                                        <option selected>operator</option>\r\n");
      out.write("                                        <option value=\"+\">+</option>\r\n");
      out.write("                                        <option value=\"-\">-</option>\r\n");
      out.write("                                        <option value=\"*\">x</option>\r\n");
      out.write("                                        <option value=\"/\">/</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-4\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"y\" placeholder=\"y\" name=\"y\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input class=\"col-2\" type=\"submit\" value=\"Calculator\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <p>Result : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${calculator.x}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${calculator.operator}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${calculator.y}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${calculator.result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Product List -->\r\n");
      out.write("        <section style=\"min-height: 100vh;\" id=\"productlist\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-10 mx-auto\">\r\n");
      out.write("                        ");
 if (session.getAttribute("products") == null) { 
      out.write("\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <a href=\"ProductList\"><button>Shopping</button></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                        <table id=\"example\" class=\"table\" style=\"display: block;width: 100%;max-height: 50vh;overflow-y: auto;-ms-overflow-style: -ms-autohiding-scrollbar;\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                            <th>#</th>\r\n");
      out.write("                            <th>No</th>\r\n");
      out.write("                            <th>Product Code</th>\r\n");
      out.write("                            <th>Product Name</th>\r\n");
      out.write("                            <th>Product Line</th>\r\n");
      out.write("                            <th>Scale</th>\r\n");
      out.write("                            <th>Price</th>\r\n");
      out.write("                            <th>Add to Cart</th>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Cart -->\r\n");
      out.write("        <section style=\"min-height: 100vh;background-color: #fed136;\" id=\"cart\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-10 mx-auto\">\r\n");
      out.write("                        <h1>Cart</h1>\r\n");
      out.write("                        ");
 if (session.getAttribute("products") == null) { 
      out.write("\r\n");
      out.write("                        <div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                        <table id=\"example\" class=\"table\" style=\"display: block;width: 100%;max-height: 70vh;overflow-y: auto;-ms-overflow-style: -ms-autohiding-scrollbar;\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                            <th>#</th>\r\n");
      out.write("                            <th>No</th>\r\n");
      out.write("                            <th>Product Code</th>\r\n");
      out.write("                            <th>Product Name</th>\r\n");
      out.write("                            <th>Product Line</th>\r\n");
      out.write("                            <th>Scale</th>\r\n");
      out.write("                            <th>Price</th>\r\n");
      out.write("                            <th>Remove</th>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                        <a href=\"go.jsp\"><button>GO !!!</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- แม่สูตรคูณ -->\r\n");
      out.write("        <section style=\"height: 100vh;\" id=\"tablecal\">\r\n");
      out.write("            <div  class=\"col-4 mx-auto\">\r\n");
      out.write("                <form action=\"CalNumber\" method=\"post\" class=\"form-group form-row\">\r\n");
      out.write("                    <label class=\"col-3 form-control\" for=\"number\">Enter number : </label>\r\n");
      out.write("                    <input class=\"col-7 form-control\" type=\"text\" id=\"number\" placeholder=\"enter...\" name=\"number\">\r\n");
      out.write("                    <input class=\"col-2 form-control\" type=\"submit\" value=\"Send\">\r\n");
      out.write("                </form>\r\n");
      out.write("                <div class=\"col-8 mx-auto text-center\">\r\n");
      out.write("                    <table class=\"mx-auto\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"col\">number</th>\r\n");
      out.write("                            <th class=\"col\"> x </th>\r\n");
      out.write("                            <th class=\"col\">count</th> \r\n");
      out.write("                            <th class=\"col\"> = </th>\r\n");
      out.write("                            <th class=\"col\">result</th> \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <span class=\"copyright\">Copyright &copy; Your Website 2018</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <ul class=\"list-inline social-buttons\">\r\n");
      out.write("                            <li class=\"list-inline-item\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-inline-item\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa-facebook\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-inline-item\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa-linkedin\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <ul class=\"list-inline quicklinks\">\r\n");
      out.write("                            <li class=\"list-inline-item\">\r\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-inline-item\">\r\n");
      out.write("                                <a href=\"#\">Terms of Use</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/agency.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/datatables.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#example').DataTable();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td><img src=\"model-images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" width=\"120\"/></td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productLine}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productScale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.msrp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <form action=\"AddItem\" method=\"post\">\r\n");
          out.write("                                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"productCode\"/>\r\n");
          out.write("                                                <input type=\"submit\" value=\"Add To Cart\"/>\r\n");
          out.write("                                            </form>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.lineItems}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("lineItem");
    _jspx_th_c_forEach_1.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td><img src=\"model-images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" width=\"120\"/></td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.productLine}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.productScale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.msrp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <form action=\"RemoveItem\" method=\"post\">\r\n");
          out.write("                                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lineItem.product.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"productCode\"/>\r\n");
          out.write("                                                <input type=\"submit\" value=\"Remove\"/>\r\n");
          out.write("                                            </form>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("re");
    _jspx_th_c_forEach_2.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cn.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td> x </td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td> = </td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
