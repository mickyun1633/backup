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
   <h1><%= request.getAttribute("userName") %>님 환영합니다.</h1>
   <h1>2026년 나이는 <%= request.getAttribute("userAge") %>살 입니다.</h1>
   <h1>만 나이는 <%= request.getAttribute("realAge") %>살 입니다.</h1>
   <h1>성별은 <%= request.getAttribute("userGender") %>입니다.</h1>
   <h1>선호 색상은 </h1>
   <%
      String[] colors = (String[]) request.getAttribute("color");
      if(colors != null & colors.length > 0){
         for(String color:colors){
            out.println("<p>" + color + "</p>");
         }
      }else{
         out.println("<p>선택된 색상이 없습니다</p>");
      }
   %>
   
   <!-- redirect 용으로 결과값 받기 -->
   <%-- <h1>${param.userName}님 환영합니다</h1>
   <h1>2026년 나이는 ${param.userAge}살입니다</h1> --%>
   
</body>
</html>