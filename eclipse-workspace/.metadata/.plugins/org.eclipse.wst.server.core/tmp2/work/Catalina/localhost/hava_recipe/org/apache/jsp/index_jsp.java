/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2020-06-23 11:23:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!-- Basic -->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("\t<!-- Mobile Metas -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<!-- Site Metas -->\n");
      out.write("\t<title>Hava Recipe</title>\n");
      out.write("\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("\t<!-- Site Icons -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<!-- Site CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t<!-- Responsive CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\t<!-- Custom CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!-- Start header -->\n");
      out.write("\t<header class=\"top-navbar\">\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("\t\t\t\t\t<img src=\"images/hava.png\" alt=\"Hava\" />\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbars-rs-food\"\n");
      out.write("\t\t\t\t\taria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbars-rs-food\">\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"pages/recipes.html\">Recipes</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"pages/about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"pages/contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"login.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- End header -->\n");
      out.write("\n");
      out.write("\t<!-- Start slides -->\n");
      out.write("\t<div id=\"slides\" class=\"cover-slides\">\n");
      out.write("\t\t<ul class=\"slides-container\">\n");
      out.write("\t\t\t<li class=\"text-left\">\n");
      out.write("\t\t\t\t<img src=\"images/carousel/1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"m-b-20\"><strong>Panduan Masak Gado-Gado</strong></h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"m-b-40\">Memasak gado-gado merupakan hal yang sulit, nah disini ada resepnya agar kalian dapat\n");
      out.write("\t\t\t\t\t\t\t\tmembuat gado-gado</p>\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"btn-hava btn-lg btn-circle btn-outline-new-white\" href=\"foods/gado_gado.html\">Recipe</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"text-left\">\n");
      out.write("\t\t\t\t<img src=\"images/carousel/2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"m-b-20\"><strong>Panduan Memasak Bebek Rica-Rica</strong></h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"m-b-40\">Menikmati bebek Rica-Rica direstaurant merupakan hal yang ternikmat. lalu bagaimana\n");
      out.write("\t\t\t\t\t\t\t\tkalau kita bisa membuat Bebek Rica-Rica Yang ada direstaurant dengan tangan Kita sendiri</p>\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"btn-hava btn-lg btn-circle btn-outline-new-white\" href=\"foods/rica_rica.html\">Recipe</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"text-left\">\n");
      out.write("\t\t\t\t<img src=\"images/carousel/3.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"m-b-20\"><strong>Panduan Memasak Steak</strong></h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"m-b-40\">Menikmati steak di restaurant memang nikmat dan menyenangkan sehingga membuat kita\n");
      out.write("\t\t\t\t\t\t\t\tketagihan menyicipi nya lagi. lalu bagaimana bila kita dapat mengikuti resep restaurant cara membuat\n");
      out.write("\t\t\t\t\t\t\t\tsteak\n");
      out.write("\t\t\t\t\t\t\t\tdengan tangan kita sendiri</p>\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"btn-hava btn-lg btn-circle btn-outline-new-white\" href=\"foods/steak.html\">Recipe</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<div class=\"slides-navigation\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"next\"><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"prev\"><i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End slides -->\n");
      out.write("\n");
      out.write("\t<!-- Start About -->\n");
      out.write("\t<section id=\"service\" class=\"service\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t<div class=\"text-center m-5\">\n");
      out.write("\t\t\t\t\t\t<h1>Our Service</h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row pb-5\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/service/recipes.png\" alt=\"Recipes\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h3 class=\"font-weight-normal\">Resep disusun dengan baik</h3>\n");
      out.write("\t\t\t\t\t\t<p class=\"text-justify\" style=\"text-indent: 20px;\">Di Website ini semua resep makanan disusun dengan baik\n");
      out.write("\t\t\t\t\t\t\tdan rapi layaknya buku panduan. Selain itu bahasa yang digunakan mudah dimengerti dan mudah dipahami\n");
      out.write("\t\t\t\t\t\t\tketika memasak menggunakan resep pada website ini.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/service/food.png\" alt=\"Food\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h3 class=\"font-weight-normal\">Makanan Sehat</h3>\n");
      out.write("\t\t\t\t\t\t<p class=\"text-justify\" style=\"text-indent: 20px;\">Semua Resep makanan yang disajikan pada website ini\n");
      out.write("\t\t\t\t\t\t\tadalah makanan sehat yang mengaju pada pedoman \"4 sehat 5 sempurna\" sehingga menjaga kebugaran tubuh anda\n");
      out.write("\t\t\t\t\t\t\tdan membuat anda dapat menerapkan hidup sehat </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/service/kokky.png\" alt=\"Kokky\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h3 class=\"font-weight-normal\">Resep dari Kokky handal</h3>\n");
      out.write("\t\t\t\t\t\t<p class=\"text-justify\" style=\"text-indent: 20px;\">Resep masakan pada website ini dibuat oleh Koki handal\n");
      out.write("\t\t\t\t\t\t\tdan berpengalaman dalam membuat makanan sehingga pastinya jika anda membuat makanan mengikuti resep pada\n");
      out.write("\t\t\t\t\t\t\twebsite ini dijamin terasa enak</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- End About -->\n");
      out.write("\n");
      out.write("\t<!-- Start QT -->\n");
      out.write("\t<div class=\"qt-box qt-background\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8 ml-auto mr-auto text-center\">\n");
      out.write("\t\t\t\t\t<p class=\"lead \">\n");
      out.write("\t\t\t\t\t\t\" If you're not the one cooking, stay out of the way and compliment the chef. \"\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<span class=\"lead\">Michael Strahan</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End QT -->\n");
      out.write("\n");
      out.write("\t<!-- Start Menu -->\n");
      out.write("\t<div class=\"menu-box\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12 mt-5\">\n");
      out.write("\t\t\t\t\t<div class=\"heading-title text-center\">\n");
      out.write("\t\t\t\t\t\t<h2>Resep Makanan Kami</h2>\n");
      out.write("\t\t\t\t\t\t<p>Di Bawah adalah jenis-jenis makanan yang dapat kalian baca Resepnya</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row inner-menu-box\">\n");
      out.write("\t\t\t\t<div class=\"col-12 col-md-3 col-sm-3\">\n");
      out.write("\t\t\t\t\t<div class=\"nav flex-column nav-pills\" id=\"v-pills-tab\" role=\"tablist\" aria-orientation=\"vertical\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-recipe active\" id=\"v-pills-home-tab\" data-toggle=\"pill\" href=\"#v-pills-home\"\n");
      out.write("\t\t\t\t\t\t\trole=\"tab\" aria-controls=\"v-pills-home\" aria-selected=\"true\">All Menu</a>\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-recipe\" id=\"v-pills-profile-tab\" data-toggle=\"pill\" href=\"#v-pills-profile\"\n");
      out.write("\t\t\t\t\t\t\trole=\"tab\" aria-controls=\"v-pills-profile\" aria-selected=\"false\">Food</a>\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-recipe\" id=\"v-pills-messages-tab\" data-toggle=\"pill\" href=\"#v-pills-messages\"\n");
      out.write("\t\t\t\t\t\t\trole=\"tab\" aria-controls=\"v-pills-messages\" aria-selected=\"false\">Drink</a>\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link nav-recipe\" id=\"v-pills-settings-tab\" data-toggle=\"pill\" href=\"#v-pills-settings\"\n");
      out.write("\t\t\t\t\t\t\trole=\"tab\" aria-controls=\"v-pills-settings\" aria-selected=\"false\">Tucker</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-12 col-md-9 col-sm-3\">\n");
      out.write("\t\t\t\t\t<div class=\"tab-content\" id=\"v-pills-tabContent\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-pane fade show active\" id=\"v-pills-home\" role=\"tabpanel\" aria-labelledby=\"v-pills-home-tab\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\" id=\"list-menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Menu -->\n");
      out.write("\n");
      out.write("\t\t<!-- Start Gallery -->\n");
      out.write("\t\t<div class=\"gallery-box\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading-title text-center\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Gallery</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Berikut ini adalah Makanan dengan Resep Terbaik yang pernah ada</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tz-gallery\">\n");
      out.write("\t\t\t\t\t<div class=\"row\" id=\"list-gallery\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Gallery -->\n");
      out.write("\n");
      out.write("\t\t<!-- Start Customer Reviews -->\n");
      out.write("\t\t<div class=\"customer-reviews-box\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading-title text-center\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Customer Reviews</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Testimoni ini adalah bukti bahwa kami memberikan recipe yang terbaik</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 mr-auto ml-auto text-center\">\n");
      out.write("\t\t\t\t\t\t<div id=\"reviews\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-inner mt-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-item text-center active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-box p-1 border rounded-circle m-auto\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"d-block w-100 rounded-circle\" src=\"images/testimonials/karim.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-4 mb-0\"><strong class=\"text-warning text-uppercase\">Karim Owen</strong></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6 class=\"text-dark m-0\">Enginering Employee</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"m-0 pt-3\">Ketika Saya pertama kali mencoba resep masakan pada website ini, Rasanya sulit\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbanget. pas saya mencoba selanjutnya terasa mudah karena sudah tahu bagaimana cara memasak dengan\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbaik\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdan benar</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-item text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-box p-1 border rounded-circle m-auto\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"d-block w-100 rounded-circle\" src=\"images/testimonials/paris.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-4 mb-0\"><strong class=\"text-warning text-uppercase\">Paris Augustina</strong></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6 class=\"text-dark m-0\">Artist</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"m-0 pt-3\">Sebagai Ibu rumah tangga, saya butuh sekali membuat masakan yang lezat dan nikmat\n");
      out.write("\t\t\t\t\t\t\t\t\t\tuntuk keluarga. Dengan adanya resep masakana diwebsite ini, saya jadi dapat memenuhi kebutuhan saya\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdan keluarga</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-item text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-box p-1 border rounded-circle m-auto\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"d-block w-100 rounded-circle\" src=\"images/testimonials/yanko.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-4 mb-0\"><strong class=\"text-warning text-uppercase\">Yanko Febriant</strong></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6 class=\"text-dark m-0\">Freelancer</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"m-0 pt-3\">Sebagai seorang freelance, saya butuh sekali membuat masakan lezat dan nikmat\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdilidah. Dengan resep yang disediakan pada website ini, dapat menjawab kebutuhan saya membuat\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmasakan\n");
      out.write("\t\t\t\t\t\t\t\t\t\tlezat dan nikmat.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"carousel-control-prev\" href=\"#reviews\" role=\"button\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Previous</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"carousel-control-next\" href=\"#reviews\" role=\"button\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Next</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Customer Reviews -->\n");
      out.write("\n");
      out.write("\t\t<!-- Start Contact info -->\n");
      out.write("\t\t<div class=\"contact-imfo-box\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 arrow-right\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-volume-control-phone\"></i>\n");
      out.write("\t\t\t\t\t\t<div class=\"overflow-hidden\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Phone</h4>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"lead\">\n");
      out.write("\t\t\t\t\t\t\t\t+01 2000 800 9999\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 arrow-right\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-envelope\"></i>\n");
      out.write("\t\t\t\t\t\t<div class=\"overflow-hidden\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Email</h4>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"lead\">\n");
      out.write("\t\t\t\t\t\t\t\thavarecipe@gmail.com\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-map-marker\"></i>\n");
      out.write("\t\t\t\t\t\t<div class=\"overflow-hidden\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Location</h4>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"lead\">\n");
      out.write("\t\t\t\t\t\t\t\tCCIT FTUI, Depok\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Contact info -->\n");
      out.write("\n");
      out.write("\t\t<!-- Start Footer -->\n");
      out.write("\t\t<footer class=\"footer-area bg-f\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<h3>About Us</h3>\n");
      out.write("\t\t\t\t\t\t<p>Hava Recipe adalah suatu website yang menyediakan resep makanan, mulai dari makanan kecil hingga makanan\n");
      out.write("\t\t\t\t\t\t\tkhas daerah. Resep yang kami berikan kepada pengunjung mudah dipahami dan di praktekkan. Selain itu,\n");
      out.write("\t\t\t\t\t\t\tmakanan\n");
      out.write("\t\t\t\t\t\t\tyang kami berikan resepnya itu memenuhi gizi 4 sehat 5 sempurna.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<h3>Subscribe</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"subscribe_form\">\n");
      out.write("\t\t\t\t\t\t\t<form class=\"subscribe_form\">\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"EMAIL\" id=\"subs-email\" class=\"form_input\" placeholder=\"Email Address...\" type=\"email\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"submit\">SUBSCRIBE</button>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<h3>Contact information</h3>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\">CCIT FTUI, Depok</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\"><a href=\"#\">+01 2000 800 9999</a></p>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"#\"> havarecipe@gmail.com</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"company-name\">All Rights Reserved. &copy; 2020 <a href=\"#\">Hava Recipes</a> Design By : Hanas\n");
      out.write("\t\t\t\t\t\t\t\tBayu\n");
      out.write("\t\t\t\t\t\t\t\tPratama and Chelyn Valencia Wardhani</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!-- End Footer -->\n");
      out.write("\n");
      out.write("\t\t<a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\"><i class=\"fa fa-paper-plane-o\"\n");
      out.write("\t\t\t\taria-hidden=\"true\"></i></a>\n");
      out.write("\n");
      out.write("\t\t<!-- ALL JS FILES -->\n");
      out.write("\t\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/popper.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<!-- ALL PLUGINS -->\n");
      out.write("\t\t<script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/images-loded.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/isotope.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/form-validator.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/contact-form-script.js\"></script>\n");
      out.write("\t\t<script src=\"js/custom.js\"></script>\n");
      out.write("\t\t<script src=\"js/script.js\"></script>\n");
      out.write("\t\t<script src=\"js/gallery.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
