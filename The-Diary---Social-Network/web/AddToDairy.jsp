<%-- 
    Document   : AddToDairy
    Created on : May 29, 2011, 12:26:59 PM
    Author     : chinmay
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%String data= request.getParameter("data");
      out.println(data);
      String unm =(String)session.getAttribute("unm");
 Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");
        Date d = new Date( new java.util.Date().getTime());
        PreparedStatement stmt = c.prepareStatement("insert into dairy values(?,?,?)");
        stmt.setString(1, unm);
        stmt.setString(2,data);
        stmt.setDate(3,d);
        stmt.executeUpdate();
        RequestDispatcher view = request.getRequestDispatcher("home.jsp");
        request.setAttribute("added","Your data has been added");
  view.forward(request, response);
%>
    </body>
</html>
