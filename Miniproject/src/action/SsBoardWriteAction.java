package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SsboardDao;

public class SsBoardWriteAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("ssBoardTitle");
		String content = request.getParameter("ssBoardContent");
		String contents = request.getParameter("ssBoardContents");
		String category = request.getParameter("writingCategory");
		System.out.println(contents);
		if(category.equals("스크린샷")) {
			category = "pic";
		}else {
			category = "video";
		}
		
		SsboardDao sbDao = SsboardDao.getInstance();
		sbDao.getWritingUpdate(title,content);
		int ssbno = sbDao.getRecentBno();
		sbDao.getContentsUpdate(ssbno,contents,category);
		
		request.setAttribute("message", "게시글이 등록되었습니다.");
		request.getRequestDispatcher("/Controller?command=SsBoardListMoveAction")
		.forward(request,response);
	}

}
