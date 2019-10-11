<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addt" method="post">
  店面名称:<input type="text" name="name"><br>
 创建日期: <input type="date" name="created"><br>
 商品:
 <c:forEach items="${list}" var="a">
    <input type="checkbox" name="gids" value="${a.id}">${a.name}
 </c:forEach><br>
 <input type="submit" value="提交"><br>
</form>
</body>
</html>