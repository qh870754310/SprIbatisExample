<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../baselist.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
	<script type="text/javascript" src="${ctx}/components/jquery-ui/jquery-1.2.6.js"></script>
</head>
 
<body id="left_frame">
<div class="PositionFrame_black" id="PositionFrame"></div>
 
 
<!-- begin1  -->
<div id="sidebar" class="sidebar">
	<div class="sidebar_t">
		<div class="sidebar_t_l"></div>
		<div class="sidebar_t_c"></div>
		<div class="sidebar_t_r"></div>
	</div>
    <div class="panel">
        <div class="panel_icon"><img src="${ctx}/skin/default/images/icon/document_into.png"/></div>
        <div class="panel-header">
        	<div class="panel-title">货运管理</div>
        	<div class="panel-content">
				<ul>
					<li><a href="${ctx}/cargo/contract/list.action" onclick="linkHighlighted(this)" target="main" id="aa_1">购销合同</a></li>
					<li><a href="${ctx}/cargo/outproduct/toedit.action" onclick="linkHighlighted(this)" target="main" id="aa_1">出货表</a></li>
					<li><a href="${ctx}/cargo/export/list.action" onclick="linkHighlighted(this)" target="main" id="aa_1">出口报运</a></li>
				</ul>
        	</div>
        </div>
    </div>
    <div class="sidebar_t">
		<div class="sidebar_b_l"></div>
		<div class="sidebar_t_c"></div>
		<div class="sidebar_b_r"></div>
	</div>  
</div>	
</body>
</html>
