<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单详情</title>
<meta name="description" content="Source code generated using layoutit.com">
<meta name="author" content="LayoutIt!">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>
<font color="#FF5809"><h3>欢迎商家${sessionScope.alogin.loginname }查看订单详情</h3></font>
<body>
<div>
<center>
<h2>订单详情</h2>
<h3>订单号：${sessionScope.order.id}</h3>
<h3>商品名称：${sessionScope.order.goods_name}</h3>
<h3>商品id：${sessionScope.order.goods_id}</h3>
<h3>订单状态：${sessionScope.order.state}</h3>
<a class="btn btn-primary" href="order" role="button">返回</a>
</center>
</div>
</body>
</html>