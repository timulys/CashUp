var jqGrid;

function grid(category) {
    jqGrid = $("#jqGridList").jqGrid({
        url: "ajax/sise_rise",
        postData: {category : category},
        datatype: 'json',
        altRows: true,
        autowidth: "auto",
        forceFit: true,
        height: "auto",
        shrinkToFit: true,
        sortable: true,
        loadui: "block",
        viewrecords: true,
        pager: "#jqGridPager",
        jsonReader: {
            root: "listData",
            page: "page",
            total: "totalPage",
            records: "totalCnt",
            repeatitems: false,
            id: "_ID_"
        },
        colNames: ["순번", "이름", "현재가", "전일비", "등락률", "거래량", "PER", "ROE"],
        colModel: [
            {title: true, name: "num", sortable: true, hidden: false, hidedlg: false, align: "left", width: 60},
            {title: true, name: "name", sortable: true, hidden: false, hidedlg: false, align: "left", width: 240},
            {title: true, name: "currentCost", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "adayCost", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "fluctuation", sortable: true, hidden: false, hidedlg: false, align: "left", width: 120,
                cellattr: function (data) {
                    return 'style="color:red; font-weight:bold"';
                }
            },
            {title: true, name: "volume", sortable: true, hidden: false, hidedlg: false, align: "left", width: 100},
            {title: true, name: "per", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80,
                cellattr: function (rowId, iv) {
                    if (iv.indexOf("-") != -1) {
                        return 'style="color:blue;"';
                    }
                }
            },
            {title: true, name: "roe", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80,
                cellattr: function (rowId, iv) {
                    if (iv.indexOf("-") != -1) {
                        return 'style="color:blue;"';
                    }
                }
            }
        ],
    });
};

var kospi = setInterval(function() {
    jqGrid.setGridParam({
        postData:{
            category:"kospi"
        }
    });
    jqGrid.trigger("reloadGrid");
}, 5000);

var kosdac = setInterval(function() {
    jqGrid.setGridParam({
        postData:{
            category:"kosdac"
        }
    });
    jqGrid.trigger("reloadGrid");
}, 5000);

function reloadKospi() {
    clearInterval(kosdac);
    grid("kospi");
    kospi;
}

function reloadKosdac() {
    clearInterval(kospi);
    grid("kosdac");
    kosdac;
}

$(function() {
    grid("kospi");
});