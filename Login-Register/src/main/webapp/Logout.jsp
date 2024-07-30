<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>

<body>
    <%
        // Retrieve the session object
        HttpSession currentsession1 = request.getSession(false);
	 	if(currentsession1 != null) {
		 	currentsession1.invalidate();
	 	}
        
            response.sendRedirect("index.html");
        
    %>


</body>

</html>