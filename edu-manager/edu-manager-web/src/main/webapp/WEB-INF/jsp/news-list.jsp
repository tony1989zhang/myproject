<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="super-theme-example">
	<div style="height:425px;">
		<table id="dgNews"></table>
		<div id="newsEditWindow" class="easyui-window" title="编辑新闻"
			data-options="modal:true,closed:true,iconCls:'icon-save',href:'/news-edit'"
			style="width: 80%; height: 80%; padding: 10px;"></div>
	</div>
	<br />
	<br />
</div>

<script type="text/javascript">
	function getSelectionsIds() {
		var dgList = $("#dgNews");
		var sels = dgList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].id);
		}
		ids = ids.join(",");
		return ids;
	}

	$('#dgNews').datagrid({
		url : 'news/list',
		fit : true,
		pagination : true,
		fitColumns : true,
		toolbar : [ {
			text : '添加',
			iconCls : 'fa fa-plus',
			handler : function() {
				$(".news-add").click();
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

				$("#newsEditWindow").window({
	        		onLoad :function(){
	        			//回显数据
	        			 var data = $("#dgNews").datagrid("getSelections")[0];
	        			$("#ffNewsEditForm").form("load",data); 
	        			ffNewsEditFormEditDesc.html(data.newscontent);
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
	                	$.post("/news/delete",params, function(data){
	            			if(data.status == 200){
	            				$.messager.alert('提示','删除产品成功!',undefined,function(){
	            					$("#dgNews").datagrid("reload");
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
			field : 'newstitle',
			title : '新闻或文章标题',
			width : 200,
			sortable : true,
			align : 'left'
		}, {
			field : 'author',
			title : '作者',
			width : 50,
			sortable : true,
			align : 'center'
		}, /* {
			field : 'navid',
			title : 'navid',
			width : 200,
			sortable : true,
			align : 'center'
		}, {
			field : 'bannerid',
			title : 'bannerid',
			width : 200,
			sortable : true,
			align : 'center'
		}, {
			field : 'newscontent',
			title : '内容',
			width : 200,
			sortable : true,
			align : 'center'
		},*/{
			field : 'createtime',
			title : '创建时间',
			width : 200,
			sortable : true,
			align : 'center',
			formatter : TT.formatDateTime
		}
	/* 	, {
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