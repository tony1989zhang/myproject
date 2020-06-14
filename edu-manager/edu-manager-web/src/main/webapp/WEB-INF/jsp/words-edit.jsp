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
	<form id="ffWordsEditForm" method="post">
		<input type="hidden" name="id" />
		<div class="form-item">
			<label for="" class="label-top">姓名：</label> <input
				class="easyui-textbox" type="text" name="username" disabled="disabled"
				data-options="required:true,prompt:'请输入姓名'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">个人邮箱：</label> <input disabled="disabled"
				class="easyui-textbox" type="text" name="email"
				data-options="required:true,prompt:'请输入个人邮箱'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">邮件状态：</label> <select id="status" disabled="disabled"
				class="easyui-combobox"
				data-options="editable:false,panelHeight:null" style="width: 280px;"
				name="status">
				<option value="0">未发送</option>
				<option value="1">发送成功</option>
				<option value="2">发送失败</option>
			</select>
		</div>
		
		<div class="form-item">
			<label for="" class="label-top">留言内容：</label>
			<textarea style="width: 800px; height: 300px; visibility: yes;" disabled="disabled"
				name="words"></textarea>
		</div>

		<div class="form-item">
			<label for="" class="label-top">回复内容：</label>
			<textarea style="width: 800px; height: 300px; visibility: yes;" 
				name="replycontent"></textarea>
		</div>
		
		<div class="form-item">
			<a href="javascript:void(0)" class="easyui-linkbutton warning"
				onclick="clearForm()">取消</a> <a href="javascript:void(0)"
				class="easyui-linkbutton success" onclick="submitForm()">提交</a>
		</div>
	</form>
</div>
<script type="text/javascript">

	//提交表单
	function submitForm() {
		//有效性验证
		if (!$('#ffWordsEditForm').form('validate')) {
			$.messager.alert('提示', '表单还未填写完成!');
			return;
		}
		//取价格，单位为“分”
		//$("#ffWordsEditForm [name=price]").val(eval($("#ffWordsEditForm [name=priceView]").val()) * 100);
		
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
// 		alert($("#ffWordsEditForm").serialize());
		$.post("/words/save", $("#ffWordsEditForm").serialize(),
				function(data) {
					if (data.status == 200) {
						$("#dgWords").datagrid("reload");
						$.messager.alert('操作成功', '恭喜您修改产品成功', 'warning',
								function() {
									$("#wordsEditWindow").window('close');
									$('.words-list').click();
								});
					}
				});
	}

	function clearForm() {
		$('#ffWordsEditForm').form('reset');
	}
</script>
