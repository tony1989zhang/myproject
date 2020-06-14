<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8"
	src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<style type="text/css">
.form-item {
	margin-bottom: 15px;
	width: 100%;
	float: left;
}

.form-item>label {
	min-width: 72px;
	display: inline-block;
}

.form-item input, select {
	width: 170px;
}
</style>
<div class="super-theme-example">
	<form id="ffBannerEditForm" method="post">
		<input type="hidden" name="id" />
		<div class="form-item">
			<label for="" class="label-top">广告标题：</label> 
		<!-- 	<input
				class="easyui-textbox" name="bannername"
				data-options="iconCls:'fa fa-edit',iconAlign:'left'" prompt="请输入标题"> -->
				<input class="easyui-textbox" type="text" name="bannername" data-options="required:true" style="width: 280px;"></input>
		</div>

		<div class="form-item">
			<label for="" class="label-top">广告类别：</label> <select id="ec"
				class="easyui-combobox"
				data-options="editable:false,panelHeight:null" style="width: 280px;" name="sort">
				<option value="1">文章广告</option>
				<option value="0">产品广告</option>
			</select>
		</div>
		<div class="form-item">
			<label for="" class="label-top">广告上传：</label>
			<!-- 	 <input class="easyui-filebox" data-options="buttonText:'上传照片',buttonIcon:'fa fa-upload'"> -->
		<!-- 	<a href="javascript:void(0)" class="easyui-linkbutton picFileUpload">上传图片</a>
			<input type="hidden" name="bannerurl" /> -->
				<input type="hidden" name="bannerurl" />
	                <a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
		</div>
			<div class="form-item">
			<label for="" class="label-top">广告链接：</label>
			<!-- 	<input
				class="easyui-textbox" name="bannername"
				data-options="iconCls:'fa fa-edit',iconAlign:'left'" prompt="请输入标题"> -->
			<input class="easyui-textbox" type="text" name="targeturl"
				data-options="required:false" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<a href="javascript:void(0)" class="easyui-linkbutton warning"
				onclick="clearForm()">取消</a> <a href="javascript:void(0)"
				class="easyui-linkbutton success" onclick="submitForm()">提交</a>
		</div>
	</form>
</div>
<script>
	//# sourceURL=exportquestionnaire.js
	//页面初始化完毕后执行此方法
	/* $(function() {
		//初始化图片上传器
		ZCN.init({
			fun : function(node) {
			}
		});
	}); */
	//页面初始化完毕后执行此方法
	$(function() {
		//初始化图片上传器
		ZCN.initOnePicUpload();
	});

	function submitForm() {
		console.log("submitForm...");
		//有效性验证
		var isValidate = $('#ffBannerEditForm').form('validate');
		if(!isValidate){
			$.messager.alert('警告', '没有填写完全', 'warning');
			return ;
		}
		

		$.post("/banner/save",$("#ffBannerEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改广告成功!','info',function(){
					$("#bannerEditWindow").window('close');
					$("#dg").datagrid("reload");
				});
			}
		});
	}
	
	function clearForm(){
		$('#ffBannerEditForm').form('reset');
	}
</script>
