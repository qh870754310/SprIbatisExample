<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp" %>
<%@ include file="../../baselist.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加货物信息</title>
<script type="text/javascript">  
	//设置冗余的生产厂家名称  
	function setFactoryName(val){  
	    var ele=document.getElementById("factoryName");  
	    ele.value=val;  
	}  
</script>
</head>
<body>
<form method="post">  
<div id="menubar">  
<div id="middleMenubar">  
<div id="innerMenubar">  
    <div id="navMenubar">  
<ul>  
<li id="save"><a href="#" onclick="formSubmit('update.action','_self');">确定</a></li>  
<li id="back"><a href="${ctx}/cargo/contract/list.action">返回</a></li>  
</ul>  
    </div>  
</div>  
</div>  
</div>  
       
<div class="textbox" id="centerTextbox">  
    <div class="textbox-header">  
    	<div class="textbox-inner-header">  
    		<div class="textbox-title">  
        		修改货物信息  
    		</div>   
    	</div>  
    </div>  
</div>  
   
<div>  
	<table class="commonTable" cellspacing="1">  
    	<input type="hidden" name="id" value="${contractProduct.id}"/>  
		<input type="hidden" name="contractId" value="${contractProduct.contractId}"/>  
			<tr>  
                <td class="columnTitle_mustbe">厂家名称：</td>  
                <td class="tableContent">  
                <select name="factoryId" onchange="setFactoryName(this.options[this.selectedIndex].text);">  
                    <option value="">--请选择--</option>  
                    <c:forEach items="${factoryList}" var="f">  
                    	<option value="${f.id}" <c:if test="${contractProduct.factoryId==f.id}">selected</c:if>>${f.factoryName }</option>  
                    </c:forEach>  
                    <input type="hidden" id="factoryName" name="factoryName" value="${contractProduct.factoryName}"/>  
                </select>  
                </td>  
                <td class="columnTitle_mustbe">货号：</td>  
                <td class="tableContent"><input type="text" name="productNo" value="${contractProduct.productNo}"/></td>  
            </tr>  
                  
            <tr>  
                <td class="columnTitle_mustbe">货物照片：</td>  
                <td class="tableContent"><input type="text" name="productImage" value="${contractProduct.productImage}"/></td>  
                  
            </tr>  
              
            <tr>  
                <td class="columnTitle_mustbe">数量</td>  
                <td class="tableContent"><input type="text" name="cnumber" value="${contractProduct.cnumber}"/></td>  
                <td class="columnTitle_mustbe">装率：</td>  
                <td class="tableContent"><input type="text" name="loadingRate" value="${contractProduct.loadingRate}"/></td>  
            </tr>  
              
             <tr>  
                <td class="columnTitle_mustbe">箱数：</td>  
                <td class="tableContent"><input type="text" name="boxNum" value="${contractProduct.boxNum}"/></td>  
                <td class="columnTitle_mustbe">单价：</td>  
                <td class="tableContent"><input type="text" name="price" value="${contractProduct.price}"/></td>  
            </tr>  
                  
            <tr>  
               <td class="columnTitle_mustbe">包装单位：</td>  
               <td class="tableContent"><input type="text" name="packingUnit" value="${contractProduct.packingUnit}"/></td>  
               <td class="columnTitle_mustbe">排序号：</td>  
               <td class="tableContent"><input type="text" name="orderNo" value="${contractProduct.orderNo}"/></td>  
           </tr>  
             
           <tr>  
               <td class="columnTitle_mustbe">货物描述：</td>  
               <td class="tableContent">
               	<textarea name="productDesc" style="height:200px;width: 400px">${contractProduct.productDesc}</textarea>
               </td>  
			</tr>  
        </table>  
	</div>
	
	
	<div>
		<table id="ec_table" class="tableRegion" width="98%" >  
    <thead>  
    <tr>  
        <td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>  
        <td class="tableHeader">序号</td>  
        <td class="tableHeader">厂家名称</td>  
        <td class="tableHeader">货号</td>  
        <td class="tableHeader">数量</td>  
        <td class="tableHeader">包装单位</td>  
        <td class="tableHeader">装率</td>  
        <td class="tableHeader">箱数</td>  
        <td class="tableHeader">单价</td>  
        <td class="tableHeader">总金额</td>  
        <td class="tableHeader">操作</td>  
    </tr>  
    </thead>  
    <tbody class="tableBody" >  
      
    <c:forEach items="${dataList}" var="o" varStatus="status">  
    <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >  
        <td><input type="checkbox" name="id" value="${o.id}"/></td>  
        <td>${status.index+1}</td>  
        <td>${o.factoryName}</td>  
        <td>${o.productNo}</td>  
        <td>${o.cnumber}</td>  
        <td>${o.packingUnit}</td>  
        <td>${o.loadingRate }</td>  
        <td>${o.boxNum }</td>  
        <td>${o.price }</td>  
        <td>${o.amount}</td>  
        <td>  
            <a href="${ctx}/cargo/contractproduct/toupdate.action?id=${o.id}">[修改] </a>  
            <a href="${ctx}/cargo/contractproduct/delete.action?id=${o.id}">[删除]</a>  
        </td>  
    </tr>  
    </c:forEach>  
    </tbody>  
</table>
	</div> 
</form>
</body>
</html>