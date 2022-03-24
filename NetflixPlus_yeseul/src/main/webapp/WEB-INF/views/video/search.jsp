<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>영화 검색 | 넷플릭스 플러스</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/search.css?ver=1">
	<script type="text/javascript" src="/resources/js/search.js?ver=1"></script>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<header>	
		<jsp:include page="/resources/headerfooter/header.jsp" />
	</header>

	<div class="movie-content">
	 	
		<div id="search-bar-div">
			<form action="goSearch.do" method="get">
				<input type="text" id="search-bar" placeholder="제목을 검색하세요" name="search" onkeyup="enter()">

			</form>
			<img src="/resources/img/x.png" id="reset-button" onclick="reset()">
		</div>
		
		<div id="movie_container">
			<c:forEach items="${searchList }" var="video">
				<div class="video_button">
					<a href="#"><img src="/resources/img/${video.videoImage }" ></a>
				</div>
			</c:forEach>
		</div>
	</div>
	
	<footer>		
		<jsp:include page="/resources/headerfooter/footer.jsp" />
	</footer>
</body>
</html>