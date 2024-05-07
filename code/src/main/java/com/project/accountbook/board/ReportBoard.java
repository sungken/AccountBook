package com.project.accountbook.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.accountbook.board.post.model.PostDTO;
import com.project.accountbook.board.repository.BoardDAO;

@WebServlet("/board/reportBoard.do")
public class ReportBoard extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BoardDAO dao = new BoardDAO();
		ArrayList<PostDTO> reportList = dao.list("3");
		
		req.setAttribute("reportList", reportList); // reportList 객체를 요청 객체에 추가
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/board/report-board.jsp");
		dispatcher.forward(req, resp);

	}
}
