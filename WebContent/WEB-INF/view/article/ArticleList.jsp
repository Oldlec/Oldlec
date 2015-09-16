<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="ctxName" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



	<nav id="article-list">
					<h1 class="hidden">게시판 글 목록</h1>
						
						<table>
							<thead>
								<tr>
									<th>글 번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>등록일</th>
									<th>조회수</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="article" items="${articleList}">
							<tr>
								
								<td class="seq">${article.no}</td>
								<td class="title"><a href="board-detail?detail=${article.no}"/>${article.title} [${article.cntCmnt }]</td>
								<td class="writer">${article.writerName}</td>
								<td class="regdate"><fmt:formatDate value="${article.regDate }" pattern="yyyy-MM-dd"/></td>
								<td class="hit">${article.view }</td>
								
							</tr>
							</c:forEach>
							</tbody>
						</table>
		</nav>
				
			





</body>
</html>