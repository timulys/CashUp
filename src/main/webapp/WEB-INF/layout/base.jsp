<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<link href="${pageContext.request.contextPath}/css/ui.jqgrid.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/finance.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/jquery/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jqgrid.min.js"></script>
<script src="${pageContext.request.contextPath}/js/view/dashboard.js"></script>
<html>
<head>
    <tiles:insertAttribute name="header" />
</head>
<body>
<div id="wrapper">
    <tiles:insertAttribute name="body" />
    <tiles:insertAttribute name="footer" />
</div>
</body>
</html>