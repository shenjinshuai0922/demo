<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/mystyles.css" >
<script type="text/javascript">
   function add(){
	   location.href="/add";
   }
</script>
</head>
<body>
<button onclick="add()">添加</button>
<table>  
   <tr>
      <td>编号</td>
      <td>名称</td>
      <td>日期</td>
      <td>商品</td>
      <td>操作</td>
   </tr>
   <c:forEach items="${shops}" var="s">
     <tr>
       <td>${s.id}</td>
       <td>${s.name}</td>
       <td>${s.created}</td>
       <td>${s.gnames}</td>
       <td>
          修改|删除
       </td>
     </tr>
   </c:forEach>
</table>
</body>
</html>