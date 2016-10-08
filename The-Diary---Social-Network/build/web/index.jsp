<%@ page language="java" import="java.util.*,java.sql.*" session="true" pageEncoding="ISO-8859-1"%>
<%



try{
	Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");

        String username=request.getParameter("username");
	String password=request.getParameter("password");

        PreparedStatement ps=c.prepareStatement("select username,password from register where username=? and password=?");
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();

       if(rs.next())
    {
    
        session.setAttribute("unm", username);
    response.sendRedirect("home.jsp");
   
    }
    
    else
    {
response.sendRedirect("index.html");
}

}
catch(Exception e)
{
    response.sendRedirect("index.html");
};

%>
	