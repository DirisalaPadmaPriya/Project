<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
<title>Vertical Information</title>
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
<form:form action="saveVerticals" method="post" modelAttribute="verticals">
<table border="0" bordercolor="dimgray">
<form:hidden path="verticalId" />
<tr>
<td>Vertical Name</td>
<td><form:select path="verticals.verticalName" >
<form:option value="--select--" label="--select--"/>
<form:option value="BFNS" label="BFNS"/>
<form:option value="Manufacturing" label="Manufacturing"/>
<form:option value="Insurance" label="Insurance"/>
<form:option value="Health Care" label="Health Care"/>
<form:option value="Life Sciences" label="Life Sciences"/>
<form:option value="TMT" label="TMT"/>
<form:option value="Retail" label="Retail"/>
<form:option value="Logistics" label="Logistics"/>
<form:option value="Salesforce" label="Sales"/>
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