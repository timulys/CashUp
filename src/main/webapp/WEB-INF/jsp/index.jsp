<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<script src="${pageContext.request.contextPath}/js/view/index.js"></script>
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