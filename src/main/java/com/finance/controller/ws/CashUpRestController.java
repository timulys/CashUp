package com.finance.controller.ws;

import com.finance.domain.RiseSubject;
import com.finance.service.RiseSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class CashUpRestController {

    @Autowired
    private RiseSubjectService service;

    @RequestMapping(value="/ajax/sise_rise", method = RequestMethod.GET)
    @ResponseBody
    public List<RiseSubject> getSise_rise(@RequestParam("category") String category) throws IOException {
        List<RiseSubject> riseSubjects = null;
        if ("kospi".equals(category)) {
            riseSubjects = service.showRiseKospi();
        } else {
            riseSubjects = service.showRiseKosdac();
        }
        return riseSubjects;
    }
}
