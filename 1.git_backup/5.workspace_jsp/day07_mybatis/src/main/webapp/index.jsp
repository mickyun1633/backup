<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>
	<h1>메인페이지</h1>

	userId : ${sessionScope.userId}
	<br>
	userName : ${sessionScope.userName}
	<br>

<c:choose>
    <c:when test="${not empty sessionScope.userId}">
        ${sessionScope.userName}님 환영합니다
    </c:when>

    <c:otherwise>
        로그인 필요
    </c:otherwise>
</c:choose>
</body>
</html>