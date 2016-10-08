package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');


try{
	Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");
}
catch(Exception e)
{
    System.out.println("Exception:"+e);
};

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("<title>The Diary</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".auto-style1 {\n");
      out.write("\tcolor: #734633;\n");
      out.write("}\n");
      out.write(".auto-style3 {\n");
      out.write("\twidth: 295px;\n");
      out.write("\tbackground: url(images/box_center.gif) repeat-y center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\n");
      out.write("       <div class=\"header\">\n");
      out.write("       \t\t<div class=\"logo\"><a href=\"home.html\">\n");
      out.write("\t\t\t\t<img src=\"images/1d.png\" alt=\"\" title=\"\" border=\"0\" height=\"40\" width=\"100\" /></a></div>\n");
      out.write("\n");
      out.write("        <div id=\"menu\" style=\"width: 629px; height: 37px\">\n");
      out.write("            <ul style=\"width: 624px; height: 24px\">\n");
      out.write("            <li class=\"selected\"><a href=\"home.html\">Home</a></li>\n");
      out.write("            <li><a href=\"about.html\">About us</a></li>\n");
      out.write("            <li><a href=\"friends.html\">Friends</a></li>\n");
      out.write("            <li><a href=\"#\">My Profile</a></li>\n");
      out.write("            <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("            <li><a href=\"photos.html\">Photos</a></li>\n");
      out.write("\t    <li><a href=\"index.html\">Sign Out </a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"center_content\">\n");
      out.write("       \t<div class=\"left_content\">\n");
      out.write("\n");
      out.write("            <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet1.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                ");

try{

    Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");

			String username=(String)session.getAttribute("username");
                        String s="select * from register where username=?";
		PreparedStatement ps=c.prepareStatement(s);
		ps.setString(1, username);
		ResultSet rst=ps.executeQuery();

            while(rst.next()){
            String username1=rst.getString("username");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.print(rst.getString("username"));
      out.write('\n');
}
      }catch(Exception e){
      System.out.print(e);
      }
     
      out.write("\n");
      out.write("                     </div>\n");
      out.write("\n");
      out.write("        \t<div class=\"feat_prod_box\">\n");
      out.write("\n");
      out.write("            \t<div class=\"prod_img\"><a href=\"details.html\"><img src=\"images/diaryl.png\" alt=\"\" title=\"\" border=\"0\" /></a></div>\n");
      out.write("\n");
      out.write("                <div class=\"prod_det_box\">\n");
      out.write("                \t<div class=\"box_top\"></div>\n");
      out.write("                    <div class=\"auto-style3\">\n");
      out.write("                    <div class=\"prod_title\">Write in  The Diary</div>\n");
      out.write("                    <p class=\"details\">\n");
      out.write("\t\t    \t<form action=\"profile.jsp\">\n");
      out.write("\n");
      out.write("\t\t\t<textarea rows=3 cols=10 style=\"position: absolute; top:33px; left:28px; width:284px; height:128px;\">\n");
      out.write("\t\t\t</textarea><br/>\n");
      out.write("\n");
      out.write("\t\t\t<SPAN style=\"position: absolute; top:175px; left:160px; width:163px; height:42px\">\n");
      out.write("\t\t\t<input type=\"Submit\" value=\"Diary\">\n");
      out.write("\t\t\t<input type=\"reset\" value=\"Wipe Out\">\n");
      out.write("\t\t\t</SPAN>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("\n");
      out.write("\t\t            <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"box_bottom\"></div>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("           <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet2.gif\" alt=\"\" title=\"\" /></span>Diary Archives</div>\n");
      out.write("\n");
      out.write("           <div class=\"new_products\">\n");
      out.write("\n");
      out.write("                    <div class=\"new_prod_box\">\n");
      out.write("                        <a href=\"details.html\">product name</a>\n");
      out.write("                        <div class=\"new_prod_bg\">\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/new_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb1.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"new_prod_box\">\n");
      out.write("                        <a href=\"details.html\">product name</a>\n");
      out.write("                        <div class=\"new_prod_bg\">\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/new_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb2.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"new_prod_box\">\n");
      out.write("                        <a href=\"details.html\">product name</a>\n");
      out.write("                        <div class=\"new_prod_bg\">\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/new_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb3.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        </div><!--end of left content-->\n");
      out.write("\n");
      out.write("        <div class=\"right_content\">\n");
      out.write("        \t <div class=\"cart\" style=\"height: 6px\">\n");
      out.write("                  &nbsp;</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("             <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet3.gif\" alt=\"\" title=\"\" /></span>About\n");
      out.write("\t\t\t\t The Diary</div>\n");
      out.write("             <div class=\"about\">\n");
      out.write("             <p>\n");
      out.write("             <img src=\"images/diary.png\" alt=\"\" title=\"\" class=\"right\" height=\"97\" width=\"150\"  />\n");
      out.write("              The Diary is a social utility that brings together all the young minds living across the globe. It is for every individual who is a student or a non-student, fresh graduate,a working professional or an Entrepreneur, and is focused on providing comprehensive solutions for any personal and professional issues.\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("             <div class=\"right_box\">\n");
      out.write("\n");
      out.write("             \t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet4.gif\" alt=\"\" title=\"\" /></span>Videos</div>\n");
      out.write("                    <div class=\"new_prod_box\">\n");
      out.write("                        <a href=\"details.html\" class=\"auto-style1\">\n");
      out.write("\t\t\t\t\t\tIndia Unmute</a>\n");
      out.write("                        <div class=\"new_prod_bg\">\n");
      out.write("                        &nbsp;<a href=\"details.html\"><img src=\"images/inm.jpg\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" height=\"73\" width=\"119\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"new_prod_box\">\n");
      out.write("                        CSI Medi-Caps\n");
      out.write("\t\t\t\t\t\t<div class=\"new_prod_bg\">\n");
      out.write("                        &nbsp;<a href=\"details.html\"><img src=\"images/csi.png\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" height=\"84\" width=\"95\" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"new_prod_box\">\n");
      out.write("                        <a href=\"details.html\">product name</a>\n");
      out.write("                        <div class=\"new_prod_bg\">\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb3.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("             <div class=\"right_box\">\n");
      out.write("\n");
      out.write("             \t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet5.gif\" alt=\"\" title=\"\" /></span>Articles</div>\n");
      out.write("\n");
      out.write("                <ul class=\"list\">\n");
      out.write("                <li><a href=\"#\">2G Scam</a></li>\n");
      out.write("                <li><a href=\"#\">CWG An overview</a></li>\n");
      out.write("                <li><a href=\"#\">specials</a></li>\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\n");
      out.write("                <li><a href=\"#\">specials</a></li>\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\n");
      out.write("                <li><a href=\"#\">specials</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("             \t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet6.gif\" alt=\"\" title=\"\" /></span>Partners</div>\n");
      out.write("\n");
      out.write("                <ul class=\"list\">\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\n");
      out.write("                <li><a href=\"#\">specials</a></li>\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\n");
      out.write("                <li><a href=\"#\">specials</a></li>\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div><!--end of right content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"clear\"></div>\n");
      out.write("       </div><!--end of center content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"footer\">\n");
      out.write("       \t<div class=\"left_footer\"><img src=\"images/di.png\" alt=\"\" title=\"\" /><br />\n");
      out.write("\n");
      out.write("\tCopyright &copy; 2011. All Rights Reserved.\n");
      out.write(" </div>\n");
      out.write("        <div class=\"right_footer\">\n");
      out.write("        <a href=\"#\">Home</a>\n");
      out.write("        <a href=\"#\">About Us</a>\n");
      out.write("        <a href=\"#\">Services</a>\n");
      out.write("        <a href=\"#\">Privacy</a>\n");
      out.write("        <a href=\"#\">FAQ</a>\n");
      out.write("        <a href=\"#\">Contact Us</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
