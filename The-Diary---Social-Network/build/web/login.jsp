<%@page import="java.sql.*"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String emailid = request.getParameter("User id");
	String psswd = request.getParameter("Password");

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	java.sql.Connection c = DriverManager.getConnection("jdbc:odbc:SocialNetwork");
	java.sql.Statement st = c.createStatement();
	
	ResultSet rs = st.executeQuery("select (emailid,psswd) from [User] ");
	
	if(rs>0) {
%>
		<jsp:forward page="home.jsp"></jsp:forward>
	}
<%
	else {
		out.println("Invalid Username or Password")
	
	c.close();
%>