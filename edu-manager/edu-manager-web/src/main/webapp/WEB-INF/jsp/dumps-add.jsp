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
	<form id="ffDumpsAdd" method="post">
		<div class="form-item">
			<label for="" class="label-top">产品名称：</label> <input
				class="easyui-textbox" type="text" name="dumpname"
				data-options="required:true,prompt:'请输入产品名称'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">产品简称：</label> <input
				class="easyui-textbox" type="text" name="shortname"
				data-options="required:true,prompt:'请输入产品简称'" style="width: 280px;"></input>
		</div>
			<div class="form-item">
			<label for="" class="label-top">产品介绍：</label> <input
				class="easyui-textbox" type="text" name="dumpbrief"
				data-options="required:true,prompt:'请输入产品简单介绍'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">认证等级：</label> <input
				class="easyui-textbox" type="text" name="authlevel"
				data-options="required:true,prompt:'请输入认证等级'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">证书提供：</label> <input
				class="easyui-textbox" type="text" name="certificationprovider"
				data-options="required:true,prompt:'请输入证书提供人'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">考试名称：</label> <input
				class="easyui-textbox" type="text" name="examname"
				data-options="required:true,prompt:'请输入考试名称'" style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">考试代码：</label> <input
				class="easyui-textbox" type="text" name="examcode"
				data-options="required:true,prompt:'请输入考试代码'" style="width: 280px;"></input>
		</div>

		<div class="form-item">
			<label for="" class="label-top">金包原价：</label> <input
				class="easyui-numberbox" type="text" name="goldpackageoriginalprice"
				data-options="min:1,max:99999999,precision:2,required:true,prompt:'请输入金包原价'"
				style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">金包当价：</label> <input
				class="easyui-numberbox" type="text" name="goldpackagepresentprice"
				data-options="min:1,max:99999999,precision:2,required:true,prompt:'请输入金包当价'"
				style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">银包原价：</label> <input
				class="easyui-numberbox" type="text"
				name="silverpackageoriginalprice"
				data-options="min:1,max:99999999,precision:2,required:true,prompt:'请输入银包原价'"
				style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">银包当价：</label> <input
				class="easyui-numberbox" type="text"
				name="silverpackagepresentprice"
				data-options="min:1,max:99999999,precision:2,required:true,prompt:'请输入银包当价'"
				style="width: 280px;"></input>
		</div>
		<div class="form-item">
			<label for="" class="label-top">是否热门：</label> <select id="ishot"
				class="easyui-combobox"
				data-options="editable:false,panelHeight:null" style="width: 280px;"
				name="sort">
				<option value="1">是</option>
				<option value="0">否</option>
			</select>
		</div>
		<div class="form-item">
			<label for="" class="label-top">所属广告：</label> <input id="cc"
				class="easyui-combobox" name="bannerid" style="width: 280px;"
				data-options="valueField:'id',textField:'bannername',url:'banner/getBannerdata'">
		</div>
		<div class="form-item">
			<label for="" class="label-top">所属导航：</label> <input id="cc"
				class="easyui-combobox" name="navid" style="width: 280px;"
				data-options="valueField:'id',textField:'boardname',url:'dumps/getNavdata'">
		</div>
		<div class="form-item">
			<label for="" class="label-top">产品描述：</label>
			<textarea style="width: 800px; height: 300px; visibility: hidden;"
				name="dumpdesc"></textarea>
		</div>

		<div class="form-item">
			<label for="" class="label-top">产品优势：</label>
			<textarea style="width: 800px; height: 300px; visibility: hidden;"
				name="superiority"></textarea>
		</div>
		<div class="form-item">
			<label for="" class="label-top">常见问题：</label>
			<textarea style="width: 800px; height: 300px; visibility: hidden;"
				name="faqs"></textarea>
		</div>


		<div class="form-item">
			<a href="javascript:void(0)" class="easyui-linkbutton warning"
				onclick="clearForm()">取消</a> <a href="javascript:void(0)"
				class="easyui-linkbutton success" onclick="submitForm()">提交</a>
		</div>
	</form>
</div>
<script type="text/javascript">
	var ffDumpsAddEditDesc;
	var ffDumpsAddEditSuperiority;
	var ffDumpsAddEditFaqs;
	$(function() {
		ffDumpsAddEditDesc = ZCN.createEditor("#ffDumpsAdd [name=dumpdesc]");
		ffDumpsAddEditSuperiority = ZCN
				.createEditor("#ffDumpsAdd [name=superiority]");
		ffDumpsAddEditFaqs = ZCN.createEditor("#ffDumpsAdd [name=faqs]");
	});
	
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#ffDumpsAdd').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//取价格，单位为“分”
		//$("#ffDumpsAdd [name=price]").val(eval($("#ffDumpsAdd [name=priceView]").val()) * 100);
		//同步文本框中的商品描述
		ffDumpsAddEditDesc.sync();
		ffDumpsAddEditSuperiority.sync();
		ffDumpsAddEditFaqs.sync();
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		alert($("#ffDumpsAdd").serialize());
		$.post("/dumps/save",$("#ffDumpsAdd").serialize(), function(data){
			if(data.status == 200){
				$("#dgDumps").datagrid("reload");
				$.messager.alert('操作成功', '恭喜您添加产品成功', 'warning', function() {
					$('.dumps-list').click();
				});
			}
		});
	}
	
	function clearForm(){
		$('#ffDumpsAdd').form('reset');
		itemAddEditor.html('');
	}
</script>
