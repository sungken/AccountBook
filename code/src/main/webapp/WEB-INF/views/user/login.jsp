<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>BudgetBuddy | 로그인</title>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="/account/asset/css/materialdesignicons.min.css">
<link rel="stylesheet" href="/account/asset/css/vendor.bundle.base.css">
<!-- plugins:css -->
<!-- <link rel="stylesheet" href="/account/asset/css/style.css"> -->
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<!-- endinject -->
<!-- Layout styles -->
<link rel="stylesheet" href="/account/asset/css/corona\_style.css">
<!-- End layout styles -->
<link rel="shortcut icon" href="/account/asset/images/favicon.png" />
<style>
body {
	color: black;
}

.card {
	border: none;
}

.form-control {
	background-color: #D9D9D9;
	border: none;
}

.find-info-btn {
  width: 300px;
  display: flex;
  flex-direction: column;
}
<%@ include file="/WEB-INF/views/inc/asset.jsp"%>
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/inc/header.jsp"%>
	<div class="container-scroller">
<!-- 		<div class="container-fluid page-body-wrapper full-page-wrapper"> -->
		<div class="content-total-style">
			<div class="login-page-container user-info-box-container-style">
<!-- 				<div class="content-wrapper full-page-wrapper d-flex align-items-center auth login-bg"> -->
				<div class="user-info-container-style">
<!-- 					<div class="card col-lg-4 mx-auto"> -->
					<div class="">
						<div class="card-body">
							<h3 class="card-title text-left mb-3">Login</h3>
							<form method="POST" action="/account/user/login.do">
								<div class="form-group">
									<label>ID</label> <input type="text" name="id"
										class="form-control input-style-form">
								</div>
								<div class="form-group">
									<label>Password</label> <input type="password" name="pw"
										class="form-control input-style-form">
								</div>
								<div
									class="form-group d-flex align-items-center justify-content-between">
									<div class="form-check">
										<label class="form-check-label"> <input
											type="checkbox" class="form-check-input" name="autoLogin">자동 로그인
										</label>
									</div>
								</div>
									<button type="submit" class="button purple-btn full-btn submit-btn-style">로그인</button>

								<div class="login-bottom-btn-box">
									<p class="sign-up">
										<a href="/account/user/register.do">Sign Up</a>
									</p>
									<div class="find-info-btn">
										<a href="/account/user/find-id.do" class="forgot-id">아이디 찾기</a>
										<a href="/account/user/find-pw.do" class="forgot-pw">비밀번호 찾기</a>
									</div>
								
								</div>
							</form>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
			</div>
			<!-- row ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="/account/asset/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="/account/asset/js/off-canvas.js"></script>
	<script src="/account/asset/js/hoverable-collapse.js"></script>
	<script src="/account/asset/js/misc.js"></script>
	<script src="/account/asset/js/settings.js"></script>
	<script src="/account/asset/js/todolist.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<!-- endinject -->
</body>
</html>