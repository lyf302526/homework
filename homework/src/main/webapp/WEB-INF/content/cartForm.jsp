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
<title>购物车</title>
<meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<font color="#FF5809"><h3>欢迎[${sessionScope.user.loginname }]查看购物车</h3></font>
<h1><a class="btn btn-primary" href="goodsForm" role="button">继续购物</a>
<a class="btn btn-danger" href="clearcart" role="button">清空购物车</a></h1>
<table class="table table-hover">
				<thead>
					<tr>
						<th>图片</th><th>物品ID</th><th>物品名称</th><th>价格</th><th>数量</th>
						<th class="thtd"><font color="red">删除</font></th>
						<th class="thtd"><font color="blue">立即购买</font></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${requestScope.cart_list}" var="cart">
					<tr>
						<td><img src="img/${cart.image1}"height="60"></td>
						<td>${cart.goods_id}</td>
						<td>${cart.goods_name}</td>
						<td>${cart.price}</td>
						<td>${cart.count}</td>
						<td>
							<form action="removecart" method="post" >
							<input type="submit" style="background-color:#FF0000" value="删除">
							<input type="hidden" id="id" name="id" value="${cart.id}">
							</form>
						</td>
						<td>
							<form action="addorder" method="post" >
							<input type="submit" style="background-color:#9999CC" value="立即购买">
							<input type="hidden" id="goods_id" name="goods_id" value="${cart.goods_id}">
							<input type="hidden" id="user_id" name="user_id" value="${cart.user_id}">
							<input type="hidden" id="goods_name" name="goods_name" value="${cart.goods_name}">
							<input type="hidden" id="count" name="count" value="${cart.count}">
							</form>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
</body>
</html>