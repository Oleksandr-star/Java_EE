<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="dateBean" class="com.example.beans.DateBean" scope="request" />
<!DOCTYPE html>
<html>
<head>
	<title>Display Date</title>
</head>
<body>
<h1>Current Date and Time</h1>
<p>The current date and time is: <strong><%= dateBean.getCurrentDate() %></strong></p>
<a href='index.jsp'>Back to Main Page</a>
</body>
</html>