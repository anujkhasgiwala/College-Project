<%@ page language="java" import="java.util.*,java.sql.*" session="true" pageEncoding="ISO-8859-1"%>
 <%

        try{
	Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");

        String name=request.getParameter("name");
	String dob=request.getParameter("dob");
	String add=request.getParameter("add");
	String city=request.getParameter("city");
        String stat=request.getParameter("stat");
        String country=request.getParameter("country");
        String mobile=request.getParameter("mobile");
        String sex=request.getParameter("sex");
        String at=request.getParameter("at");
        String hobbies=request.getParameter("hobbies");
           
        PreparedStatement ps=c.prepareStatement("insert into profile values (?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,dob);
        ps.setString(3,add);
        ps.setString(4,city);
        ps.setString(5,stat);
        ps.setString(6,country);
        ps.setString(7,mobile);
        ps.setString(8,sex);
        ps.setString(9,at);
        ps.setString(10,hobbies);
        ps.setString(11, (String)session.getAttribute("unm"));
        out.println(ps.executeUpdate());
        }
        catch(Exception e)
        {
        out.print("Exception:"+e);
        };
        %>
	<jsp:forward page="home.jsp"></jsp:forward>
