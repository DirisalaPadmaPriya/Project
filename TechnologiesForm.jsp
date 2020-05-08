<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technologies</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">


<style>
input[type=text], select {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 70%;
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  align:center;
}
input[type=submit]:hover {
  background-color: #006400;
  
}
</style>
</head>
<body>
<script>
$(document).ready(function() {
$(function() {
$("#sdate").datepicker({dateFormat:'dd-MM-yy'});
});
});
$(document).ready(function() {
	$(function() {
	$("#edate").datepicker({dateFormat:'dd-MM-yy'});
	});
	});
</script>
<div align="center" >
<h1 style="color:blue;">Request</h1>
<form:form action="saveTech" method="post" modelAttribute="tech">
		
<table border="0" bordercolor="dimgray">
				
<tr>
<td>Technologies</td>
<td><form:select path="technologies.technologiesName" >
 <form:option value="--select--" label="--select--"/>
<form:option value="Advanced Artificial Intelligence" label="Advanced Artificial Intelligence"/>  
 <form:option value="Intelligence Amplification" label="Intelligence Amplification"/>  
 <form:option value="Brain Computer Interface" label="Brain Computer Interface"/>  
 <form:option value="Human Computer Interface(UX/UI)" label="Human Computer Interface(UX/UI)"/> 
 <form:option value="Virtual Reality" label="Virtual Reality"/>
 <form:option value="IOT" label="IOT"/>
 <form:option value="Bid Data" label="Big Data"/>
 <form:option value="Automation" label="Automation"/>
 <form:option value="Machine Learning" label="Machine Learning"/>
 <form:option value="Java" label="Java"/>
 <form:option value="Python" label="Python"/>
 <form:option value="Data Science" label="Data Science"/>
 <form:option value="Data Analytics" label="Data Analytics"/>
 <form:option value="Angular" label="Angular"/>
                             
 </form:select> 
 </td>
 </tr>
				
  <tr>
<td colspan="2" align="center"><input type="submit" value="Save" ></td>
						
</tr>
			
<tr>
<td colspan="2" align="center"><input type="submit" value="cancel" ></td>
</tr>
</table>
</form:form>
	</div>

</body>
</html>