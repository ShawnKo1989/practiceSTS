<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 페이지</title>
<script src="/Miniproject/js/jquery-3.7.0.min.js"></script>
<link href="/Miniproject/css/ssBoardPage.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="outline">
	<div class="headTitle">
		<h1>게시글</h1>
		<h5>유저가 입력한 게시글을 확인할수 있는 페이지입니다.</h5>
	</div>
	<div class="topBtnArea">
		<div id="topLeftBtn" class="topBtn"> ← 이전글 확인</div>
		<div id="topRightBtn" class="topBtn">다음글 확인 →</div>
	</div>
		<table>
			<tr>
				<th>글번호</th>
				<td>${ssbno}</td>
				<th>글제목</th>
				<td>${sstitle}</td>
			</tr>		
			<tr>
				<th>작성자</th>
				<td colspan="3">${sswriter}</td>
			</tr>		
			<tr>
				<th colspan="4">내용</th>
			</tr>
			<tr>
				<td colspan="4">
					<img src="${sscontents}"><br/><br/>
					<span>${sscontent}</span>
				</td>
			</tr>		
		</table>
		<div class="mdArea">
			<div id="modifyBtn" class="mdBtns">글수정</div>
			<div id="deleteBtn" class="mdBtns">글삭제</div>
		</div>
		<div class="bottomText">
			<div class="bottom_left">
				<span><img src="https://i.pinimg.com/originals/49/85/1c/49851c166722c7cb9f9cf905f617e266.png" class="clickIcon">
				${sslike}명이 이 게시글을 좋아합니다!</span>
			</div>
			<div class="bottom_right">
				<span><img src="https://cdn-icons-png.flaticon.com/512/2394/2394105.png" class="clickIcon">
				${ssview}명이 이 게시글을 확인하였습니다!</span>
			</div>
		</div>
			<div class="btnArea">
				<div class="btnButton">				
					<div class="bottomBtnText">
					<img src="https://i.pinimg.com/originals/49/85/1c/49851c166722c7cb9f9cf905f617e266.png" class="clickIcon">
					좋아요!</div>
				</div>
				<div class="btnButton">	
					<div id="moveToList" class="bottomBtnText">목록으로</div>
				</div>
			</div>
	</div>
	<script>
		//알림메시지 기능
		var message = '${message}';
		if(message!='null'&& message!=''){
			alert(message);
		}
		//각 버튼 클릭 기능
		$(function(){
			$("#moveToList").click(function(){
				location.href="/Miniproject/Controller?command=SsBoardListMoveAction";
			});
			$("#topLeftBtn").click(function(){
				location.href="/Miniproject/Controller?command=SsBoardPrevMoveAction&ssbno="+${ssbno};
			});
			$("#topRightBtn").click(function(){
				location.href="/Miniproject/Controller?command=SsBoardNextMoveAction&ssbno="+${ssbno};
			});
			$("#deleteBtn").click(function(){
				location.href="/Miniproject/Controller?command=SsBoardDeleteAction&ssbno="+${ssbno};
			});
		});
	</script>
</body>
</html>