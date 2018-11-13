package com.finance.controller;

import com.finance.domain.RiseSubject;
import com.finance.service.RiseSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
public class CashUpController {

    @Autowired
    RiseSubjectService riseSubjectService;


    @GetMapping("/")
    public ModelAndView index() throws IOException {
        ModelAndView mv = new ModelAndView();
        List<RiseSubject> riseSubjects = riseSubjectService.showRiseSubject();
        mv.addObject("rises", riseSubjects);
        mv.setViewName("index");
        return mv;
    }
}
