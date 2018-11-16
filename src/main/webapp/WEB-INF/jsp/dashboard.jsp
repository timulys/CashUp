<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<script src="${pageContext.request.contextPath}/js/view/dashboard.js"></script>
<div class="col-lg-3">
    <h1 class="my-4">Home</h1>
    <div class="list-group">
        <a href="javascript:showDomestic()" class="list-group-item active">국내증시</a>
        <a href="javascript:showForeign()" class="list-group-item">해외증시</a>
        <a href="#" class="list-group-item">실시간 뉴스</a>
    </div>
</div>
<div class="col-lg-9">
    <div class="ui segment">
        <!-- index cart -->
        <div id="contentarea">

        </div>
    </div>
</div>