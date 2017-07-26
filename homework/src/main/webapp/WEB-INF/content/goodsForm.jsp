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
	<font color="#FF5809"><h1>欢迎${sessionScope.user.loginname }来到饰品小屋！</h1></font>
	<font color="#FF5809"><h3>当前在线人数为：${applicationScope.count}人</h3></font>
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		    <font size="5"><a href="loginForm">登陆</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<font size="5"><a href="signForm" >注册</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    		
			<font size="5"><a href="cartForm" >我的购物车</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<font size="5"><a href="collectForm">我的收藏</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<font size="5"><a href="orderForm">我的订单</a></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<table class="table table-hover">
				<thead>
					<tr>
						<th>图片</th><th>物品名</th><th>描述</th><th>价格</th><th>库存</th><th>售量</th><th>商品详情</th><th>加入购物车</th><th>收藏物品</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${requestScope.goods_list}" var="goods">
					<tr>
						<td><img src="img/${goods.image1}"height="100"></td>
						<td>${goods.goods_name}</td>
						<td>${goods.discriber}</td>
						<td>${goods.price}</td>
						<td>${goods.count}</td>
						<td>${goods.sale}</td>
						<td><form action="select" method="post">
                			<input type="submit" style="background-color:#FFBFFF" value="商品详情">
               				<input type="hidden" id="goods_id" name="goods_id" value="${goods.goods_id }" >
                			</form>
                		</td>
						<td><form action="addCart" method="post">
							<input type="hidden" id="goods_id" name="goods_id" value="${goods.goods_id }">
							<input type="hidden" id="goods_name" name="goods_name" value="${goods.goods_name }">
							<input type="hidden" id="price" name="price" value="${goods.price }">
							<input type="hidden" id="image1" name="image1" value="${goods.image1 }">
							<input type="hidden" id="user_id" name="user_id" value="${sessionScope.user.user_id }">
							<input type="submit" style="background-color:#4DFFFF" value="加入购物车">
							</form></td>
						<td><form action="addcollect" method="post">
							<input type="hidden" id="goods_id" name="goods_id" value="${goods.goods_id }">
							<input type="hidden" id="price" name="price" value="${goods.price }">
							<input type="hidden" id="image1" name="image1" value="${goods.image1 }">
							<input type="submit" style="background-color:#79FF79" value="收藏">
							</form></td>
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