package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SsboardDao;

public class SsBoardPrevMoveAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int ssbno = Integer.parseInt(request.getParameter("ssbno"));
		int prevNum = 0;
		SsboardDao sbDao = SsboardDao.getInstance();
		prevNum = sbDao.getPrevNum(ssbno);
		if(prevNum==0) {
			request.setAttribute("message", "첫페이지입니다.");
			prevNum=ssbno;
		}
		request.getRequestDispatcher("/Controller?command=SsBoardPageMoveAction&ssbno="+prevNum)
		.forward(request, response);
	}
}
