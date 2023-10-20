<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserName" %>
<%@ page import="java.util.Random"%>
<%
UserName name = (UserName)session.getAttribute("name");
%>
<%
String[] names = {name.getName(),name.getName2(),name.getName3()}; 
Random r = new Random();
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
<link rel="stylesheet" type="text/css" href="Main.css">
</head>
<body>

<% for (int i = 0; i < 1; i++) { %>
<% String team = names[r.nextInt(3)]; %> 
<% String team2; %>
<% do { %>
<% team2 = names[r.nextInt(3)]; %> 
<% } while (team2.equals(team)); %>
<% String team3; %>
<% do { %>
<% team3 = names[r.nextInt(3)]; %> 
<% } while (team3.equals(team) || team3.equals(team2)); %>

<p>ピッチャー：<%= team %><br>
<p>キャッチャー：<%= team2 %><br>
<p>バッター：<%= team3 %></p>

<% } %>
</body>
</html>