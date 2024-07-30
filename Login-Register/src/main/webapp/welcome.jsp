<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to my page </title>
<link rel ="stylesheet" type="text/css" href="indexStyle.css">
</head>

<body>
    <%
        // Retrieve the session object
        HttpSession session1 = request.getSession(false);

        // Check if the session is not null and the username attribute is set
        if (session1 != null && session1.getAttribute("username") != null) {
            // Get the username from the session
            String username = (String) session1.getAttribute("username");
    %>

      <div class="container">
        <h1>Welcome,EnlightenDrashta <%=username %>!</h1>
        <p>We're EnlightenDrashta to have you on our platform. </p>
        <h3>Explore, learn, and connect with our vibrant community! </h3>
        <p>Feel free to stay as long as you like, and when you're ready,</p> 
        you can <a href="Logout.jsp">LOGOUT</a> securely.
    </div>

    <%
        } else {
            // Redirect to the login page if the session is not valid
            response.sendRedirect("login.jsp");
        }
    %>


</body>

</html>