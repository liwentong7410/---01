<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加汽车</title>
<style>
	table{
		margin:0 auto;
	}
	.t{
		text-align:center;
	}
</style>
</head>
<body>
<div>
	<form action="addCar" method="get">
		<table>
			<tr>
				<td class="t">添加汽车</td>
			</tr>
			<tr>
				<td>汽车名字：<input type="text" name="carName" placeholder="请输入汽车名字" value="auto1"/></td>
			</tr>
			<tr>
				<td>汽车颜色：<input type="text" name="carColor" placeholder="请输入汽车颜色" value="white"/></td>
			</tr>
			<tr>
				<td>汽车价格：<input type="text" name="carPrice" placeholder="请输入汽车价格" value="10.00"/></td>
			</tr>
			<tr>
				<td>汽车生产日期：<input type="text" name="carDate" placeholder="请输入汽车生产日期" value="1996.01.01"/></td>
			</tr>
			<tr>
				<td class="t"><button>添加汽车</button></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>