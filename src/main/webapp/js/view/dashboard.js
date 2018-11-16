function showForeign() {
    $.ajax({
        url: "ajax/foreign",
        success: function(o) {
            $("#contentarea").empty();
            $("#contentarea").append(o);
        }
    });
}

function showDomestic() {
    $.ajax({
        url: "ajax/domestic",
        success: function(o) {
            $("#contentarea").empty();
            $("#contentarea").append(o);
        }
    });
}

$(function() {
    showDomestic();
});