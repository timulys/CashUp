package com.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class RiseController {
    @GetMapping("/sise_rise")
    public ModelAndView siseRise() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("siseRise");
        return mv;
    }

    @GetMapping("/sise_low_up")
    public ModelAndView siseLowUp() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("siseLowUp");
        return mv;
    }
}
