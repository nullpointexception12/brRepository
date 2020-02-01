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
			<div class="lgD">
				<img class="img1" src="${pageContext.request.contextPath}/img/logName.png" /><input type="text" id="username"
					placeholder="输入用户名" name="username"/>
			</div>
			<div class="lgD">
				<img class="img1" src="${pageContext.request.contextPath}/img/logPwd.png" /><input type="password" id="password"
					placeholder="输入用户密码" name="password"/>
			</div>
			<div class="lgD logD2">
				<input id="verifyCodeInput" class="getYZM" name="verifyCode" type="text" placeholder="输入验证码"/>
				<div class="logYZM">
					<img id="verifyCode" name="verifyCode" class="verifyCode" src="${pageContext.request.contextPath}/getVerifyCode.do" onclick="changeCode()" title="重新获取" style="cursor:pointer;"/>
				</div>
			</div>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="errorMsg" style="color: red;"></span>
			<div class="logC">
                    <button id="loginBtn" onclick="login()">登 录</button>
			</div>
		</div>
	</div>
	<!-- 登录body  end -->

	<!-- 登录页面底部 -->
	<div class="logFoot">
		<p class="p1">版权所有：边瑞/黄克卿</p>
		<p class="p2">K歌之王有限公司</p>
	</div>
	<!-- 登录页面底部end -->

	<script type="text/javascript">
        function changeCode(){
            var src = "${pageContext.request.contextPath}/getVerifyCode.do?"+new Date().getTime(); //加时间戳，防止浏览器利用缓存
            $("#verifyCode").attr("src",src);                  //jQuery写法
        }

        function login() {
            $("#errorMsg").val("");
            if($("#username").val() == "" || $("#password").val() == ""){
                $("#errorMsg").text("用户名和密码不能为空！");
			}else if($("#verifyCodeInput").val() == ""){
                $("#errorMsg").text("验证码不能为空！");
			}else {
                $.ajax({
                    url : "${pageContext.request.contextPath}/login.do?"+new Date().getTime(),
                    data : {
                        username : $("#username").val(),
                        password : $("#password").val(),
                        verifyCode : $("#verifyCodeInput").val()
                    },
                    type : "post",
                    dataType : "json",
                    success : function (result) {
                        if(result.code != 200){
                            $("#errorMsg").text(result.msg);
                        }else {
                            window.location.href = "${pageContext.request.contextPath}/jsp/index.jsp"
                        }
                    },
                    error : function () {
                        $("#errorMsg").text("连接超时");
                    }
                });
			}
        }
	</script>
</body>
</html>