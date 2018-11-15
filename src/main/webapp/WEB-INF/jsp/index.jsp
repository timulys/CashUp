<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" Content="text/html; charset=euc-kr" />
<link href="${pageContext.request.contextPath}/css/ui.jqgrid.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/finance.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/jquery/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jqgrid.min.js"></script>
<script src="${pageContext.request.contextPath}/js/view/index.js"></script>
<head>
</head>
<body>
<div class="ui segment">
    <button onclick="javascript:reloadKospi()">KOSPI</button>
    <button onclick="javascript:reloadKosdac()">KODAC</button>
    <!-- jqGridgrid -->
    <div id="grid_body">
        <div id="jqGrid">
            <table id="jqGridList" class="ui striped table tablet stackable"></table>
        </div>
    </div>
    <!-- /jqGridgrid -->
</div>
</body>
</html>