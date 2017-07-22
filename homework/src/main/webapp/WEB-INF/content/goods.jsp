<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>商品首页</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
  </head>
 <body>
	<font color="#FF5809"><h1>欢迎商家${sessionScope.alogin.loginname }来到饰品小屋！</h1></font>
	<font color="#FF5809"><h3>当前在线人数为：${applicationScope.count}人</h3></font>
	<div>
	<h1><a class="btn btn-primary" href="plusgoods" role="button">上架新商品</a>
		<a class="btn btn-danger" href="redgoods" role="button">下架商品</a>
	</h1>
	</div>
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		    <font size="5"><a href="loginForm">登陆</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    	
    		<font size="5"><a href="order">我家订单</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<table class="table table-hover">
				<thead>
					<tr>
						<th>图片</th><th>物品名</th><th>描述</th><th>价格</th><th>数量</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${requestScope.goods_list}" var="goods">
					<tr>
						<td><img src="img/${goods.image1}"height="60"></td>
						<td>${goods.goods_name}</td>
						<td>${goods.discriber}</td>
						<td>${goods.price}</td>
						<td>${goods.count}</td>
					</tr>	
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>

  </body>
</html>