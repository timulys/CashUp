package com.finance.dao;

import com.finance.utils.TimeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Web Page Crolling Service
 */
@Component
public class CrollingDao {

    public Document crolling(String url) throws IOException {
        System.out.println("Crolling Start Date : " + TimeUtils.getCurrentDate());
        Document doc = Jsoup.connect(url).get();
        System.out.println("Crolling End Date : " + TimeUtils.getCurrentDate());

        return doc;
    }

}
