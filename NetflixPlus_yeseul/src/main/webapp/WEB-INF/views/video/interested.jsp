<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>관심 콘텐츠 | 넷플릭스 플러스</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/interested.css?ver=2">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<header>
		<jsp:include page="/resources/headerfooter/header.jsp" />
	</header>

	<div class="movie-content">
		<div id="interested-text">
			<!-- css에서 margin도 padding도 안 먹어서 결국 br -->
			<br/><br/><br/><br/><br/>
		 	<h1>관심 콘텐츠</h1>
			<h3>내가 찜한 영화</h3>
		</div>
		<div id="movie_container">
			<c:forEach items="${intList }" var="video">
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