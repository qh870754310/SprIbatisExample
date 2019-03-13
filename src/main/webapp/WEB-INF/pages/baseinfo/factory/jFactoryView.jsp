<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看厂家信息</title>
</head>
<body>
	<form method="post">
		<div id="menubar">
			<div id="middleMenubar">  
            	<div id="innerMenubar">  
                	<div id="navMenubar">  
	                    <ul>  
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
            			查看生产厂家信息  
        			</div>   
        		</div>  
        	</div>
		</div>
		
		<div>
			<table class="commonTable" cellspacing="1">
				<tr>  
                    <td class="columnTitle_mustbe">厂家名称：</td>  
                    <td class="tableContent">${factory.fullName }</td>  
                    <td class="columnTitle_mustbe">简称：</td>  
                    <td class="tableContent">${factory.factoryName }</td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">联系人：</td>  
                    <td class="tableContent">${factory.contacts }</td>  
                    <td class="columnTitle_mustbe">电话：</td>  
                    <td class="tableContent">${factory.phone }</td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">手机：</td>  
                    <td class="tableContent">${factory.mobile }</td>  
                    <td class="columnTitle_mustbe">传真：</td>  
                    <td class="tableContent">${factory.fax }</td>  
                </tr>  
                  
                 <tr>  
                    <td class="columnTitle_mustbe">检验员：</td>  
                    <td class="tableContent">${factory.inspector }</td>  
                    <td class="columnTitle_mustbe">排序号：</td>  
                    <td class="tableContent">${factory.orderNo }</td>  
                </tr>  
                  
                <tr>  
                    <td class="columnTitle_mustbe">备注：</td>  
                    <td class="tableContent">${factory.cnote }</td>  
                </tr>  
			</table>
		</div>
	</form>
</body>
</html>