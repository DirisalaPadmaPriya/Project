<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technologies Information</title>
</head>
<body>
<div align="center">
 <table border="1" bordercolor="dimgray">
 <th>Technologies Id</th>
 <th>Technologies Name</th>
  <c:forEach var="tech"  items="${tech}">
  <tr>
  <td>${tech.techName}</td>
  <td><a href="edittech?techId=${tech.techId}"  style="color: #006400">Update Details</a></td>
  <td><a href="delete?TechId=${tech.techId}" style="color: #cc0000">Delete</a></td>
  </tr>
   </c:forEach>
   </table>
   </div>
   <center>
   <a href="newtech">add new tech</a>
   </center>
</body>
</html>