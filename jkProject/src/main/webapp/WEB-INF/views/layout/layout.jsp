<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>
		<tiles:getAsString name="title" />
	</title>
	<link rel="stylesheet" href="css/menu.css">
</head>

<body>
	<div align="center">
		<div class="top">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="content">
			<tiles:insertAttribute name="body" />
		</div>
		<hr>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>

</html>