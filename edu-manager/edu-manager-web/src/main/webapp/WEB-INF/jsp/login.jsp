<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="easyui/jquery.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="easyui/jquery.easyui.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"
	charset="utf-8"></script>
<!--默认样式-->
<!-- <link rel="stylesheet" href="easyui/themes/gray/easyui.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/superBlue.css" id="themeCss">
<script src="js/super.js" type="text/javascript" charset="utf-8"></script> -->
<!--其他样式-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/super/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="easyui/themes/super/superRed.css" id="themeCss" />

<script type="text/javascript" charset="utf-8"
	src="easyui/themes/super/super.js"></script>
<script src="js/superDemo.js" type="text/javascript" charset="utf-8"></script>

<!-- 暂时不用 -->
<!-- <link rel="stylesheet" type="text/css" href="css/taotao.css" /> -->
<script type="text/javascript" src="js/common.js"></script>
<title>管理员登录</title>
</head>
<body style="background-color: #F3F3F3">
    <div class="easyui-dialog" title="管理员登录" data-options="closable:false,draggable:false" style="width:400px;height:300px;padding:10px;">
       	<div style="margin-left: 50px;margin-top: 50px;">
       		<div style="margin-bottom:20px;">
	            <div>
	            	用户名: <input name="username" class="easyui-textbox" data-options="required:true" style="width:200px;height:32px" value="admin"/>
	            </div>
	        </div>
	        <div style="margin-bottom:20px">
	            <div>
	            	密&nbsp;&nbsp;码: <input name="password" class="easyui-textbox" type="password" style="width:200px;height:32px" data-options="" value="admin"/>
	            </div>
	        </div>
	        <div>
	            <a id="login" class="easyui-linkbutton" iconCls="icon-ok" style="width:100px;height:32px;margin-left: 50px">登录</a>
	        </div>
       	</div>
    </div>
    
    <script type="text/javascript">
    $("#login").click(function(){
		var username = $("[name=username]").val();
		var password = $("[name=password]").val();
		
		$.post("/doLogin",{username:username,password:password},function(result){
			if(result.status==200){
				window.location.href="/index";
			}else{
				console.log("测试:"+result);
				$.messager.alert("提示",result.msg);
			}
		})
	
	});
    </script>
</body>
</html>