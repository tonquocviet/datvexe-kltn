  <%@page import="common.StringProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath}/public/src/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="javascript, captcha, html, robot" />
<meta name="robots" content="index, follow" />
<title>Đăng Nhập Hệ Thống</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
	
	<div class="wrapper">
	
		<div class="container">

			<html:form action="/login" method="post">
				<input type="text" placeholder="tên đăng nhập" name="username">
				<%-- <html:errors property="usernameError"/> --%>
				<input type="password" placeholder="mật khẩu" name="password">
				<%-- <html:errors property="passwordError"/> --%>
				
				<p style="color: red;">
						<bean:write name="userForm" property="notice"/>
					</p>
					<div style="margin: 10px;margin-bottom: 3px">
   <button type="submit" class="button" style="">Đăng Nhập</button>
     
   <input class="btn btn-primary" type="button" value="Trở về"
					onclick="history.go(-1);" style="background-color: white;color: green" />
</div>

			
				<p>Bạn chưa có tài khoản? <a href="${pageContext.request.contextPath}/register.do">Đăng ký</a></p>
				
			</html:form>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	



	<script src="${pageContext.request.contextPath}/js/login.js"></script>
	<script src="jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
  var n1 = Math.round(Math.random() * 10 + 1);
  var n2 = Math.round(Math.random() * 10 + 1);
  $("#cau_hoi").val(n1 + " + " + n2);
  $(".ten_form").submit(function (e) {
  
  if (eval($("#cau_hoi").val()) != $("#tra_loi").val()) {
      $("#tra_loi").css('box-shadow', '0px 0px 7px red');
      alert('Ket qua ban nhap sai roi. Xin vui long nhap lai!');
      e.preventDefault(); 
    } 
  });
});
</script>


	
</body>
</html>