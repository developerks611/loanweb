<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix = "tag" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<style>
textarea{
	resize:none;
	font-size:100%;
}

* {
  padding: 0;
  margin: 0;
}

body {
  font-family: Arial, Tahoma, Serif;
  color: #263238;
}

nav {
  display: flex;
  justify-content:space-between; 
  align-items: center;
  padding: 1rem 2rem;
  background: #e06666;
}

nav ul {
  display: flex;
  list-style: none; 
}

nav li {
  padding-left: 1rem; 
}

nav a {
  text-decoration: none;
  color: black;
  font-weight:bold;
}

.container {
 text-align:center;
}

.txt_input{

	width:30%;
	height:auto;
	margin:10px;
	padding:10px;
	font-size:100%;
	
}


.createAccount{

	background-color:green;
	outline: none;
    border: none;
    width:20%;
    height:50px;;
    font-size:100%;
    padding:10px;
    font-weight:bold;
}

.msg{
	color:red;
	
	font-weight:bold;
	

}

.container{
	margin-top:10%;
}
 /* 
  Extra small devices (phones, 600px and down) 
*/
@media only screen and (max-width: 600px) {
  nav {
    flex-direction: column;
  }
  nav ul {
    flex-direction: column;
    padding-top: 0.5rem;
  }
  nav li {
    padding: 0.5rem 0;
  }
}
</style>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>

<body>

<div  class="container">
<div id="msg" class="msg"></div>
<p class="msg">${message }<p>
<form action="addData" method="post">
<input type="text" name="fname" placeholder="Name" required class="txt_input"><br>
<input type="date" name="dob" required class="txt_input" id="dob" onChange="ageCalculator()"><br>
<textarea placeholder="Address" required name="Customer Adress" required class="txt_input"></textarea ><br>
<input type="text" name="nic" placeholder="Nic" required class="txt_input"><br>
<input type="email" name="email" placeholder="Email" required class="txt_input"><br>
<input type="password" name="password" placeholder="Password" required class="txt_input"><br><br>
<input type="hidden" name="action" value="addClient">

<button type="submit" class="btn btn-success createAccount">Create Account</button>

</form>
</div>
<script>  
function ageCalculator() {  
    var userinput = document.getElementById("dob").value;  
    var dob = new Date(userinput);  
 
      
    //calculate month difference from current date in time  
    var month_diff = Date.now() - dob.getTime();  
      
    //convert the calculated difference in date format  
    var age_dt = new Date(month_diff);   
      
    //extract year from date      
    var year = age_dt.getUTCFullYear();  
      
    //now calculate the age of the user  
    var age = Math.abs(year - 1970);  
    
    if(age>=18){
    

    }
    else{
        
       document.getElementById("dob").value = "";
       document.getElementById("msg").innerHTML = "*** Sorry Age not enough ***";
         
    }

    //display the calculated age  
    
    
}  
</script> 
</body>
</html>