<%@ page language="java" import="java.util.*,java.sql.*" session="true" pageEncoding="ISO-8859-1"%>
<%
  session.invalidate();
  response.sendRedirect("index.html");
%>
