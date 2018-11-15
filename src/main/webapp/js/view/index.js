var jqGrid;

function grid(category) {
    console.log(category);
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
        jsonReader: {
            root: "listData",
            page: "page",
            total: "totalPage",
            records: "totalCnt",
            repeatitems: false,
            id: "_ID_"
        },
        colNames: ["순번", "이름", "현재가", "전일비", "등락률", "거래량", "매수호가", "매도호가", "매수총잔량", "매도총잔량", "PER", "ROE"],
        colModel: [
            {title: true, name: "num", sortable: true, hidden: false, hidedlg: false, align: "left", width: 60},
            {title: true, name: "name", sortable: true, hidden: false, hidedlg: false, align: "left", width: 200},
            {title: true, name: "currentCost", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "adayCost", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "fluctuation", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80,
                cellattr: function (data) {
                    return 'style="color:red; font-weight:bold"';
                }
            },
            {title: true, name: "volume", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "buying", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "celling", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "buyingVol", sortable: true, hidden: false, hidedlg: false, align: "left", width: 100},
            {title: true, name: "cellingVol", sortable: true, hidden: false, hidedlg: false, align: "left", width: 100},
            {title: true, name: "per", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80},
            {title: true, name: "roe", sortable: true, hidden: false, hidedlg: false, align: "left", width: 80}
        ],
    });
};

function reloadKospi() {
    jqGrid.setGridParam({
        postData:{
            category:"kospi"
        }
    });
    jqGrid.trigger("reloadGrid");
}

function reloadKosdac() {
    jqGrid.setGridParam({
        postData:{
            category:"kosdac"
        }
    });
    jqGrid.trigger("reloadGrid");
}

$(function() {
    grid("kospi");
});