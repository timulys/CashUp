<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<script src="${pageContext.request.contextPath}/js/jquery/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jquery.pagination.js"></script>
<link href="${pageContext.request.contextPath}/css/shop-item.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/finance.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet" />

<link href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.bundle.min.js"></script>

<link href="${pageContext.request.contextPath}/css/ui.jqgrid.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery/jqgrid.min.js"></script>

<html>
<tiles:insertAttribute name="header" />
<body>
<tiles:insertAttribute name="nav" />
<div class="container">
    <div class="row">
        <tiles:insertAttribute name="body" />
    </div>
</div>
<tiles:insertAttribute name="footer" />
</body>
</html>