function showForeign() {
    $.ajax({
        url: "ajax/dashboard",
        data: { type:"foreign" },
        success: function(o) {
            $("#contentarea").empty();
            $("#contentarea").append(o);
        }
    });
}

function showDomestic() {
    $.ajax({
        url: "ajax/dashboard",
        data: { type:"domestic" },
        success: function(o) {
            $("#contentarea").empty();
            $("#contentarea").append(o);
        }
    });
}

$(function() {

});