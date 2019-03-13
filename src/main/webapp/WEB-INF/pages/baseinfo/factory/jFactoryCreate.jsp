<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加厂家信息</title>
</head>
<body>
	<form method="post">
		<div id="menubar">
			<div id="middleMenubar">  
            	<div id="innerMenubar">  
                	<div id="navMenubar">  
                    	<ul>  
                    		<li id="save"><a href="#" onclick="formSubmit('insert.action','_self');">确定</a></li>  
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
            			新增生产厂家信息  
        			</div>   
        		</div>  
        	</div>
        </div>
    		<div>
    			<div>  
           			<table class="commonTable" cellspacing="1">  
                		<tr>  
                    		<td class="columnTitle_mustbe">厂家名称：</td>  
                    		<td class="tableContent"><input type="text" name="fullName" /></td>  
                    		<td class="columnTitle_mustbe">简称：</td>  
                    		<td class="tableContent"><input type="text" name="factoryName" /></td>  
                		</tr>  
                  
                		<tr>  
                    		<td class="columnTitle_mustbe">联系人：</td>  
                    		<td class="tableContent"><input type="text" name="contacts" /></td>  
                    		<td class="columnTitle_mustbe">电话：</td>  
                    		<td class="tableContent"><input type="text" name="phone" /></td>  
                		</tr>  
                  
		                <tr>  
		                    <td class="columnTitle_mustbe">手机：</td>  
		                    <td class="tableContent"><input type="text" name="mobile" /></td>  
		                    <td class="columnTitle_mustbe">传真：</td>  
		                    <td class="tableContent"><input type="text" name="fax" /></td>  
		                </tr>  
                  
		                <tr>  
		                    <td class="columnTitle_mustbe">检验员：</td>  
		                    <td class="tableContent"><input type="text" name="inspector" /></td>  
		                    <td class="columnTitle_mustbe">排序号：</td>  
		                    <td class="tableContent"><input type="text" name="orderNo" /></td>  
		                </tr>  
                  
		                <tr>  
		                    <td class="columnTitle_mustbe">备注：</td>  
		                    <td class="tableContent"><textarea  name="cnote" style="height:200px;width: 400px"></textarea></td>  
		                </tr>  
            		</table>  
        		</div>  
        	</div> 
	</form>
</body>
</html>