<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>學生建檔系統</title>
</head>
<body>
	<div>
		<table id='studentInfo'>
			<caption>學生資料清單</caption>
			<thead>
				<tr>
					<th>學號</th>
					<th>姓名</th>
					<th>年齡</th>
					<th>性別</th>
					<th>信箱</th>
					<th>密碼</th>
					<th>刪除</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${student}" var="stu" >
				<tr>
					<td>${stu.id}</td>
            		<td>${stu.name}</td>
           			<td>${stu.age}</td>
           			<td>${stu.sex}</td>
           			<td>${stu.mail}</td>
           			<td>${stu.password}</td>
				</tr>
			</c:forEach>
			</tbody>
								
		</table>
	</div>
</body>
</html>
