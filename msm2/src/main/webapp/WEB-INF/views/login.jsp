<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="IE=11.0000" http-equiv="X-UA-Compatible"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="GENERATOR" content="MSHTML 11.00.9600.17496"/>
    <title>登录</title>
    <style type="text/css">.error{color:red;}</style>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/statics/images/favicon.ico" />
    <link href="${pageContext.request.contextPath}/statics/css/login.css" rel="stylesheet" />
</head>
<body>
    <div class="top_div"></div>
    <form id="form" action="" method="post">
        <div style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 268px; text-align: center;">
            <div style="width: 165px; height: 96px; position: absolute;">
                <div class="tou"></div>
                <div class="initial_left_hand" id="left_hand"></div>
                <div class="initial_right_hand" id="right_hand"></div>
            </div>
            <p style="padding: 35px 0px 10px; position: relative;">
                <span class="u_logo"></span> 
                <input class="ipt" id="username" type="text" placeholder="请输入用户名" name="username" value="${username}"/>
            </p>
            <p style="padding: 15px 0px 10px; position: relative;">
                <span class="p_logo"></span> 
                <input class="ipt" id="password" type="password" placeholder="请输入密码" name="password"/>
            </p>
            <p style="padding: 10px 0px 10px; position: relative;">
                <input class="validCodeInput" id="validCode" type="text" placeholder="请输入图形验证码" name="validCode" />
               <%-- <img id="validImage" src="${pageContext.request.contextPath}/verificationCode" alt="验证码,看不清楚?请点击刷新验证码"  />--%>
            </p>
            <div style="height: 50px; line-height: 50px; margin-top: 40px; ">
                <p style="text-align: center; line-height:62px;">
                    <a id="login" style="background: rgb(0, 142, 173); padding: 7px 24px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255);font-size:13px; font-weight: bold; " href="#">登录</a> 
                </p>
            </div>
        </div>
    </form>
    <div style="text-align:center;" class="error">
        <p>${error}</p>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery.min.js"></script>
    <!-- 需要独立验证的时候才引用 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/validate/validateUtil.js"></script>
    <!-- 弹框插件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/layer/layer.js"></script>
    <!-- des加密 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/encrypt/md5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/encrypt/tripleDes.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/encrypt/modeEcb.js"></script>
    <script type="text/javascript">
        $(function() {
        	if (window != top){
        		top.location.href = "${pageContext.request.contextPath}/";
        	}

            //得到焦点
            $("#password").focus(function() {
                $("#left_hand").animate({
                    left : "150",
                    top : " -38"
                }, {
                    step : function() {
                        if (parseInt($("#left_hand").css("left")) > 140) {
                            $("#left_hand").attr("class", "left_hand");
                        }
                    }
                }, 2000);
                $("#right_hand").animate({
                    right : "-64",
                    top : "-38px"
                }, {
                    step : function() {
                        if (parseInt($("#right_hand").css("right")) > -70) {
                            $("#right_hand").attr("class", "right_hand");
                        }
                    }
                }, 2000);
            });
            //失去焦点
            $("#password").blur(function() {
                $("#left_hand").attr("class", "initial_left_hand");
                $("#left_hand").attr("style", "left:100px;top:-12px;");
                $("#right_hand").attr("class", "initial_right_hand");
                $("#right_hand").attr("style", "right:-112px;top:-12px");
            });
            
            //初始化登录按钮
            initLoginBtn();
            
            //初始化验证码输入框事件
            initValidcode();
            
            //初始化验证码图片刷新事件
          //  initValidImage();
        });
        
        //初始化登录按钮
        function initLoginBtn() {
        	$("#login").click(function(){
        		var userName = $("#username");
        		if(isNull(userName.val())){
                    layer.msg("请输入用户名");
                    $("#username").focus();
                    return;
                }
        		var password = $("#password");
                if(isNull(password.val())){
                    layer.msg("请输入密码");
                    $("#password").focus();
                    return;
                }
                var validateCode = $('#validCode');
                if (isNull(validateCode.val())) {
                    validateCode.focus();
                    layer.msg("请输入图形验证码");
                    return;
                }
                
                var message = password.val()+validateCode.val();
                var key = userName.val() + "~%a+}_R>eP.X*";
                var ciphertext = encryptByDES(message, key);
                password.val(ciphertext);
                $("#form").submit();
            });
        }
        
        //初始化验证按钮
        function initValidcode() {
            $("#validCode").bind("keyup",function(event){
                if(event.keyCode==13){
                    $("#login").click(); 
                    return;
                }
                if(event.keyCode==9){//tab不做响应
                    return;
                }
                var validateCode = $('#validCode');
                if (isNull(validateCode.val())) {
                	validateCode.focus();
                	layer.msg("请输入图形验证码");
                    return;
                }
                if(validateCode.val().length > 4){
                	validateCode.focus();
                	layer.msg("验证码错误");
                    return false;
                }
                $.ajax({
                    url:  "${pageContext.request.contextPath}/checkVerificationCode?vCode=" + validateCode.val(),
                    type: "POST",
                    dataType: "json",
                    cache: false,
                    success: function (data) {
                        if(data.code == 0){//处理异常
                        	validateCode.focus();
                            layer.msg(data.message);
                            return false;
                        }
                        if (data.code == 4) {//验证码超时
                        	validateCode.focus();
                            layer.msg(data.message);
                            $("#validImage").attr("src", "${pageContext.request.contextPath}/verificationCode?" + Math.random());
                        }
                    }
                });
            });
        }
        
        //初始化验证码图片刷新事件
        function initValidImage(){
            $("#validImage").on("click",function(){
                $(this).attr("src", "${pageContext.request.contextPath}/verificationCode?" + Math.random());
            });
        }
    </script>
</body>
</html>