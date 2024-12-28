<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table>
          <tr>
              <th>Name</th>
              <th>Email</th>
              <th>Mobile</th>
              <th>Delete</th>
              <th>Update</th>
          </tr>
         <c:forEach var="reg" items="${registrations}">
         
          <tr>
              <td>${reg.name}</td>
              <td>${reg.email}</td>
              <td>${reg.mobile}</td>
              <td><a href="delete?id=${reg.id}">delete</a>
              <td><a href="getById?id=${reg.id}">update</a>
          </tr>
          
          </c:forEach>
         </table>
</body>
</html>