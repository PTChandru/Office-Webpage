<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-color:#c7af6b;
}

input {
	border: none;
	background-color:#00DDFF;
	border-radius: 10px;
	padding:7%;
	margin:2%;
}

input[type=submit]{
background-color: #657a00;
color:white;
margin-left: 30%;
padding:18%;

}
input[type=submit]:hover {
	cursor: pointer;
	background-color: #beef00;
	border:none;
	

	
}
input:hover {
border: 2px solid #F0FFF0;
}





</style>
<meta charset="UTF-8">
<title>Login.Page</title>
</head>
<body>
<h1 align="center">Login</h1>
<form action="Login" method="get">
<table align="center">
 <tr><td><input type="text" name="Id"placeholder="Id"></td></tr>
<tr><td><input type="password" name="Password1" placeholder="Password" ></td></tr>
</table>

<table align="center">
<tr><td><input type="submit"></td></tr>
</table>
</body>
</html>