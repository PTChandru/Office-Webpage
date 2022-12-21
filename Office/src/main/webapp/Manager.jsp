<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login.page</title>
<meta charset="UTF-8">
<style type="text/css">
body{
background-color: #e4decd;

}
input {
	border: none;
	background-color:#00DDFF;
	border-radius: 10px;
	padding:4%;
	margin:2%;
}
input[type=submit]{
background-color: #657a00;
color:white;
margin-left: 40%;

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
</head>
<body>
<h1 align="center">Login</h1>
<form action="Manger" method="get">
<table align="center">
<tr><td><input type="text"  name="Name"placeholder="Name"></td></tr>
<tr><td><input type="password"  name="Password" placeholder="Password" ></td></tr>
<tr><td><input type="submit"></td></tr>
</table>
</form>
</body>
</html>