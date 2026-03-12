<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <jsp:include page="header.jsp"/>
   <form action="my1" method="get">
      <label for="userName">이름 : </label>
      <input type="text" id="userName" name="userName"><br>
      
      <label for="userAge">나이 : </label>
      <input type="text" id="userAge" name="userAge"><br>
      
      <label for="userGender">성별 : </label>
      <input type="radio" id="userGender" name="userGender" value="M">남자
      <input type="radio" id="userGender" name="userGender" value="F">여자
      <input type="radio" id="userGender" name="userGender" value="N">선택안함<br>
      
      선호 색상 : 
      <input type="checkbox" name="color" value="red">빨강
      <input type="checkbox" name="color" value="green">초록
      <input type="checkbox" name="color" value="blue">파랑<br>
      
      <button>전송</button>
   </form>
</body>
</html>