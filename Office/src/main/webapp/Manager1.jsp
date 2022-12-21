<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

button{

background-color: Green;
color:white;
border: none;
padding: 8px;
padding-left:15px;
padding-right:15px;
border-radius: 13px;
font-family:cursive;
}
button:hover {
	cursor: pointer;
	background-color:silver;
	color:black;
}

</style>
<meta charset="UTF-8">
<h1 align="center">Home</h1>
</head>
<body>
<form action="Manage1" method="get">
<center>
<h1>View</h1>
<button>View</button>
</center>
</form>
<center>
<h1>Update</h1>
<a href="update.jsp"><button>Update</button></a>
</center>
<center>
<h1>Delete</h1>
<a href="Delete.jsp"><button>Delete</button></a>
</center>
</body>
</html>