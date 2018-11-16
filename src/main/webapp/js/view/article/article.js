function searchArticle() {
    $.ajax({
        url: "ajax/articleList",
        success: function(o) {
            $("#article").empty();
            $("#article").append(o);
        }
    });
}

$(function() {
    searchArticle();
});