package com.finance.service;

import com.finance.dao.CrollingDao;
import com.finance.utils.ElementUtils;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ArticleService {

    @Autowired
    private CrollingDao crollingDao;

    public String getArticleList() throws IOException {
        Document doc = crollingDao.crolling("https://search.naver.com/search.naver?&where=news&query=%EC%98%81%EC%97%85%EC%9D%B4%EC%9D%B5&sm=tab_pge&sort=1&photo=0&field=0&reporter_article=&pd=0&ds=&de=&docid=&nso=so:dd,p:all,a:all&mynews=0&start=11&refresh_start=0");
        Elements elements = ElementUtils.getElement(doc, "._prs_nws");

        return elements.toString();
    }

}
