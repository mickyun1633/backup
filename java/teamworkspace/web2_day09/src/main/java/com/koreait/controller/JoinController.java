package com.koreait.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.UserDatabase;

import com.koreait.userDAO.UserDAO;
import com.koreait.userDTO.UserDTO;

/**
 * Servlet implementation class JoinController
 */
@WebServlet("/join")
public class JoinController extends HttpServlet {
   private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JoinController() {
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.getWriter().append("Served at: ").append(request.getContextPath());
      
//      response.setContentType("text/html; charset=UTF-8");
//      
//      String userId = request.getParameter("userId");
//      String userPw = request.getParameter("userPw");
//      
//      System.out.println("아이디 : " + userId);
//      System.out.println("비밀번호 : " + userPw);
//      
//      //Servlet 코드 : 브라우저 화면에 바로 출력
//      response.getWriter().println("<h1>전달된 값</h1>");
//      response.getWriter().println("아이디 : " + userId + "<br>");
//      response.getWriter().println("비밀번호 : " + userPw + "<br>");

      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      
      System.out.println("post 메소드 실행!");
      
      //0. 한글 깨짐 방지!! 인코딩 설정
      request.setCharacterEncoding("UTF-8");
      
      //1. 사용자가 화면에서 입력한 값(파라미터) 수집
      String userId = request.getParameter("userId");
      String userPw = request.getParameter("userPw");
      String userName = request.getParameter("userName");
      String userEmail = request.getParameter("userEmail");
      
      //2. UserDTO 객체 생성
      UserDTO userDTO = new UserDTO();
      userDTO.setUserId(userId);
      userDTO.setUserPw(userPw);
      userDTO.setUserName(userName);
      userDTO.setUserEmail(userEmail);
      
      //3. UserDAO 객체 생성 후 로직 실행
      UserDAO userDAO = new UserDAO();
      
      
      if (UserDAO.checkId(userId)) {
    	  requset.setAttribute("error", "이미 사용중인 아이디 입니다");
    	  
      }
      
      
      
      
      
      //3-2) 회원가입 메소드 호출
      userDAO.inser
   }

}












