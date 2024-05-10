package com.project.accountbook.user.member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.accountbook.user.member.model.MemberInfoDTO;
import com.project.accountbook.user.member.repository.MemberInfoDAO;

@WebServlet("/user/member/my-card.do")
public class MyCard extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String id = (String)session.getAttribute("id");
		
		MemberInfoDAO dao = new MemberInfoDAO();
		MemberInfoDTO dto = new MemberInfoDTO();
		
		ArrayList<MemberInfoDTO> clist = dao.getMyCards(id);
		
		req.setCharacterEncoding("UTF-8");
		req.setAttribute("clist", clist);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/member/my-card.jsp");
		dispatcher.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		MemberInfoDAO dao = new MemberInfoDAO();
		MemberInfoDTO dto = new MemberInfoDTO();
		
		int seq = Integer.parseInt(req.getParameter("seq"));
		
		System.out.println(seq);
		
		dao.delMyCard(seq);
		
		resp.sendRedirect("/account/user/member/my-card.do");
	}
}
