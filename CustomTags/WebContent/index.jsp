<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom Tags</title>
<%@ taglib uri="http://training.com/examples/greet" prefix= "mytag" %>
</head>
<body>
	
	<mytag:greet userName = "Ramesh"></mytag:greet>

	<a href= "FirstServlet">Lets print all names</a>

</body>
</html>