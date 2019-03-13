<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改厂家信息</title>
</head>
<body>
	<form method="post">
		<input type="hidden" name="id" value="${factory.id}" />
		<div id="menubar">
			<dir id="middleMenubar">
				<div id="innerMenubar">
					<di id="navMenubar">
						<ul>
							<li id="save"><a href="#" onclick="formSubmit('update.action', '_self');">确定</a></li>
							<li id="back"><a href="list.action">返回</a></li>
						</ul>
					</di>
				</div>
			</dir>
		</div>
		
		<div id="centerTextbox" class="textbox">
			<div class="textbox-header">
				<div class="textbar-inner-header">
					<div class="textbox-title">
						删除生产厂家信息
					</div>
				</div>
			</div>
		</div>
		
		<div>
			<table class="commonTable" cellspacing="1">
				<tr>
					<td class="columnTitle_mustbe">厂家名称：</td>
					<td calss="tableContent"><input type="text" name="fullName" value="${factory.fullName }" /></td>
					<td calss="columnTitle_mustbe">简称：</td>
					<td class="tableContent"><input type="text" name="factoryName" value="${factory.factoryName }" /></td>
				</tr>
				
				<tr>
					<td class="columnTitle_mustbe">联系人：</td>
					<td class="tableContent"><input type="text" name="contacts" value="${factory.contacts }"/></td>
					<td class="columnTitle_mustbe">电话：</td>
					<td class="tableContent"><input type="text" name="phone" value="${factory.phone }" /></td>
				</tr>
				
				<tr>
					<td class="columnTitle_mustbe">手机：</td>
					<td class="tableContent"><input type="text" name="mobile" value="${factory.mobile }" /></td>	
					<td class="columnTitle_mustbe">传真：</td>
					<td class="tableContent"><input type="text" name="fax" value="${factory.fax }" /></td>
				</tr>
				
				<tr>
					<td class="columnTitle_mustbe">检验员：</td>
					<td class="tableContent"><input type="text" name="inspector" value="${factory.inspector }" /></td>
					<td class="columnTitle_mustbe">排序号：</td>
					<td class="tableContent"><input type="text" name="orderNo" value="${factory.orderNo }" /></td>
				</tr>
				
				<tr>
					<td class="columnTitle_mustbe">备注：</td>
					<td class="tableContent"><textarea name="cnote" style="height: 200px; width: 400px;">${factory.cnote }</textarea></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
