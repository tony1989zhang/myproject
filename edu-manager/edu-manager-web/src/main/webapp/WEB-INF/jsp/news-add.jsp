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
	<form id="ffNewsAdd" method="post">
		<div class="form-item">
			<label for="" class="label-top">标   题：</label> <input
				class="easyui-textbox" type="text" name="newstitle"
				data-options="required:true,prompt:'请输入新闻标题'" style="width: 280px;"></input>
		</div>

		<div class="form-item">
			<label for="" class="label-top">所属导航：</label> <input id="cc"
				class="easyui-combobox" name="navid" style="width: 280px;"
				data-options="valueField:'id',textField:'boardname',url:'dumps/getNavdata'">
		</div>
		
		<div class="form-item">
			<label for="" class="label-top">所属广告：</label> <input id="cc"
				class="easyui-combobox" name="bannerid" style="width: 280px;"
				data-options="valueField:'id',textField:'bannername',url:'banner/getBannerdata'">
		</div>		
		
		<div class="form-item">
			<label for="" class="label-top">作  者：</label> <input
				class="easyui-textbox" type="text" name="author"
				data-options="required:true,prompt:'请输入作者'" style="width: 280px;"></input>
		</div>
		
		<div class="form-item">
			<label for="" class="label-top">内容：</label>
			<textarea style="width: 800px; height: 300px; visibility: hidden;"
				name="newscontent"></textarea>
		</div>


		<div class="form-item">
			<a href="javascript:void(0)" class="easyui-linkbutton warning"
				onclick="clearForm()">取消</a> <a href="javascript:void(0)"
				class="easyui-linkbutton success" onclick="submitForm()">提交</a>
		</div>
	</form>
</div>
<script type="text/javascript">
	var ffNewsAddEditDesc;
	$(function() {
		ffNewsAddEditDesc = ZCN.createEditor("#ffNewsAdd [name=newscontent]");
	});
	
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#ffNewsAdd').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//取价格，单位为“分”
		//$("#ffNewsAdd [name=price]").val(eval($("#ffNewsAdd [name=priceView]").val()) * 100);
		//同步文本框中的商品描述
		ffNewsAddEditDesc.sync();

		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
// 		alert($("#ffNewsAdd").serialize());
		$.post("/news/save",$("#ffNewsAdd").serialize(), function(data){
			if(data.status == 200){
				$("#dgNews").datagrid("reload");
				$.messager.alert('操作成功', '恭喜您添加产品成功', 'warning', function() {
					$('.news-list').click();
				});
			}
		});
	}
	
	function clearForm(){
		$('#ffNewsAdd').form('reset');
		itemAddEditor.html('');
	}
</script>
