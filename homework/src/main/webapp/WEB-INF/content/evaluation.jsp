<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评价页面</title>
 <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <link href="http://www.jq22.com/jquery/bootstrap-3.3.4.css" rel="stylesheet">

    <script src="http://www.jq22.com/jquery/1.11.1/jquery.min.js"></script>

    <link href="css/star-rating.css" media="all" rel="stylesheet" type="text/css"/>

    <script src="js/star-rating.js" type="text/javascript"></script>

</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-6">
			<img alt="Bootstrap Image Preview" src="img/ev.jpg">
		</div>
		<div class="col-md-6">
		<form action="evaluat" method="post">
			 <span class="hont">您对商品${sessionScope.order.goods_name }的评价是：</span><br/><br><br>
			<font color="#820041" size="6">物流服务打分：</font>
			<input id="input-21a" name="wuliu" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="xl" >
			<br>
			<font color="#820041" size="6">卖家服务打分：</font>
			<input id="input-21a" name="maijia" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="xl" >
			<br>
			<font color="#820041" size="6">商品质量打分：</font>
			<input id="input-21a" name="zhiliang" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="xl" >
			<br>			
			<input type="text" name="text" id="text" maxlength="100" style=" width:350px; height:80px"/>
			<br>
			<input type=file name="image" id="image" onchange="javascript:setImagePreview();"> 
			<p><div id="localImag"><img id="preview" width=-1 height=-1 style="diplay:none" /></div></p>
			<p><div id="localImag"><img id="preview" width=-1 height=-1 style="diplay:none" /></div></p>
			<br>
			<input type="hidden" id="goods_id" name="goods_id" value="${sessionScope.order.goods_id }"  />
			<input type="hidden" id="user_id" name="user_id" value="${sessionScope.user.user_id }" />
			<br>
			<input type="submit" value="提交" >
			</form>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
 
</body>
</html>