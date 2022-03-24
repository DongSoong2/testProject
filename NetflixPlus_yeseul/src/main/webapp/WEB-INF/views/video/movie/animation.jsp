<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>모든 영화 | 넷플릭스 플러스</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/movie.css">
	<script type="text/javascript" src="/resources/js/movie.js"></script>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<header>	
		<jsp:include page="/resources/headerfooter/header.jsp" />
	</header>

	<div class="movie-content">
	 
		<div id="movie-section">
			<h1>영화</h1>
			<div class="movie-select" onclick="selectClick()">
				<div class="movie-selected">애니메이션</div>
				<img src="/resources/img/arrow-down.png" id="arrow-img">

				<div id="movie-select-list">
					<span>&nbsp;</span>
					<a href="movie.do">
						<span class="movie-select-option">모든 영화 보기</span>
					</a>
					
					<a href="actionNadventure.do">
						<span class="movie-select-option">액션 &amp; 어드벤처</span>
					</a>
					
					<a href="animation.do">
						<span class="movie-select-option">애니메이션</span>
					</a>
					
					<a href="family.do">
						<span class="movie-select-option">가족</span>
					</a>
					
					<a href="drama.do">
						<span class="movie-select-option">드라마</span>
					</a>
					
					<a href="kids.do">
						<span class="movie-select-option">키즈</span>
					</a>
					
					<a href="disney.do">
						<span class="movie-select-option">디즈니</span>
					</a>
					
					<a href="marvel.do">
						<span class="movie-select-option">마블</span>
					</a>
					
					<a href="pixar.do">
						<span class="movie-select-option">픽사</span>
					</a>
					<span>&nbsp;</span>
				</div>
			</div>
		</div>
		
		<div id="movie_container">
			<c:forEach items="${animeList }" var="video">
				<div class="video_button">
					<a href="<%-- /detail/${ }.do --%>"><img src="/resources/img/${video.videoImage }" ></a>
				</div>
			</c:forEach>
		</div>
		
	</div>
	
	<footer>		
		<jsp:include page="/resources/headerfooter/footer.jsp" />
	</footer>
</body>
</html>