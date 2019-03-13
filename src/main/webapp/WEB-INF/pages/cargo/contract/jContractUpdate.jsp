<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改购销合同</title>
<script language="javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>
</head>
<body>
<form method="post">
	<div id="menubar">
		<div id="middleMenubar">
			<div id="innerMenubar">
				<div id="navMenubar">
					<ul>
						<li id="save"><a href="#" onclick="formSubmit('insert.action', '_self');">确定</a></li>
						<li id="back"><a href="list.action">返回</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="textbox" id="centerTextbox">
		<div class="textbox-header">
			<div class="textbox-inner-header">
				<div class="textbox-title">
					修改购销合同信息
				</div>
			</div>
		</div>
		
		<div>
			<div>
				<table cellspacing="1" id="commonTable">
					<input type="hidden" name="id" value="${contract.id}"/>
					<tr>
						<td class="columnTitle_mustbe">客户名称：</td>
						<td class="tableContent"><input type="text" name="customName" value="${contract.customName }"></td>
						<td class="columnTitle_mustbe">收购方：</td>
						<td class="tableContent"><input type="text" name="offeror" value="${contract.offeror }"></td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">合同号：</td>
						<td class="tableContent"><input type="text" name="contractNo" value="${contract.contractNo }"></td>
						<td class="columnTitle_mustbe">签单日期：</td>
						<td class="tableContent">
							<input type="text" name="signingDate" value='<fmt:formatDate value="${contract.signingDate }" pattern="yyyy-MM-dd"/>'
							 style="width: 90px;" class="Wdate" onclick="WdatePicker({el:this, isShowOthers:true, dateFmt: 'yyyy-MM-dd'});"/>
						</td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">制单人：</td>
						<td class="tableContent"><input type="text" name="inputBy" value="${contract.inputBy }"></td>
						<td class="columnTitle_mustbe">审单人：</td>
						<td class="tableContent"><input type="text" name="checkBy" value="${contract.checkBy }"></td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">验货员：</td>
						<td class="tableContent"><input type="text" name="inspector" value="${contract.inspector }"></td>
						<td class="columnTitle_mustbe">总金额：</td>
						<td class="tableContent"><input type="text" name="totalAmount" value="${contract.totalAmount }"></td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">要求：</td>
						<td class="tableContent"><input type="text" name="crequest" value="${contract.crequest }"></td>
						<td class="columnTitle_mustbe">交货期限：</td>
						<td class="tableContent">
							<input type="text" name="deliveryPeriod" value='<fmt:formatDate value="${contract.deliveryPeriod }" pattern="yyyy-MM-dd"/>'
							 style="width: 90px;" class="Wdate" onclick="WdatePicker({el:this, isShowOthers:true, dateFmt: 'yyyy-MM-dd'});"/>
						</td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">船期：</td>
						<td class="tableContent">
							<input type="text" name="shipTime" value='<fmt:formatDate value="${contract.shipTime }" pattern="yyyy-MM-dd"/>'
							 style="width: 90px;" class="Wdate" onclick="WdatePicker({el:this, isShowOthers:true, dateFmt: 'yyyy-MM-dd'});"/>
						</td>
						<td class="columnTitle_mustbe">贸易条款：</td>
						<td class="tableContent"><input type="text" name="tradeTerms" value="${contract.tradeTerms }"></td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">打印版式：</td>
						<td class="tableContent">
							<input type="radio" name="printStyle" value="2" <c:if test="${contract.printStyle == '2'}"> checked="checked"</c:if>/>
							两款
							<input type="radio" name="printStyle" value="1" <c:if test="${contract.printStyle == '1'}"> checked="checked"</c:if>/>
							一款f
						</td>
						<td class="columnTitle_mustbe">归档前状态：</td>
						<td class="tableContent"><input type="text" name="oldState" value="${contract.oldState }"></td>
					</tr>
					
					<tr>
						<td class="columnTitle_mustbe">状态：</td>
						<td class="tableContent"><input type="text" name="state" value="${contract.state }"></td>
						<td class="columnTitle_mustbe">走货状态：</td>
						<td class="tableContent"><input type="text" name="outState" value="${contract.outState }"></td>
					</tr>
					
					<tr>  
	                    <td class="columnTitle_mustbe">重要程度：</td>  
	                    <td class="tableContent">  
	                    <input type="radio" name="importNum" value="3" class="input" <c:if test="${contract.importNum==3}"> checked="checked"</c:if>/>★★★  
	                    <input type="radio" name="importNum" value="2" class="input" <c:if test="${contract.importNum==2}"> checked="checked"</c:if>/>★★  
	                    <input type="radio" name="importNum" value="1" class="input" <c:if test="${contract.importNum==1}"> checked="checked"</c:if>/>★  
	                    </td>  
	                </tr>  
                  
	                <tr>  
	                    <td class="columnTitle_mustbe">说明：</td>  
	                    <td class="tableContent"><textarea  name="remark" style="height:200px;width: 400px">${contract.remark}</textarea></td>  
	                </tr> 
				</table>
			</div>
		</div>
	</div>
</form>
</body>
</html>