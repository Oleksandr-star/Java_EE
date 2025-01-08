<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="variableBean" class="com.example.beans.VariableBean" scope="session" />

<html>
<head>
	<title>Variable Manager</title>
</head>
<body>
<h1>Manage Your Variable</h1>

<p>Current Value: <strong><%= variableBean.getVariable() %></strong></p>

<form action="variable.jsp" method="post">
	<label for="newVariable">Set New Value:</label>
	<input type="text" id="newVariable" name="newVariable" />
	<button type="submit">Submit</button>
</form>

<%
	String newVariable = request.getParameter("newVariable");
	if (newVariable != null && !newVariable.trim().isEmpty()) {
		variableBean.setVariable(newVariable);
%>
<p style="color: green;">Variable updated to: <strong><%= variableBean.getVariable() %></strong></p>
<%
	}
%>
<a href='index.jsp'>Back to Main Page</a>
</body>
</html>