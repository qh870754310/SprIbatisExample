<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加购销合同</title>
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
    				添加购销合同信息
    			</div>
    		</div>
    	</div>
    	<div>
    		<div>
    			<table cellspacing="1" class="commonTable">
    				<tr>
    					<td class="columnTitle_mustbe">客户名称：</td>
    					<td class="tableContent"><input type="text" name="customName" /></td>
    					<td class="columnTitle_mustbe">收购方：</td>
    					<td class="tableContent"><input type="text" name="offeror" /></td>
    				</tr>
    				
    				<tr>
    					<td class="columnTitle_mustbe">合同号：</td>
    					<td class="tableContent"><input type="text" name="contractNo" /></td>
    					<td class="columnTitle_mustbe">签单日期：</td>
    					<td class="tableContent">
    						<input type="text" name="signingDate" style="width: 90px;" class="Wdate" onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd'});"/>
    					</td>
    				</tr>
    				
    				<tr>  
                    <td class="columnTitle_mustbe">制单人：</td>  
                    <td class="tableContent"><input type="text" name="inputBy" /></td>  
                    <td class="columnTitle_mustbe">审单人：</td>  
                    <td class="tableContent"><input type="text" name="checkBy" /></td>  
                </tr>  
                  
                 <tr>  
                    <td class="columnTitle_mustbe">验货员：</td>  
                    <td class="tableContent"><input type="text" name="inspector" /></td>  
                    <td class="columnTitle_mustbe">检验员：</td>  
                    <td class="tableContent"><input type="text" name="inspector" /></td>  
                </tr>  
                  
                 <tr>  
                    <td class="columnTitle_mustbe">总金额：</td>  
                    <td class="tableContent"><input type="text" name="totalAmount" /></td>  
                    <td class="columnTitle_mustbe">重要程度：</td>  
                    <td class="tableContent">  
                    <input type="radio" name="importNum" value="3" class="input" checked="checked"/>★★★  
                    <input type="radio" name="importNum" value="2" class="input" checked="checked"/>★★  
                    <input type="radio" name="importNum" value="1" class="input" checked="checked"/>★  
                    </td>  
                </tr>  
                  
                 <tr>  
                    <td class="columnTitle_mustbe">要求：</td>  
                    <td class="tableContent"><input type="text" name="crequest" /></td>  
                    <td class="columnTitle_mustbe">交货期限：</td>  
                    <td class="tableContent">  
                     <input type="text" style="width: 90px" name="deliveryPeriod" class="Wdate"  
                     onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd'});"/>  
                    </td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">船期：</td>  
                    <td class="tableContent">  
                    <input type="text" style="width: 90px" name="shipTime" class="Wdate"  
                     onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd'});"/>  
                    </td>  
                    <td class="columnTitle_mustbe">贸易条款：</td>  
                    <td class="tableContent"><input type="text" name="tradeTerms" /></td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">打印版式：</td>  
                    <td class="tableContent">  
                    <input type="radio" name="printStyle" value="2" checked="checked"/>两款  
                    <input type="radio" name="printStyle" value="1" />一款  
                    </td>  
                    <td class="columnTitle_mustbe">归档前状态：</td>  
                    <td class="tableContent"><input type="text" name="oldState" /></td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">状态：</td>  
                    <td class="tableContent"><input type="text" name="state" /></td>  
                    <td class="columnTitle_mustbe">走货状态：</td>  
                    <td class="tableContent"><input type="text" name="outState" /></td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">说明：</td>  
                    <td class="tableContent"><textarea  name="remark" style="height:200px;width: 400px"></textarea></td>  
                </tr>  
    			</table>
    		</div>
    	</div>
	</div>
</form>
</body>
</html>