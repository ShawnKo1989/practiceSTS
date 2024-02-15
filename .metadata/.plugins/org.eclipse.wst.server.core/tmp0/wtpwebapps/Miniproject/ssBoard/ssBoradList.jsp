<%@page import="dao.SsboardDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.SsboardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int pageNum =0;
	try{
		pageNum = Integer.parseInt(request.getParameter("pageNum"));
	}catch(NumberFormatException e){
		pageNum = 1;
	}

	ArrayList<SsboardDto> sbList = new ArrayList<SsboardDto>();
	SsboardDao sbDao = SsboardDao.getInstance();
	sbList = sbDao.getSsboardList(sbList, pageNum);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크린샷 게시판</title>
<script src="/Miniproject/js/jquery-3.7.0.min.js"></script>
<link href="/Miniproject/css/ssBoardList.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="outline">
		<div class="headTitle">
			<h1>스크린샷 게시판</h1>
		</div>
		
		<div class="headSub">
			<h3>유저들이 간단한 스크린샷을 올릴수 있는 게시판입니다.</h3>
		</div>
		
		<div class="selectBar">
			<div class="select_left">
				<select name="selectBoard" class="selectBoard">
					<option>전체</option>
					<option>스크린샷</option>
					<option>동영상</option>
				</select>
				<input type="search" name="searchingTitle" class="searchingBar"/>
				<input type="submit" value="검색" class="searchingBtn"/>
			</div>
			<div class="select_right">
				<input type="submit" value="글쓰기" class="writeBtn"/>
			</div>
		</div>
		<% int z =0;%>
		<table>
			<% for(int i = 1; i<=sbList.size()/5; i++){%>
			<tr>
				<%for(int j = z; j<= z+4; j++){%>
				<td class="sigleBoardContent">
					<input type="hidden" value="<%=sbList.get(j).getSsbno()%>"/>
					<div class="imgBox"><img src="<%=sbList.get(j).getSscontents()%>"></div>
					<div class="ssTitle"><%=sbList.get(j).getSstitle()%></div>
					<div class="ssWriter">작성자 : <%=sbList.get(j).getSswriter() %></div>
					<div class="ssWriteDate">
					<%=sbList.get(j).getSsWriteDate()%><br/>
					<img src="https://i.pinimg.com/originals/49/85/1c/49851c166722c7cb9f9cf905f617e266.png">좋아요 <%=sbList.get(j).getSslike() %>명, 
					<img src="https://cdn-icons-png.flaticon.com/512/2394/2394105.png">조회수: <%=sbList.get(j).getSsview() %>명
					</div>
				</td>
				<%} z+=5;%>
			</tr>
			<%}
			double pageCount = (double)sbList.get(0).getTotalNum()/25;
			%>
		</table>
		<div class="pagenation">
			<%for(int i = 1; i<= Math.ceil(pageCount); i++){  %>
				<div class="singlePageNum">
					<a href="/Miniproject/ssBoard/ssBoradList.jsp?pageNum=<%=i%>" ><%=i %></a>
				</div>
			<%} %>
		</div>
	</div>
	<script>
		//알림메시지가 있을경우 작동
		var message = '${message}';
		if(message!='null'&& message!=''){
			alert(message);
		}
		//콘텐츠 클릭시 해당 콘텐츠페이지로 이동
		$(function(){
			$("td").click(function(){
				var ssbno = $(this).children().first().val();
				location.href="/Miniproject/Controller?command=SsBoardPageMoveAction&ssbno="+ssbno;
			});
			$(".writeBtn").click(function(){
				location.href="/Miniproject/Controller?command=SsBoardWriteMoveAction";
			});
		});
	</script>
</body>
</html>