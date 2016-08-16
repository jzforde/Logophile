<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=UTF-8">
<link href='http://fonts.googleapis.com/css?family=Hind' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
<link type="text/css" rel="stylesheet" href="cerulean.css">
<link type="text/css" rel="stylesheet" href="start-quiz.css">
<link rel="stylesheet" type="text/css" href="homepageQuiz.css">
<script type="text/javascript" src="homepageQuiz.js"></script>
<title>Start of quiz</title>
</head>
<body>
	<br />
	<h2>Question
		# ${thisMap.thisQuiz.questions[thisMap.index].questionId}</h2>
		<div id="main">
	<form method="post" action="next.do">
		<h3>${thisMap.thisQuiz.questions[thisMap.index].question}</h3>
		<ol>
			<input type="radio" name="option" value="${thisMap.thisQuiz.questions[thisMap.index].options[0].option}">${thisMap.thisQuiz.questions[thisMap.index].options[0].option}<br>
			<input type="radio" name="option" value="${thisMap.thisQuiz.questions[thisMap.index].options[1].option}">${thisMap.thisQuiz.questions[thisMap.index].options[1].option}<br>
			<input type="radio" name="option" value="${thisMap.thisQuiz.questions[thisMap.index].options[2].option}">${thisMap.thisQuiz.questions[thisMap.index].options[2].option}<br>
			<input type="radio" name="option" value="${thisMap.thisQuiz.questions[thisMap.index].options[3].option}">${thisMap.thisQuiz.questions[thisMap.index].options[3].option}<br>
			<input type="submit" value="Submit" class="Button btn btn-primary btn-lg">
		</ol>
	</form>
	</div>
</body>
</html>