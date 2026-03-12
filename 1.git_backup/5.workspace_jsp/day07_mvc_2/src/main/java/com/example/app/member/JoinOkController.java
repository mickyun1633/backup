package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class JoinOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		System.out.println(memberDTO); //MemberDTO [memberNumber=0, memberId=null, memberPassword=null, memberName=null, memberAge=0, memberGender=null]

		memberDTO.setMemberId(request.getParameter("memberId"));
		memberDTO.setMemberPassword(request.getParameter("memberPw"));
		memberDTO.setMemberName(request.getParameter("memberName"));
		// parseInt()는 문자열이 숫자가 아닐경우 numberFormatException 발생
		// valueOf()는 문자열을 Integer로 바꿔준다, 문자열이 숫자가 아닐경우 null을 반환한다
		memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
		memberDTO.setMemberGender(request.getParameter("memberGender"));
		memberDAO.join(memberDTO);
		System.out.println(memberDTO + "회원가입완료");
		
		result.setRedirect(true);
		result.setPath(request.getContextPath() + "/index.jsp");
			
		return result;
	}
	

}
