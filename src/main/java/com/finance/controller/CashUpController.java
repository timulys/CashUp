package com.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class CashUpController {
    @GetMapping("/sise_rise")
    public ModelAndView rise() throws IOException {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
