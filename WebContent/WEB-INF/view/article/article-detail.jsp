<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<article id="article">
		<h1 class="hidden">게시판 글</h1>
		<dl>

			<dt>제목</dt>
			<dd>${article.title }</dd>
			<dt>조회수</dt>
			<dd>${article.view }view</dd>
			<dt>댓글수</dt>
			<dd>${article.cntCmnt }comments</dd>
			<dt>등록일</dt>
			<dd>
				<fmt:formatDate value="${article.regDate }" pattern="yyyy-MM-dd" />
			</dd>
			
			<dt>추천</dt><dd>${article.cntLiked }</dd>
			<dt>반대</dt><dd>${article.cntNotLiked }</dd>
			
			
			<dt>내용</dt>
				<dd>${article.content }</dd>
		</dl>
	</article>


	<article>
		<h1>댓글</h1>

			<c:forEach var="comment" items="${article.commentsOfThis}">
				<dl>
					<dt class="seq">CommentNo</dt>
					<dd>${comment.no }</dd>
					<dt class="writer-name">userNo</dt>
					<dd>${comment.userNo }</dd>
					<dt class="content">내용</dt>
					<dd>${comment.content }</dd>
					<dt class="reg-date">등록일</dt>
					<dd>${comment.regDate }</dd>
	
				</dl>
			</c:forEach>
		
	</article>





</body>
</html>