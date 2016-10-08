<%@ page language="java" import="java.util.*,java.sql.*" session="true" pageEncoding="ISO-8859-1"%>
<%
	
try{
	Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");

        String username=request.getParameter("username");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String sque=request.getParameter("sque");
	String answer=request.getParameter("answer");
session.setAttribute("unm",username);
        PreparedStatement ps=c.prepareStatement("insert into register (username,password,email,sque,answer) values (?,?,?,?,?)");
        ps.setString(1,username);
        ps.setString(2,password);
        ps.setString(3,email);
        ps.setString(4,sque);
        ps.setString(5,answer);
        out.println(ps.executeUpdate());
}
catch(Exception e)
{
    System.out.println("Exception:"+e);
};
%>
	<jsp:forward page="edit_profile.html"></jsp:forward>
