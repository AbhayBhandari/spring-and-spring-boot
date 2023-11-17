<html>
<body>
<h2>Successful!</h2>
<%
    String email = (String) request.getAttribute("email");
    String password = (String) request.getAttribute("password");
%>
<p>Your email is <%=email%></p>
<p>Your password is <%=password%></p>
</body>
</html>
