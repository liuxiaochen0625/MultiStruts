<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<script type="text/javascript">
	function regist()
	{
		//获取该页面中的第一个表单元素
		targetForm = document.forms[0];
		//动态修改目标表单的action属性
		targetForm.action = "login!regist";
		//提交表单
		targetForm.submit();
	}
	</script>
</head>
<body>
	<form action="login" method="post">
		<table width="300" align="center">
	<tr>
		<td>用户名:</td>
		<td><input type="text" name="user"/></td>
	</tr>
	<tr>
		<td>密&nbsp;&nbsp;码:</td>
		<td><input type="text" name="pass"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="登录"/></td>
		<td><input type="button" value="注册" onclick="regist();"/></td>
	</tr>
	</table>
</form>
</body>
</html>