package com.finance.service;

import com.finance.dao.CrollingDao;
import com.finance.domain.RiseSubject;
import com.finance.utils.ConvertUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RiseSubjectService {

    @Autowired
    private CrollingDao crolling;

    public List<RiseSubject> showRiseSubject() throws IOException {
        Document doc = crolling.crolling("https://finance.naver.com/sise/sise_rise.nhn");
        Element element = ConvertUtils.getElement(doc, "div.box_type_l");

        return convertRiseSubjects(element);
    }

    private List<RiseSubject> convertRiseSubjects(Element element) {
        List<RiseSubject> riseSubjects = new ArrayList<>();


        return riseSubjects;
    }

}
