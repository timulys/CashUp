package com.finance.controller.ws;

import com.finance.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ArticleRestController {

    @Autowired
    private ArticleService service;

    @RequestMapping(value = "/ajax/articleList", method = RequestMethod.GET)
    @ResponseBody
    public String getArticleList() throws IOException {
        return service.getArticleList();
    }

}
