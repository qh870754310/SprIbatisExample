<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 引入c标签库-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--配置虚拟路径(工程路径)--> 
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!--引入最基础的css与js配置文件 -->
<link rel="stylesheet" rev="stylesheet" type="text/css" href="${ctx}/skin/default/css/default.css" media="all"/>
<script language="javascript" src="${ctx}/js/common.js"></script>