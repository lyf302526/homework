<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>物品详情</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">


<link href="css/css.css" type="text/css" rel="stylesheet">

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
	<SCRIPT src="js/lib.js" type=text/javascript></SCRIPT>
	<SCRIPT src="js/163css.js" type=text/javascript></SCRIPT>

</head>
<body style="text-align:center;">
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<h1 style="float:left";><font color="#FFCC33">精美饰品</font></h1>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="img/${sessionScope.goods.image1 }" jqimg="img/${goods.image1 }" width=350>
	</div>
	<br>
	<br>
	<br>
	<div id=spec-n5>
		<div class=control id=spec-left>
			<img src="img/left.gif" />
		</div>
		<div id="spec-list">
			<ul class="list-h">
				<li><img src="img/${sessionScope.goods.image1 }"> </li>
				<li><img src="img/${sessionScope.goods.image2 }"> </li>
				<li><img src="img/${sessionScope.goods.image3 }"> </li>
				<li><img src="img/${sessionScope.goods.image4 }"> </li>
				<li><img src="img/${sessionScope.goods.image5 }"> </li>
				
				
			</ul>
		</div>
		<div class=control id=spec-right>
			<img src="img/right.gif" />
		</div>
		
    </div>
</div>
<SCRIPT type=text/javascript>
	$(function(){
		
		$("#spec-list img").bind("mouseover",function(){
			var src=$(this).attr("src");
			$("#spec-n1 img").eq(0).attr({
				src:src.replace("\/n5\/","\/n1\/"),
				jqimg:src.replace("\/n5\/","\/n0\/")
			});
			$(this).css({
				"border":"2px solid #ff6600",
				"padding":"1px"
			});
		}).bind("mouseout",function(){
			$(this).css({
				"border":"1px solid #ccc",
				"padding":"2px"
			});
		});				
		
		
	   $(".jqzoom").jqueryzoom({
			xzoom:400,
			yzoom:400,
			offset:10,
			position:"right",
			preload:1,
			lens:1
		});
	   
	   
		$("#spec-list").jdMarquee({
			deriction:"left",
			width:350,
			height:56,
			step:2,
			speed:4,
			delay:10,
			control:true,
			_front:"#spec-right",
			_back:"#spec-left"
		});
		
	})
	</SCRIPT>



		</div>
		
			
			
		</div>
	</div>



    

	
	<div class="row-fluid">
		<div class="span12">
			<div class="tabbable" id="tabs-665433">
				<ul class="nav nav-tabs">
					<li class="active">
						<a rel="nofollow" href="#panel-365037" data-toggle="tab">累计评价</a>
					</li>
					<li>
						<a rel="nofollow" href="#panel-343705" data-toggle="tab">产品参数</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-365037">
						<p>
							累计评价
						</p>
					</div>
					<div class="tab-pane" id="panel-343705">
						<p>
							产品参数
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>