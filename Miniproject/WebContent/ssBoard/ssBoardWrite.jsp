<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<script src="/Miniproject/js/jquery-3.7.0.min.js"></script>
<link href="/Miniproject/css/ssBoardWrite.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="outline">
		<div class="alignDiv">
		<div class="toptextArea">
		<h1>게시글 작성</h1><br/>
		<h3>스크린샷 게시판에 업로드 되는 스크린샷/동영상 컨텐츠 작성 페이지입니다.</h3>
		</div>
		<form action="/Miniproject/Controller" method="post">
		<input type="hidden" name="command" value="SsBoardWriteAction">
		<table>
			<tr>
				<td colspan="2">
					<div>
						카테고리 : <select name="writingCategory" id="ssBoardCategory" required>
							<option>스크린샷</option>
							<option>동영상</option>
						</select>
					</div>
				</td>
			</tr>
			<tr>
				<th>게시물 제목</th>
				<td>
					<div>
						<input type="text" name="ssBoardTitle" class="writingArea1" autocomplete="off" placeholder="제목을 입력하세요">
					</div>
				</td>
			</tr>
			<tr>
				<th colspan="2">게시물 내용</th>
			</tr>
			<tr>
				<td colspan="2">
					<div>
						<textarea cols="50" rows="10" name="ssBoardContent" class="writingArea2" autocomplete="off" placeholder="내용을 입력하세요"></textarea>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div>
						<input type="file" id="uploadFile" required>
					</div>
				</td>
			</tr>
		</table>
		<div class="bottomBtnArea">
			<button id="writingUploadBtn" class="bottomBtn">작성완료</button>
			<div id="MovetoBoardList" class="bottomBtn"><p>목록으로</p></div>
		</div>
		<div id="uploadedImageContainer"></div>
		</form>
		</div>
	</div>
	<script>
	//콘텐츠 클릭시 해당 콘텐츠페이지로 이동
	$(function(){
		$("#MovetoBoardList").click(function(){
			location.href="/Miniproject/Controller?command=SsBoardListMoveAction";
		});
		$("#writingUploadBtn").click(function(){
			const fileDOM = document.querySelector('#uploadFile');
			const src = URL.createObjectURL(fileDOM.files[0]);
			$('table').append("<input type='hidden' name='ssBoardContents' id='aaa' value='"+src+"'>");
			const imgTag = "<img src='" + src + "' alt='Uploaded Image'>";
	        $('#uploadedImageContainer').html(imgTag);
			return true;
		});
	});
	</script>
</body>
</html>