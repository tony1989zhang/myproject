<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="super-theme-example">
	<div style="height:425px;">
		<table id="dgDumps"></table>
		<div id="dumpsEditWindow" class="easyui-window" title="编辑产品"
			data-options="modal:true,closed:true,iconCls:'icon-save',href:'/dumps-edit'"
			style="width: 80%; height: 80%; padding: 10px;"></div>
	</div>
	<br />
	<br />
</div>

<script type="text/javascript">
	function getSelectionsIds() {
		var dgList = $("#dgDumps");
		var sels = dgList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].id);
		}
		ids = ids.join(",");
		return ids;
	}

	$('#dgDumps').datagrid({
		url : 'dumps/list',
		fit : true,
		pagination : true,
		fitColumns : true,
		toolbar : [ {
			text : '添加',
			iconCls : 'fa fa-plus',
			handler : function() {
				$(".dumps-add").click();
			}
		}, {
			text : '编辑',
			iconCls : 'fa fa-edit',
			handler : function() {
				var ids = getSelectionsIds();
				if (ids.length == 0) {
					$.messager.alert('提示', '必须选择一个产品才能编辑!');
					return;
				}
				if (ids.indexOf(',') > 0) {
					$.messager.alert('提示', '只能选择一个产品!');
					return;
				}

				$("#dumpsEditWindow").window({
	        		onLoad :function(){
	        			//回显数据
	        			 var data = $("#dgDumps").datagrid("getSelections")[0];
	        			$("#ffDumpsEditForm").form("load",data); 
	        			ffDumpsEditFormEditDesc.html(data.dumpdesc);
	        			ffDumpsEditFormEditSuperiority.html(data.superiority);
	        			ffDumpsEditFormEditFaqs.html(data.faqs);
	        		}}).window("open");
				///
			}
		}, {
			text : '删除',
			iconCls : 'fa fa-remove',
			handler : function() {
			 	var ids = getSelectionsIds();
	        	if(ids.length == 0){
	        		$.messager.alert('提示','未选中广告!');
	        		return ;
	        	}
	        	$.messager.confirm('确认','确定删除ID为 '+ids+' 的广告吗？',function(r){
	        	    if (r){
	        	    	var params = {"ids":ids};
	                	$.post("/dumps/delete",params, function(data){
	            			if(data.status == 200){
	            				$.messager.alert('提示','删除产品成功!',undefined,function(){
	            					$("#dgDumps").datagrid("reload");
	            				});
	            			}
	            		});
	        	    }
	        	});
			}
		} ],

		height : 400,
		columns : [ [ {
			field : 'id',
			title : 'id号',
			width : 100,
			sortable : true,
			align : 'center'
		}, {
			field : 'dumpname',
			title : '产品名全称',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'shortname',
			title : '产品简称',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'authlevel',
			title : '认证等级',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'certificationprovider',
			title : '证书提供者',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'examname',
			title : '考试名称',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'examcode',
			title : '考试代码',
			width : 200,
			sortable : true,
			align : 'center'
		}
		/* , {
			field : 'goldpackageoriginalprice',
			title : '金包原价',
			width : 100,
			align : 'center',
			formatter:ZCN.formatPrice
		}, {
			field : 'goldpackagepresentprice',
			title : '金包当价',
			width : 100,
			align : 'center',
			formatter:ZCN.formatPrice
		}, {
			field : 'silverpackageoriginalprice',
			title : '金包原价',
			width : 100,
			align : 'center',
			formatter:ZCN.formatPrice
		}, {
			field : 'silverpackagepresentprice',
			title : '金包原价',
			width : 100,
			align : 'center',
			formatter:ZCN.formatPrice
		}
		, {
			field : 'bannerid',
			title : '归属banner',
			width : 100,
			align : 'center',
			formatter:ZCN.formatSort
		}, {
			field : 'ishot',
			title : '是否热门',
			width : 100,
			align : 'center',
			formatter:ZCN.formatSort
		}, {
			field : 'createtime',
			title : '创建时间',
			width : 100,
			align : 'center',
			formatter : TT.formatDateTime
		}  */
		] ]
	});
	
</script>