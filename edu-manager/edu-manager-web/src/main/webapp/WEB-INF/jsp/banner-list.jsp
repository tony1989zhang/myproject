<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="super-theme-example">
	<div style="height:425px;">
		<table id="dg"></table>
		<div id="bannerEditWindow" class="easyui-window" title="编辑广告"
			data-options="modal:true,closed:true,iconCls:'icon-save',href:'/banner-edit'"
			style="width: 80%; height: 80%; padding: 10px;"></div>
	</div>
	<br />
	<br />
</div>
<script type="text/javascript">
	function getSelectionsIds() {
		var dgList = $("#dg");
		var sels = dgList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].id);
		}
		ids = ids.join(",");
		return ids;
	}

	$('#dg').datagrid({
		url : 'banner/list',
		fit : true,
		pagination : true,
		fitColumns : true,
		toolbar : [ {
			text : '添加',
			iconCls : 'fa fa-plus',
			handler : function() {
				$(".add_banner").click();
			}
		}, {
			text : '编辑',
			iconCls : 'fa fa-edit',
			handler : function() {
				var ids = getSelectionsIds();
				if (ids.length == 0) {
					$.messager.alert('提示', '必须选择一个广告才能编辑!');
					return;
				}
				if (ids.indexOf(',') > 0) {
					$.messager.alert('提示', '只能选择一个广告!');
					return;
				}

				$("#bannerEditWindow").window({
	        		onLoad :function(){
	        			//回显数据
	        			 var data = $("#dg").datagrid("getSelections")[0];
	        			$("#ffBannerEditForm").form("load",data); 
	        			// 实现图片
	    				if(data.bannerurl){
	    					$("#ffBannerEditForm [name=bannerurl]").after("<a href='"+data.bannerurl+"' target='_blank'><img src='"+data.bannerurl+"' width='80' height='50'/></a>");	
	    				}
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
	                	$.post("/banner/delete",params, function(data){
	            			if(data.status == 200){
	            				$.messager.alert('提示','删除广告成功!',undefined,function(){
	            					$("#dg").datagrid("reload");
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
			field : 'bannername',
			title : '名称',
			width : 200,
			sortable : true,
			align : 'center'
		}, {
			field : 'bannerurl',
			title : '图片Url',
			width : 100,
			height : 100,
			formatter : _showPic,
			align : 'center'
		}, {
			field : 'targeturl',
			title : '广告链接',
			width : 100,
			height : 100,
			align : 'center'
		}, {
			field : 'sort',
			title : '广告类别',
			width : 100,
			align : 'center',
			formatter:ZCN.formatSort
		}, {
			field : 'createtime',
			title : '创建时间',
			width : 100,
			align : 'center',
			formatter : TT.formatDateTime
		} ] ]
	});
	function _showPic(value, row, index) {
		if (value) {
			return "<img src='" + value +"'style='width:100px;height:40px'>"
		}
	}
</script>