<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<script src="${pageContext.request.contextPath}/js/view/article/article.js"></script>

<div class="col-lg-3">
    <%--<h5 class="my-2" style="text-align: center">상승메뉴</h5>
    <div class="list-group">
        &lt;%&ndash;<a href="/" class="list-group-item active">상승종목</a>&ndash;%&gt;
        <span class="list-group-item dropdown-toggle active" style="cursor:pointer" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-fw fa-folder"></i>
            <span>키워드검색</span>
        </span>
        <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <span class="button dropdown-item" style="cursor:pointer" onclick="reloadKospi()">KOSPI</span>
            <span class="button dropdown-item" style="cursor:pointer" onclick="reloadKosdac()">KOSDAC</span>
            &lt;%&ndash;<a class="dropdown-item" href="" onclick="reloadKospi()">KOSPI</a>
            <a class="dropdown-item" href="" onclick="reloadKosdac()">KOSDAC</a>&ndash;%&gt;
        </div>
        <a href="#" class="list-group-item">급등종목</a>
        <a href="#" class="list-group-item">거래량 급증종목</a>
        <a href="#" class="list-group-item">Golden Cross</a>
    </div>--%>
</div>
<div class="col-lg-9">
    <div class="ui segments" id="article">
    </div>
</div>