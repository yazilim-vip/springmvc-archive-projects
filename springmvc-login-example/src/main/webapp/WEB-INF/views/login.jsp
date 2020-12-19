<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
 <p><font color="red">${errorMessage}</font></p>

<form action="${pageContext.request.contextPath}/doLoginWithModel" method="post">
  Username: <input type="text" name="username"/></br>
  Password: <input type="password" name="password"/></br>
  <input type="submit" value="Submit"/>
</form>
</body>
</html>