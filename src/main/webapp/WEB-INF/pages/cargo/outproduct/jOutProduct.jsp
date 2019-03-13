<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>打印出货表</title>
<script language="javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>
</head>
<body>
	<form method="post">
		<div id="menubar">
			<div id="middleMenubar'">
				<div id="innerMenubar">
					<div id="navMenubar">
						<ul>
							<li id="save"><a href="#" onclick="formSubmit('print.action', '_self');">打印</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">
						出货表月统计
					</div>
				</div>
			</div>
			
			<div>
				<div>
					<table class="commonTable" cellspacing="1">
						<tr>
							<td class="columnTitle_mustbe">船期：</td>
							<td class="tableContent">
								<input type="text" style="width: 90px;" name="inputDate" readonly="readonly" class="Wdate"
								onclick="WdatePicker({el:this, isShowOthers:true, dateFmt:'yyyy-MM'});"/>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>