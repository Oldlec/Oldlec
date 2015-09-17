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
					<th>추천</th>
					<th>반대</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="article" items="${articleList}">
					<tr>
						<td class="seq">${article.no}</td>
						<td class="title"><a href="article-detail?articleNo=${article.no}" />${article.title}
							[${article.cntCmnt }]</td>
						<td class="writer">${article.writerName}</td>
						<td class="regdate"><fmt:formatDate
								value="${article.regDate }" pattern="yyyy-MM-dd" /></td>
						<td class="hit">${article.view }</td>
						<td>${article.cntLiked }</td>
						<td>${article.cntNotLiked }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


		<ul>
			<c:if test="${(status eq 'end') || (status eq 'middle')}">
				<a href="?page=${tenByTenStart -1}">prev 10</a>
			</c:if>
		
			<c:forEach var="i" begin="${ tenByTenStart}" end="${tenByTenEnd }">
				<li><a href="?page=${i}">${i}</a></li>
			</c:forEach>
		
			<c:if test="${(status eq 'start') || (status eq 'middle')}">
				<a href="?page=${tenByTenEnd+1 }">next 10</a>
			</c:if>
		</ul>

	</nav>
				
			





</body>
</html>