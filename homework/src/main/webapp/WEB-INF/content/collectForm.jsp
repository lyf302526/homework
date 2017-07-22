<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的收藏</title>
<meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
欢迎[${sessionScope.user.loginname }]查看我的收藏
<h1><a class="btn btn-primary" href="goodsForm" role="button">继续购物</a>
<a class="btn btn-danger" href="clearcollect" role="button">全部清空</a></h1>
<table class="table table-hover">
				<thead>
					<tr>
						<th>图片</th><th>物品ID</th><th>价格</th><th>数量</th>
						<th class="thtd"><font color="red">删除</font></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${requestScope.collect_list}" var="collect">
					<tr>
						<td><img src="img/${collect.image1}"height="60"></td>
						<td>${collect.goods_id}</td>
						<td>${collect.price}</td>
						<td>${collect.count}</td>
						<td>
							<form action="removecollect" method="post" >
							<input type="submit" style="background-color:#FF0000" value="删除">
							<input type="hidden" id="id" name="id" value="${collect.id}">
							</form>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
</body>
</html>