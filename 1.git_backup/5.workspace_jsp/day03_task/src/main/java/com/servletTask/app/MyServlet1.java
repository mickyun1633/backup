package com.servletTask.app;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      response.getWriter().append("Served at: ").append(request.getContextPath());
      
      request.setCharacterEncoding("UTF-8");
      
      String name = request.getParameter("userName");
      int age = Integer.parseInt(request.getParameter("userAge"));
      int realAge = age - 1;
      
      request.setAttribute("userName", name);
      request.setAttribute("userAge", age);
      request.setAttribute("realAge", realAge);
      
      String userGender = request.getParameter("userGender");
      String gender = null;
      
      //조건문(switch)
      switch(userGender) {
      case "M":
         gender="남자";
         break;
      case "F":
         gender = "여자";
         break;
      case "N":
         gender = "선택안함";
         break;
      }
      
      request.setAttribute("userGender", gender);
      
//      request.getRequestDispatcher("result.jsp").forward(request, response);
      
      //redirect는 request 영역 사용 불가
      String encodeName= URLEncoder.encode(name, StandardCharsets.UTF_8.toString());
      String encodeGender = URLEncoder.encode(gender, StandardCharsets.UTF_8.toString());
      response.sendRedirect("result.jsp?userName=" + encodeName + "&userAge=" + age + "&realAge=" + realAge+
            "&userGender="+encodeGender);
      
      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}
