<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 페이지</title>
</head>
<body>
	<h1>안녕!!!</h1>
	<!-- 주석 단축키 : ctrl + shift + /  -->
	<!-- method를 get로 작성하면 폼 데이터를 get 방식으로 서버에 전송하고
	method를 post로 작성하면 폼 데이터를 post 방식으로 서버에 전송한다
	즉, 우리가 method에 get을 쓰면 doGet() 메소드가 실행된다
	폼 태그의 method 속성을 생략하면 다폴트는 get 방식이다(가능하면 생략 금지) -->
	<form action="output" method="post">
		<input type="text" name="userName" placeholder="이름작성">
		<input type="text" name="userAge" placeholder="나이작성">
		<button>전송</button>
		<!-- button 태그는 기본적으로 타입이 submit이다
		submit 버튼은 현재 form 태그의 action에 작성된 경로로 요청(request)를 보낸다
		이 때 request에는 현재 폼에 속해있는 모든 데이터를 가지고 있다 -->
	</form>
</body>
</html>