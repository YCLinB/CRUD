<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>學生建檔系統</title>
<script>
	function goToSelect(){
		location.href='${pageContext.request.contextPath}/showStudent.jsp';
	}
</script>
</head>
<body>
	<form>
		<p>
			<label>請輸入要產生學生資料的筆數：</label>
			<input name='dataNum' required>
			<input type='submit' value='submit'>
		</p>
		<input class='buttonType' type='button' value='查詢學生資料' onclick='goToSelect()' > 
	</form>
</body>
</html>
