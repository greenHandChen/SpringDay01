<%--
  Created by IntelliJ IDEA.
  User: LHB
  Date: 2019/7/19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询所有的帐户</h3>

<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>


</body>
</html>
