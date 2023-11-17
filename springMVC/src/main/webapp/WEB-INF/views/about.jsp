<html>
<body>
<h2>Hello World!</h2>
<%
    String name = (String) request.getAttribute("name");
%>
<p>Hi!</p>
<p>My name is <%=name%></p>
</body>
</html>
