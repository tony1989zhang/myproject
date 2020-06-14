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
<div style="padding: 10px 10px 10px 10px">
	<form id="companyEditForm" class="itemForm" method="post">
		<input type="hidden" name="id" />
		<div class="form-item">
			<label for="" class="label-top">公司名称:</label> <input
				class="easyui-textbox" type="text" name="companyname"
				data-options="required:true" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">公司简介:</label> <input
				class="easyui-textbox" data-options="multiline:true"
				name="companydesc" style="width: 500px; height: 100px">
		</div>
		<div class="form-item">
			<label for="" class="label-top">公司优势:</label> <input
				class="easyui-textbox" data-options="multiline:true"
				name="superiority" style="width: 500px; height: 100px">
		</div>
		<div class="form-item">
			<label for="" class="label-top">公司特色:</label> <input
				class="easyui-textbox" data-options="multiline:true" name="feature"
				style="width: 500px; height: 100px">
		</div>
		<div class="form-item">
			<label for="" class="label-top">公司电话:</label> <input
				class="easyui-textbox" type="tel" name="telephone"
				data-options="required:true" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">公司邮箱:</label> <input
				class="easyui-textbox" type="email" name="email"
				data-options="required:true" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">公司logo:</label> <input type="hidden"
				name="logourl" /> <a href="javascript:void(0)"
				class="easyui-linkbutton onePicUpload">图片上传</a>
		</div>

		<div style="padding: 5px">
			<a href="javascript:void(0)" class="easyui-linkbutton success"
				onclick="submitForm()">保存修改</a>
		</div>
	</form>
</div>
<script>
	$(function() {
		$
				.get(
						"getCompany",
						function(data) {
							console.log("data:" + data);
							$('#companyEditForm').form('load', data);
							if (data.logourl) {
								$("#companyEditForm [name=logourl]")
										.after(
												"<a href='"+data.logourl+"' target='_blank'><img src='"+data.logourl+"' width='80' height='50'/></a>");
							}
							ZCN.initOnePicUpload();
						});
	});

	function submitForm() {
		//有效性验证
		var isValidate = $('#companyEditForm').form('validate');
		if (!isValidate) {
			$.messager.alert('警告', '没有填写完全', 'warning');
			return;
		}

		$.post("editComPany", $("#companyEditForm").serialize(),
				function(data) {
					if (data.status == 200) {
						$.messager.alert('提示', '修改公司成功!', 'info');
					}
				});
	}

	function clearForm() {
		$('#companyEditForm').form('reset');
	}
</script>