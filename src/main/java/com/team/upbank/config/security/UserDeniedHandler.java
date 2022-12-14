package com.team.upbank.config.security;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

//접근 권한이 없을때 
public class UserDeniedHandler implements AccessDeniedHandler{

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {

		System.out.println("<<< UserDeniedHandler - handle 진입 >>>");
		System.out.println("sesseionId : " +request.getAttribute("customerID"));
		
		request.setAttribute("errMsg", "관리자만 접근 할 수 있는 페이지입니다.");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/common/accessDenied.jsp");
		dispatcher.forward(request, response);
	}

}
