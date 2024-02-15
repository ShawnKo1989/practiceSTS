package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SsboardDao;
import dto.SsboardDto;

public class SsBoardPageMoveAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int ssbno =Integer.parseInt(request.getParameter("ssbno"));
		ArrayList<SsboardDto> sbList = new ArrayList<SsboardDto>();
		
		SsboardDao sbDao = SsboardDao.getInstance();
		sbList = sbDao.getUserWriting(sbList,ssbno);
		System.out.println("해당 게시글 불러오는중..");
		request.setAttribute("ssbno", sbList.get(0).getSsbno());
		request.setAttribute("sstitle", sbList.get(0).getSstitle());
		request.setAttribute("sswriter", sbList.get(0).getSswriter());
		request.setAttribute("sswritedate",sbList.get(0).getSsWriteDate());
		request.setAttribute("sscontent",sbList.get(0).getSscontent());
		request.setAttribute("sscontents",sbList.get(0).getSscontents());
		request.setAttribute("sslike",sbList.get(0).getSslike());
		request.setAttribute("ssview",sbList.get(0).getSsview());
		
		request.getRequestDispatcher("/ssBoard/ssBoardPage.jsp")
		.forward(request,response);
	}

}
