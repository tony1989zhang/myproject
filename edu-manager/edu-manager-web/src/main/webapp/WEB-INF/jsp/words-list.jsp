<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="super-theme-example">
	<div style="height:425px;">
		<table id="dgWords"></table>
		<div id="wordsEditWindow" class="easyui-window" title="编辑留言"
			data-options="modal:true,closed:true,iconCls:'icon-save',href:'/words-edit'"
			style="width: 80%; height: 80%; padding: 10px;"></div>
	</div>
	<br />
	<br />
</div>

<script type="text/javascript">
	function getSelectionsIds() {
		var dgList = $("#dgWords");
		var sels = dgList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].id);
		}
		ids = ids.join(",");
		return ids;
	}

	$('#dgWords').datagrid({
		url : 'words/list',
		fit : true,
		pagination : true,
		fitColumns : true,
		toolbar : [ 
			/* {
			text : '添加',
			iconCls : 'fa fa-plus',
			handler : function() {
				$(".words-add").click();
			}
		},  */
			{
			text : '回复',
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

				$("#wordsEditWindow").window({
	        		onLoad :function(){
	        			//回显数据
	        			 var data = $("#dgWords").datagrid("getSelections")[0];
	        			$("#ffWordsEditForm").form("load",data); 
	        			//ffWordsEditFormEditWords.html(data.words);
	        			//ffWordsEditFormEditReplyContent.html(data.replycontent);
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
	                	$.post("/words/delete",params, function(data){
	            			if(data.status == 200){
	            				$.messager.alert('提示','删除产品成功!',undefined,function(){
	            					$("#dgWords").datagrid("reload");
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
			field : 'username',
			title : '姓名',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'email',
			title : '个人邮箱',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'words',
			title : '留言内容',
			width : 200,
			sortable : true,
			align : 'center'
		},{
			field : 'replycontent',
			title : '回复内容',
			width : 200,
			sortable : true,
			align : 'center'
		},
		{
			field : 'createtime',
			title : '创建时间',
			width : 200,
			sortable : true,
			align : 'center',
			formatter : TT.formatDateTime
		},{
			field : 'status',
			title : '标识状态',
			width : 200,
			sortable : true,
			align : 'center'
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