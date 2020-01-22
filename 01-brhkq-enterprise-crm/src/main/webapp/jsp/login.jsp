<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录-K歌之王</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/public.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/page.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
</head>
<body>

	<!-- 登录页面头部 -->
	<div class="logHead">
		<img src="${pageContext.request.contextPath}/img/logLOGO.png" />
	</div>
	<!-- 登录页面头部结束 -->

	<!-- 登录body -->
	<div class="logDiv">
		<img class="logBanner" src="${pageContext.request.contextPath}/img/logBanner.png" />
		<div class="logGet">
			<!-- 头部提示信息 -->
			<div class="logD logDtip">
				<p class="p1">登录</p>
				<p class="p2">内部人员登录</p>
			</div>
			<!-- 输入框 -->
            <form action="/login.do">
			<div class="lgD">
				<img class="img1" src="${pageContext.request.contextPath}/img/logName.png" /><input type="text" id="username"
					placeholder="输入用户名" />
			</div>
			<div class="lgD">
				<img class="img1" src="${pageContext.request.contextPath}/img/logPwd.png" /><input type="text" id="password"
					placeholder="输入用户密码" />
			</div>
			<div class="lgD logD2">
				<input class="getYZM" type="text" />
				<div class="logYZM">
					<img class="yzm" src="${pageContext.request.contextPath}/img/logYZM.png" />
				</div>
			</div>
			<div class="logC">
                    <button>登 录</button>
			</div>
            </form>
		</div>
	</div>
	<!-- 登录body  end -->

	<!-- 登录页面底部 -->
	<div class="logFoot">
		<p class="p1">版权所有：边瑞/黄克卿</p>
		<p class="p2">K歌之王有限公司</p>
	</div>
	<!-- 登录页面底部end -->
</body>
</html>