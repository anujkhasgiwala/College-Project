<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="ISO-8859-1" session="true"%>
<%
String  uid=(String)session.getAttribute("uid");
       if(uid==null){response.sendRedirect("index.html");  }

try{
	Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","root");
 
}
catch(Exception e)
{
    System.out.println("Exception:"+e);
};
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>The Diary</title>
<link rel="stylesheet" type="text/css" href="style.css" />

<style type="text/css">
.auto-style1 {
	color: #734633;
}
.auto-style3 {
	width: 295px;
	background: url(images/box_center.gif) repeat-y center;
}
</style>

</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="home.html">
				<img src="images/1d.png" alt="" title="" border="0" height="40" width="100" /></a></div>

        <div id="menu" style="width: 629px; height: 37px">
            <ul style="width: 624px; height: 24px">
            <li class="selected"><a href="home.html">Home</a></li>
            <li><a href="about.html">About us</a></li>
            <li><a href="friends.html">Friends</a></li>
            <li><a href="profile.jsp">My Profile</a></li>
            <li><a href="contact.html">Contact</a></li>
            <li><a href="photos.html">Photos</a></li>
	    <li><a href="index.html">Sign Out </a></li>
            <li><a href="MyDairy.jsp">My Dairy</a></li>
            </ul>
        </div>


       </div>


       <div class="center_content">
       	<div class="left_content">

            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>
                

</div>

        	<div class="feat_prod_box">

            	<div class="prod_img"><a href="details.html"><img src="images/diaryl.png" alt="" title="" border="0" /></a></div>
<p>
                       <%= uid %>
                    </p>
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="auto-style3">
                    <div class="prod_title">Write in  The Diary</div>
                    


                    <p class="details">
		    	<form action="AddToDairy.jsp" method="post">

			<textarea name="data" rows=3 cols=10 style="position: left; top:33px; left:28px; width:284px; height:128px;"></textarea><br/>

			<SPAN style="position: absolute; top:175px; left:160px; width:163px; height:42px">
			<input type="Submit" value="Diary"/>
			<input type="reset" value="Wipe Out"/>
                        </SPAN><br><br>${added}



			</form>
                    </p>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>

		            <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
            <div class="clear"></div>
            </div>



           <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>Diary Archives</div>

           <div class="new_products">

                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>
                    </div>

                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>
                    </div>

                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>
                    </div>

            </div>


        <div class="clear"></div>
        </div><!--end of left content-->

        <div class="right_content">
        	 <div class="cart" style="height: 6px">
                  &nbsp;</div>





             <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span>About
				 The Diary</div>
             <div class="about">
             <p>
             <img src="images/diary.png" alt="" title="" class="right" height="97" width="150"  />
              The Diary is a social utility that brings together all the young minds living across the globe. It is for every individual who is a student or a non-student, fresh graduate,a working professional or an Entrepreneur, and is focused on providing comprehensive solutions for any personal and professional issues.
            </p>

             </div>

             <div class="right_box">

             	<div class="title"><span class="title_icon"><img src="images/bullet4.gif" alt="" title="" /></span>Videos</div>
                    <div class="new_prod_box">
                        <a href="details.html" class="auto-style1">
						India Unmute</a>
                        <div class="new_prod_bg">
                        &nbsp;<a href="details.html"><img src="images/inm.jpg" alt="" title="" class="thumb" border="0" height="73" width="119" /></a>
                        </div>
                    </div>

                    <div class="new_prod_box">
                        CSI Medi-Caps
						<div class="new_prod_bg">
                        &nbsp;<a href="details.html"><img src="images/csi.png" alt="" title="" class="thumb" border="0" height="84" width="95" /></a>
						</div>
                    </div>

                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>
                    </div>

             </div>

             <div class="right_box">

             	<div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>Articles</div>

                <ul class="list">
                <li><a href="gb.html">Global Warming</a></li>
                <li><a href="bd.html">Brain Drain</a></li>
                <li><a href="#">Enviorment Degradation</a></li>
                <li><a href="#">Green House Effect</a></li>
                <li><a href="#">Corrrution in India</a></li>

                </ul>


             </div>


        </div><!--end of right content-->




       <div class="clear"></div>
       </div><!--end of center content-->


       <div class="footer">
       	<div class="left_footer"><img src="images/di.png" alt="" title="" /><br />

	Copyright &copy; 2011. All Rights Reserved.
 </div>
        <div class="right_footer">
        <a href="#">Home</a>
        <a href="#">About Us</a>
        <a href="#">Services</a>
        <a href="#">Privacy</a>
        <a href="#">FAQ</a>
        <a href="#">Contact Us</a>


        </div>


       </div>


</div>

</body>
</html>