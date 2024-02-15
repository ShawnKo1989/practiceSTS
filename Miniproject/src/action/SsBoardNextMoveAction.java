package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SsboardDao;

public class SsBoardNextMoveAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int ssbno = Integer.parseInt(request.getParameter("ssbno"));
		int nextNum = 0;
		SsboardDao sbDao = SsboardDao.getInstance();
		nextNum = sbDao.getNextNum(ssbno);
		if(nextNum==0) {
			request.setAttribute("message", "마지막페이지입니다.");
			nextNum=ssbno;
		}
		request.getRequestDispatcher("/Controller?command=SsBoardPageMoveAction&ssbno="+nextNum)
		.forward(request, response);
	}
}
