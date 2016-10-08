package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');


try{
	Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");
}
catch(Exception e)
{
    System.out.println("Exception:"+e);
};

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<title>The Diary</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("       <div class=\"header\">\r\n");
      out.write("       \t\t<div class=\"logo\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t<img src=\"images/1d.png\" alt=\"\" title=\"\" border=\"0\" height=\"40\" width=\"100\" /></a></div>            \r\n");
      out.write("        <div id=\"menu\">\r\n");
      out.write("            <ul>                                                                       \r\n");
      out.write("            <li><a href=\"home.html\">Home</a></li>\r\n");
      out.write("            <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("            <li><a href=\"specials.html\">Friends</a></li>\r\n");
      out.write("            <li class=\"selected\"><a href=\"myaccount.html\">My Profile</a></li>\r\n");
      out.write("            <li><a href=\"contact.html\">Contact</a><a href=\"category.html\">Sign \r\n");
      out.write("\t\t\tOut</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>     \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("       </div> \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       <div class=\"center_content\">\r\n");
      out.write("       \t<div class=\"left_content\">\r\n");
      out.write("            <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet1.gif\" alt=\"\" title=\"\" /></span>Edit \r\n");
      out.write("\t\t\t\tProfile </div>\r\n");
      out.write("        \r\n");
      out.write("        \t<div class=\"feat_prod_box_details\">\r\n");
      out.write("            <p class=\"details\">\r\n");
      out.write("             Tell everybody something about you....\r\n");
      out.write("            </p>\r\n");
      out.write("            \r\n");
      out.write("              \t<div class=\"contact_form\">\r\n");
      out.write("                <div class=\"form_subtitle\">My Profile</div>\r\n");
      out.write("                 <form name=\"register\" action=\"#\">          \r\n");
      out.write("                     <table width=\"400\" border=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Name</span></div></td>\r\n");
      out.write("        <td width=\"235\"><span class=\"style28\">");
      out.print(rst.getString("name"));
      out.write("</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("           \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Date Of Birth</span></div></td>\r\n");
      out.write("        <td><label></label><span class=\"style28\">");
      out.print(rst.getString("dob"));
      out.write("</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Address</span></div></td>\r\n");
      out.write("        <td><label>\r\n");
      out.write("          \r\n");
      out.write("       <span class=\"style28\"> ");
      out.print(rst.getString("add"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">City</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("city"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">State</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("stat"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Country</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("country"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Mobile</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("mobile"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Sex</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("sex"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">I am at</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("at"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"40\" style=\"width: 156px\"><div align=\"left\"><span class=\"style28\">Hobbies</span></div></td>\r\n");
      out.write("        <td><label><span class=\"style28\">");
      out.print(rst.getString("hobbies"));
      out.write("</span></label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("       \r\n");
      out.write("    </table>                     \r\n");
      out.write("                     \r\n");
      out.write("                      \r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form_row\">\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"edit_profile.html\">\r\n");
      out.write("\t\t    <img src=\"images/su.png\" alt=\"\" title=\"\" border=\"0\" height=\"30\" width=\"60\" /></a></div>   \r\n");
      out.write("                  </form>     \r\n");
      out.write("                </div>  \r\n");
      out.write("            \r\n");
      out.write("          </div>\t\r\n");
      out.write("            \r\n");
      out.write("              \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        </div><!--end of left content-->\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"right_content\">\r\n");
      out.write("        \r\n");
      out.write("                \r\n");
      out.write("              <div class=\"cart\" style=\"height: 0px\">\r\n");
      out.write("                  &nbsp;</div>\r\n");
      out.write("        \r\n");
      out.write("             <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet3.gif\" alt=\"\" title=\"\" /></span>About \r\n");
      out.write("\t\t\t\t The Diray</div> \r\n");
      out.write("             <div class=\"about\">\r\n");
      out.write("             <p>\r\n");
      out.write("             <img src=\"images/diary.png\" alt=\"\" title=\"\" class=\"right\" height=\"97\" width=\"150\" />\r\n");
      out.write("             The Diary is a social utility that brings together all the young minds living across the globe. It is for every individual who is a student or a non-student, fresh graduate,a working professional or an Entrepreneur, and is focused on providing comprehensive solutions for any personal and professional issues.</p>\r\n");
      out.write("             \r\n");
      out.write("             </div>\r\n");
      out.write("             \r\n");
      out.write("             <div class=\"right_box\">\r\n");
      out.write("             \r\n");
      out.write("             \t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet4.gif\" alt=\"\" title=\"\" /></span>Promotions</div> \r\n");
      out.write("                    <div class=\"new_prod_box\">\r\n");
      out.write("                        <a href=\"details.html\">product name</a>\r\n");
      out.write("                        <div class=\"new_prod_bg\">\r\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\r\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb1.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\r\n");
      out.write("                        </div>           \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"new_prod_box\">\r\n");
      out.write("                        <a href=\"details.html\">product name</a>\r\n");
      out.write("                        <div class=\"new_prod_bg\">\r\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\r\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb2.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\r\n");
      out.write("                        </div>           \r\n");
      out.write("                    </div>                    \r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"new_prod_box\">\r\n");
      out.write("                        <a href=\"details.html\">product name</a>\r\n");
      out.write("                        <div class=\"new_prod_bg\">\r\n");
      out.write("                        <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\r\n");
      out.write("                        <a href=\"details.html\"><img src=\"images/thumb3.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\r\n");
      out.write("                        </div>           \r\n");
      out.write("                    </div>              \r\n");
      out.write("             \r\n");
      out.write("             </div>\r\n");
      out.write("             \r\n");
      out.write("             <div class=\"right_box\">\r\n");
      out.write("             \r\n");
      out.write("             \t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet5.gif\" alt=\"\" title=\"\" /></span>Categories</div> \r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"list\">\r\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">specials</a></li>                                              \r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("             \t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet6.gif\" alt=\"\" title=\"\" /></span>Partners</div> \r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"list\">\r\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                <li><a href=\"#\">accesories</a></li>                              \r\n");
      out.write("                </ul>      \r\n");
      out.write("             \r\n");
      out.write("             </div>         \r\n");
      out.write("             \r\n");
      out.write("        \r\n");
      out.write("        </div><!--end of right content-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       <div class=\"clear\"></div>\r\n");
      out.write("       </div><!--end of center content-->\r\n");
      out.write("       \r\n");
      out.write("              \r\n");
      out.write("       <div class=\"footer\">\r\n");
      out.write("       \t<div class=\"left_footer\"><img src=\"images/di.png\" alt=\"\" title=\"\" /><br /> <a href=\"http://csscreme.com/freecsstemplates/\" title=\"free templates\"><img src=\"images/csscreme.gif\" alt=\"free templates\" title=\"free templates\" border=\"0\" /></a></div>\r\n");
      out.write("        <div class=\"right_footer\">\r\n");
      out.write("        <a href=\"#\">home</a>\r\n");
      out.write("        <a href=\"#\">about us</a>\r\n");
      out.write("        <a href=\"#\">services</a>\r\n");
      out.write("        <a href=\"#\">privacy policy</a>\r\n");
      out.write("        <a href=\"#\">contact us</a>\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
