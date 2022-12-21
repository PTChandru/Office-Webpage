<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Register.page</title>
<meta charset="UTF-8">
<style type="text/css">
body{

background-color:  #ff414e;
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
<h1 align="center">Register</h1>
<form action="Register" method="get">
<table align="center" >
<tr><td><input type="text" name="Id" placeholder="ID" ><br>
<tr><td><input type="text" name="EName" placeholder="Name" ></td></tr>
<tr><td><input type="text" name="Phone" placeholder="Phone"></td></tr>
<tr><td><input type="text" name="DOB"  placeholder="DOB" ></td></tr>
<tr><td><input type="text" name="Dateofjoin"placeholder="Date of join" ></td></tr>
<tr><td><input type="text" name="ERole"placeholder=Role ></td></tr>
<tr><td><input type="password" name="Password1" placeholder="Password" ></td></tr>
<tr><td><input type="Password" name="ConfirmPassword"Placeholder="ConfirmPassword"></td></tr>
<tr><td><input type="submit"></td></tr>
</table>
</form>
</body>
</html>