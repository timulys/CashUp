package com.finance.controller;

import com.finance.utils.TimeUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

@RestController
public class CashUpController {

    @GetMapping("/")
    public ModelAndView index() throws IOException {
        ModelAndView mv = new ModelAndView();

        System.out.println("Crolling Start Date : " + TimeUtils.getCurrentDate());
        HttpPost http = new HttpPost("https://finance.naver.com/sise/sise_rise.nhn");
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(http);
        HttpEntity entity = response.getEntity();
        ContentType contentType = ContentType.getOrDefault(entity);
        Charset charset = contentType.getCharset();

        BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent(), charset));
        StringBuilder sb = new StringBuilder();

        String line = "";
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }

        System.out.println(sb.toString());
        Document doc = Jsoup.parse(sb.toString());
        /*Document doc2 = Jsoup.connect("https://finance.naver.com/sise/sise_rise.nhn").get();*/
        Element upperSubject = doc.select("div.box_type_l").first();
        System.out.println("Crolling End Date : " + TimeUtils.getCurrentDate());

        mv.addObject("content", upperSubject);
        mv.setViewName("index");
        return mv;
    }
}
