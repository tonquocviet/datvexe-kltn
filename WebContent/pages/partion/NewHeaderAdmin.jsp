<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="top_nav">
	<div class="nav_menu">
		<nav>
			<div class="nav toggle">
				<a id="menu_toggle"><i class="fa fa-bars"></i></a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li class=""><a href="javascript:;"
					class="user-profile dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"> <img src="images/img.jpg" alt="">
					<%=(String)request.getSession().getAttribute("tenNguoiDung")%>
					<span class=" fa fa-angle-down"></span>
				</a>
					<ul class="dropdown-menu dropdown-usermenu pull-right">
						<li><a href="${pageContext.request.contextPath}/account/changeInfo.do">Tài khoản</a></li>
						<li><a href="${pageContext.request.contextPath}/account/changePassword.do">Đổi mật khẩu</a></li>
						<li><a href="${pageContext.request.contextPath}/logout.do"><i
								class="fa fa-sign-out pull-right"></i> Đăng xuất</a></li>
					</ul></li>
			</ul>
		</nav>
	</div>
</div>