package com.project.accountbook.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.accountbook.util.OutputUtil;

public class AuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

//		System.out.println("권한 체크");
		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession();

//		System.out.println(session.getAttribute("id") == null ? "익명" : session.getAttribute("id"));
//		System.out.println(req.getRequestURI());

		if (session.getAttribute("id") == null) {

			if (req.getRequestURI().contains("card") || req.getRequestURI().contains("board") || req.getRequestURI().contains("/account/account/") || req.getRequestURI().contains("/account/user/member/")) {

				response.setCharacterEncoding("UTF-8");
				PrintWriter writer = ((HttpServletResponse) response).getWriter();
				writer.print(OutputUtil.redirect("비회원은 접근이 불가능합니다."));
				writer.close();

			}
		}

		// 여기서 끝나기 때문에 넘겨줘야한다.
		chain.doFilter(request, response);

	}

}
