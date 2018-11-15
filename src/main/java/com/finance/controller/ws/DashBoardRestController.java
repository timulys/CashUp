package com.finance.controller.ws;

import com.finance.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class DashBoardRestController {

    @Autowired
    private DashBoardService service;

    @RequestMapping(value = "/ajax/dashboard", method = RequestMethod.GET)
    @ResponseBody
    public String getDashboard(@RequestParam("type") String type) throws IOException {
        String chart = null;
        if ("domestic".equals(type)) {
            chart = service.showDomesticChart();
        } else {
            chart = service.showForeignChart();
        }
        return chart;
    }

}
