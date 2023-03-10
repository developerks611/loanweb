<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Brand</title>
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
	}
</style>
</head>
<body>

<div class="center">
<c:set var = "brand" scope = "session" value = "${brand}"/>
<h3 style="color:blue; text-align:left;">${msg }</h3>
<form action="updateBrand" method="Post" class="formadd">
<input type="text" placeholder="Brand Name" class="inputtxt" name="bname" value="${brand.getBrandname() }"><br>
<input type="text" placeholder="Brand Description" class="inputtxt" name="bd" value="${brand.getBranddescription() }"><br>
<input type="hidden" name="bid" value="${brand.getBrandid()}">
<input type="hidden" name="action" value="updatedata">
 <button type="submit" class="button-login">Update</button>

</form>
</div>
</body>
</html>