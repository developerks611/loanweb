<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	.center{
		text-align:center;
		margin-top:5%;
		
	}
	
	.inputtxt{
		margin:5px;
	}
	
	.inputtxt{
		width:20%;
		height:25px;
	}
	.button-login{
		width:21%;
		height:35px;
		margin-top:10px;
		background-color:#485FC7;
		 border-top-style: hidden;
		  border-right-style: hidden;
		  border-left-style: hidden;
		color:white;
		font-weight:bold;
		boarder-style:none;
	}
</style>
<meta charset="ISO-8859-1">
<title>Category</title>
</head>
<body>
<div class="center">
<form action="Insertcategory" method="post">
<input type="text" placeholder="Category Name" name="cname" class="inputtxt"><br>
<input type="text" placeholder="Category Description" name="cd" class="inputtxt"><br>
<input type="hidden" name="action" value="inserdata">
<button type="submit" class="button-login">Insert Data</button>
</form>
</div>
</body>
</html>