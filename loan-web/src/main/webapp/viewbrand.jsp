<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Brad</title>
<style>
table, td, th {
  border: 1px solid;
  border-collapse: collapse;
}

table {
  width: 100%;
  border-collapse: collapse;
}
th{
background-color:#8CC640;

}
td{

background-color:#06B051;
}

.btn{
	width:100%;
	height:30px;
	font-weight:bold;
	background-color:#06B051;
	border-style: none;
}
</style>
</head>
<body>
<h3 style="color:blue; text-align:left;">${msg }</h3>
 <table>
  <tr>
    <th>Brand ID</th>
    <th>Brand Name</th>
    <th>Brand Description</th>
    
    <th colspan="2">Action</th>
  </tr>
    <c:forEach var="brand" items="${brandlist}">
  <tr>
  	<td>${brand.getBrandid()}</td>
  	<td>${brand.getBrandname()}</td>
  	<td>${brand.getBranddescription()}</td>
  	<td>
  	<form action="searchBrand" method="POST">
  	<input type="hidden" name="bid" value="${brand.getBrandid()}">
  	<input type="hidden" name="action" value="searchdata">
  	<button type="submit" class="btn">See Data</button>
  	</form>
  	</td>
  	<td><button type="submit" class="btn">Delete</button></td>
  	
  </tr>
  </c:forEach>
  </table>
</body>
</html>