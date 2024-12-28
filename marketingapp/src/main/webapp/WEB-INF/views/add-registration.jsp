<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add registration</title>
</head>
<body>

     <h2>Add registration</h2>
     <form action="saveReg" method="post">
          <pre>
              Full Name <input type="text" name="name"/>
              Email <input type="text" name="email"/>
              Mobile <input type="text" name="mobile"/>
              <input type = "submit" value="save"/>
             </pre>
      </form>
      ${msg}
     

</body>
</html>