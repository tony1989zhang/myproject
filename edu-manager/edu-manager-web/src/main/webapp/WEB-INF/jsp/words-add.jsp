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
	<form id="ffNavboardAdd" method="post">
		<div class="form-item">
			<label for="" class="label-top">导航板块名称：</label> <input
				class="easyui-textbox" type="text" name="boardname"
				data-options="required:true,prompt:'请输入导航板块名称'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">排序码：</label> <input
				class="easyui-textbox" type="text" name="sort"
				data-options="required:true,prompt:'请输入排序码'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">是否启用：</label> <select id="isenable"
				class="easyui-combobox"
				data-options="editable:false,panelHeight:null" style="width: 280px;"
				name="isenable">
				<option value="1">是</option>
				<option value="0">否</option>
			</select>
		</div>
		
		<div class="form-item">
			<label for="" class="label-top">导航板块描述内容：</label>
			<textarea style="width: 800px; height: 300px; visibility: hidden;"
				name="boarddesc"></textarea>
		</div>


		<div class="form-item">
			<a href="javascript:void(0)" class="easyui-linkbutton warning"
				onclick="clearForm()">取消</a> <a href="javascript:void(0)"
				class="easyui-linkbutton success" onclick="submitForm()">提交</a>
		</div>
	</form>
</div>
<script type="text/javascript">
	var ffNavboardAddEditDesc;
	$(function() {
		ffNavboardAddEditDesc = ZCN.createEditor("#ffNavboardAdd [name=boarddesc]");
	});
	
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#ffNavboardAdd').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//取价格，单位为“分”
		//$("#ffNavboardAdd [name=price]").val(eval($("#ffNavboardAdd [name=priceView]").val()) * 100);
		//同步文本框中的商品描述
		ffNavboardAddEditDesc.sync();

		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
// 		alert($("#ffNavboardAdd").serialize());
		$.post("/words/save",$("#ffNavboardAdd").serialize(), function(data){
			if(data.status == 200){
				$("#dgNavboard").datagrid("reload");
				$.messager.alert('操作成功', '恭喜您添加产品成功', 'warning', function() {
					$('.words-list').click();
				});
			}
		});
	}
	
	function clearForm(){
		$('#ffNavboardAdd').form('reset');
		itemAddEditor.html('');
	}
</script>
