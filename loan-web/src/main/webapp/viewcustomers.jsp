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
    <th>Customer ID</th>
    <th>Customer name</th>
    <th>Date of Birth</th>
     <th>Loan Balance</th>
     <th>Used amount</th>
     <th>Installment plan </th>
    <th colspan="2">Action</th>
  </tr>
   
  <tr>
  	<td>1</td>
  	<td>Deshan Salitha</td>
  	<td>1/1/1999</td>
  	<td>10000</td>
  	<td>5000</td>
  	<td>3</td>
  	<td>
  
  
  	<button type="submit" class="btn">See Data</button>

  	</td>
  	<td><button type="submit" class="btn">Delete</button></td>
  	
  </tr>
   <tr>
  	<td>2</td>
  	<td>Blinki boy</td>
  	<td>1/1/1996</td>
  	<td>10000</td>
  	<td>5000</td>
  	<td>3</td>
  	<td>
  
  
  	<button type="submit" class="btn">See Data</button>

  	</td>
  	<td><button type="submit" class="btn">Delete</button></td>
  	
  </tr>
    <tr>
  	<td>3</td>
  	<td>Sakila Hemakumara</td>
  	<td>1/2/1999</td>
  	<td>4000</td>
  	<td>2000</td>
  	<td>3</td>
  	<td>
  
  
  	<button type="submit" class="btn">See Data</button>

  	</td>
  	<td><button type="submit" class="btn">Delete</button></td>
  	
  </tr>
  </table>
</body>
</html>