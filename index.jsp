<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.title{
		margin-top:10em;
		text-align: center;
	}
	.goToInsertPage{
		text-align:center;
	}
	.buttonType{
		width: 200px;
	}
	
</style>
<script>	
function goToInsert(){
	location.href='${pageContext.request.contextPath}/insertStudent.jsp';
}
</script>
<title>學生建檔系統</title>
</head>
<body>
	<div class='title'>
		<h2>歡迎使用學生建檔系統</h2>
	</div>
	<div class='goToInsertPage'>
		<input class='buttonType' type='button' value='開始建檔' onclick='goToInsert()' >
	</div>	
</body>
</html>
