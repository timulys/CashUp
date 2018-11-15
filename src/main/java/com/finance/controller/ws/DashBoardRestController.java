package com.finance.controller.ws;

import com.finance.service.DashBoardService;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class DashBoardRestController {

    @Autowired
    private DashBoardService service;

    @RequestMapping(value = "/ajax/domestic", method = RequestMethod.GET)
    @ResponseBody
    public String showDomestic() throws IOException {
        String chart = service.showDomesticChart();
        return chart;
    }

    @RequestMapping(value = "/ajax/foreign", method = RequestMethod.GET)
    @ResponseBody
    public List<Elements> showForeign() throws IOException {
        // FIXME : List<Elements>를 Json으로 변형해서 넘길 수 있는 방법을 찾아야 함.
        return service.showForeignChart();
    }

}
