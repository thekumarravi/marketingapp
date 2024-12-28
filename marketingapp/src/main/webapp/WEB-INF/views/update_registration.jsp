<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update registration</title>
</head>
<body>

     <h2>Update registration</h2>
     <form action="UpdateReg" method="post">
          <pre>
               <input type="hidden" name="id" value="${registration.id}"/>
              Full Name <input type="text" name="name" value="${registration.name}"/>
              Email <input type="text" name="email" value="${registration.email}"/>
              Mobile <input type="text" name="mobile"value="${registration.mobile}"/>
              <input type = "submit" value="update"/>
             </pre>
      </form>
      ${msg}

</body>
</html>