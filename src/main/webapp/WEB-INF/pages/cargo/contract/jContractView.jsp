<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp" %>
<%@ include file="../../baselist.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看购销合同</title>
<script language="javascript" src="${ctx}/datepicker/WdatePicker.js"></script>
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
        			查看购销合同信息  
    			</div>   
    		</div>  
    	</div>  
	</div>
	<div>
		<table cellspacing="1" class="commonTable">
			<tr>
				<td class="columnTitle_mustbe">客户名称：</td>
				<td class="tableContent">${contract.customName }</td>
				<td class="columnTitle_mustbe">收购方：</td>  
                <td class="tableContent">${contract.offeror }</td>
			</tr>
			<tr>  
                <td class="columnTitle_mustbe">合同号：</td>  
                <td class="tableContent">${contract.contractNo }</td>  
                <td class="columnTitle_mustbe">签单日期：</td>  
                <td class="tableContent">
                	<fmt:formatDate value="${contract.signingDate }" pattern="yyyy-MM-dd"/>  
                </td>  
            </tr>  
                 
            <tr>  
                <td class="columnTitle_mustbe">制单人：</td>  
                <td class="tableContent">${contract.inputBy }</td>  
                <td class="columnTitle_mustbe">审单人：</td>  
                <td class="tableContent">${contract.checkBy }</td>  
            </tr>  
                 
            <tr>  
               <td class="columnTitle_mustbe">验货员：</td>  
               <td class="tableContent">${contract.inspector }</td>  
               <td class="columnTitle_mustbe">总金额：</td>  
               <td class="tableContent">${contract.totalAmount}</td>  
           </tr>  
                 
            <tr>  
               <td class="columnTitle_mustbe">要求：</td>  
               <td class="tableContent">${contract.crequest}</td>  
               <td class="columnTitle_mustbe">交货期限：</td>  
               <td class="tableContent">  
               <fmt:formatDate value="${contract.deliveryPeriod }" pattern="yyyy-MM-dd"/>  
               </td>  
           </tr>  
                 
           <tr>  
               <td class="columnTitle_mustbe">船期：</td>  
               <td class="tableContent">  
               <fmt:formatDate value="${contract.shipTime}" pattern="yyyy-MM-dd"/>  
               </td>  
               <td class="columnTitle_mustbe">贸易条款：</td>  
               <td class="tableContent">${contract.tradeTerms }</td>  
           </tr>  
                 
          <tr>  
              <td class="columnTitle_mustbe">打印版式：</td>  
              <td class="tableContent">  
              <c:if test="${contract.printStyle=='2'}">两款</c:if>  
              <c:if test="${contract.printStyle=='1'}">一款</c:if>  
              </td>  
              <td class="columnTitle_mustbe">归档前状态：</td>  
              <td class="tableContent">${contract.oldState}</td>  
          </tr>  
            
          <tr>  
              <td class="columnTitle_mustbe">状态：</td>  
              <td class="tableContent">${contract.state}</td>  
              <td class="columnTitle_mustbe">走货状态：</td>  
              <td class="tableContent">${contract.outState}</td>  
          </tr>  
            
          <tr>  
              <td class="columnTitle_mustbe">重要程度：</td>  
              <td class="tableContent">  
              <c:if test="${contract.importNum==3}">★★★</c:if>  
              <c:if test="${contract.importNum==2}">★</c:if>  
              <c:if test="${contract.importNum==1}">★</c:if>  
              </td>  
          </tr>
                 
           <tr>
           	<td class="columnTitle_mustbe">说明：</td>  
               <td class="tableContent"><pre>${contract.remark}</pre></td>  
           </tr> 
		</table>
	</div>
	
	<div class="textbox" id="centerTextbox">  
		<div class="textbox-header">  
  			<div class="textbox-inner-header">  
  				<div class="textbox-title">  
    				货物列表  
  				</div>   
  			</div>  
  		</div>  
    
		<div>  
			<div class="eXtremeTable" >  
				<table id="ec_table" class="tableRegion" width="98%" >  
    				<thead>  
					    <tr>  
					        <td class="tableHeader">序号</td>  
					        <td class="tableHeader">厂家名称</td>  
					        <td class="tableHeader">货号</td>  
					        <td class="tableHeader">数量</td>  
					        <td class="tableHeader">包装单位</td>  
					        <td class="tableHeader">装率</td>  
					        <td class="tableHeader">箱数</td>  
					        <td class="tableHeader">单价</td>  
					        <td class="tableHeader">总金额</td>  
					    </tr>  
    				</thead>  
    				<tbody class="tableBody" >  
				    <c:forEach items="${obj.contractProducts}" var="cp" varStatus="status">  
					    <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >  
					        <td>${status.index+1}</td>  
					        <td>${cp.factory.factoryName}</td>  
					        <td>${cp.productNo}</td>  
					        <td>${cp.cnumber}</td>  
					        <td>${cp.packingUnit}</td>  
					        <td>${cp.loadingRate }</td>  
					        <td>${cp.boxNum }</td>  
					        <td>${cp.price }</td>  
					        <td>${cp.amount}</td>  
					    </tr>  
	        			<c:forEach items="${cp.extCproducts}" var="ext" varStatus="status">  
					        <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >  
					            <td><font color="blue">附件:${status.index+1}</font></td>  
					            <td>${ext.factory.factoryName}</td>  
					            <td>${ext.productNo}</td>  
					            <td>${ext.cnumber}</td>  
					            <td>${ext.packingUnit}</td>  
					            <td> </td>  
					            <td> </td>  
					            <td>${ext.price }</td>  
					            <td>${ext.amount}</td>  
					        </tr>  
	        			</c:forEach>  
    				</c:forEach>  
    				</tbody>  
				</table>  
			</div>  
		</div>
	</div> 
</form>
</body>
</html>