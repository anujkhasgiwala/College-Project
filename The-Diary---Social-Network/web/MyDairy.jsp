<%-- 
    Document   : MyDairy
    Created on : May 29, 2011, 12:50:28 PM
    Author     : chinmay
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dairy</title>
    </head>
    <body>
        <center>
        <h1>My Dairy</h1>
                </center>
        <%String unm = (String) session.getAttribute("unm");
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");
        Statement stmt = c.createStatement();
ResultSet rs =stmt.executeQuery("select * from dairy where username='"+unm+"'");
while(rs.next()){
        %>
    </body>
    <table >
        <tr ><td width="100%"><%= rs.getString(2) %></td></tr>
        <tr><td>On : <%=rs.getString(3)%></td></tr>
    </table>
    <br>
    <hr>

    <% } %>
</html>
