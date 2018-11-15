<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="${pageContext.request.contextPath}/css/ui.jqgrid.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet" />
<%--<link href="${pageContext.request.contextPath}/css/finance.css" rel="stylesheet" />--%>
<script src="${pageContext.request.contextPath}/js/jquery/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery/jqgrid.min.js"></script>
<script src="${pageContext.request.contextPath}/js/view/dashboard.js"></script>
<head>
</head>
<body>
<div class="ui segment">
    <button onclick="javascript:showDomestic()">국내증시</button>
    <button onclick="javascript:showForeign()">해외증시</button>
    <!-- index cart -->
    <div id="contentarea">

    </div>
</div>
</body>
</html>
