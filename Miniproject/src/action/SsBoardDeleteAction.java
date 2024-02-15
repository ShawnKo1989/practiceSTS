package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SsboardDao;

public class SsBoardDeleteAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int ssbno = Integer.parseInt(request.getParameter("ssbno"));
		
		SsboardDao sbDao = SsboardDao.getInstance();
		sbDao.getDeleteboard(ssbno);
		
		request.setAttribute("message", "해당 게시글이 삭제되었습니다.");
		request.getRequestDispatcher("/Controller?command=SsBoardListMoveAction")
		.forward(request, response);
		
	}

}
