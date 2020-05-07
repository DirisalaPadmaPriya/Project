<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verticals Information</title>
</head>
<body>
<div align="center">
 <table border="1" bordercolor="dimgray">
 <th>Vertical Id</th>
 <th>Vertical Name</th>
  <c:forEach var="verticals"  items="${verticals}">
  <tr>
  <td>${verticals.verticalName}</td>
  <td><a href="editVerticals?verticalId=${verticals.verticalId}"  style="color: #006400">Update Details</a></td>
  <td><a href="deleteVerticals?verticalId=${verticals.verticalId}" style="color: #cc0000">Delete</a></td>
  </tr>
   </c:forEach>
   </table>
   </div>
   <center>
   <a href="newVerticals">add new verticals</a>
   </center>
</body>
</html>