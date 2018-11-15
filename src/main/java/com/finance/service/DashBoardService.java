package com.finance.service;

import com.finance.dao.CrollingDao;
import com.finance.utils.ElementUtils;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DashBoardService {

    @Autowired
    private CrollingDao crollingDao;

    public String showDomesticChart() throws IOException {
        Document doc = crollingDao.crolling("https://finance.naver.com/sise/");
        Elements elements = ElementUtils.getElement(doc, ".box_top_submain2");

        return elements.toString();
    }

    public String showForeignChart() throws IOException {
        Document doc = crollingDao.crolling("https://finance.naver.com/world/");
        Elements elements = ElementUtils.getElement(doc, ".market_include");

        Elements worldIndexColumn1 = elements.select("worldIndexColumn1>li");

        return worldIndexColumn1.toString();
    }
}
