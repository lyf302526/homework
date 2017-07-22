<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>添加商品</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<form role="form" action="addgoods" method="post">
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						商品ID：
					</label>
					<input type="text" class="form-control" id="goods_id" name="goods_id">
				</div>
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						商品名：
					</label>
					<input type="text" class="form-control" id="goods_name" name="goods_name">
				</div>
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						商品描述：
					</label>
					<input type="text" class="form-control" id="discriber" name="discriber">
				</div>
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						商品价格：
					</label>
					<input type="text" class="form-control" id="price" name="price">
				</div>
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						商品数量：
					</label>
					<input type="text" class="form-control" id="count" name="count">
				</div>
				<div class="form-group">
					 
					<label for="exampleInputFile">
						增加图片：
					</label>
					<input type="file" id="image1" name="image1" >
				</div>
				<button type="submit" class="btn btn-default" id="addgoods" name="addgoods">
					确定增加
				</button>
			</form>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>