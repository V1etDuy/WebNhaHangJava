<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.ThucDon" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem thuc don</title>
</head>
<body>
	<table border="1">
	<tr>
			<td>ID_Mon</td>
			<td>Ten</td>
			<td>Gia</td>
			<td>Flag</td>
		</tr>
		<%
			ArrayList<ThucDon> TD_Array = (ArrayList<ThucDon>)request.getAttribute("allMon");
			for (int i = 0; i < TD_Array.size(); i++) {
		%>
		<tr>
			<td><%= TD_Array.get(i).getID() %></td>
			<td><%= TD_Array.get(i).getTen() %></td>
			<td><%= TD_Array.get(i).getDonGia() %></td>
		</tr>
		<% } %>
	</table>
	<br><br><a href="index_loggin_admin.jsp">Back</a>
</body>
</html>