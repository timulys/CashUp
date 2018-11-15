package com.finance.service;

import com.finance.dao.CrollingDao;
import com.finance.domain.RiseSubject;
import com.finance.utils.ElementUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class RiseSubjectService {

    @Autowired
    private CrollingDao crollingDao;

    public List<RiseSubject> showRiseKospi() throws IOException {
        Document doc = crollingDao.crolling("https://finance.naver.com/sise/sise_rise.nhn?sosok=0");
        Elements elements = ElementUtils.getElement(doc, ".type_2>tbody>tr");

        return convertRiseSubjects(elements);
    }

    public List<RiseSubject> showRiseKosdac() throws IOException {
        Document doc = crollingDao.crolling("https://finance.naver.com/sise/sise_rise.nhn?sosok=1");
        Elements elements = ElementUtils.getElement(doc, ".type_2>tbody>tr");

        return convertRiseSubjects(elements);
    }

    private List<RiseSubject> convertRiseSubjects(Elements elements) {
        Function<Element, RiseSubject> mapper = el -> {
            RiseSubject riseSubject = RiseSubject.toSubject(el.children());
            return riseSubject;
        };
        List<RiseSubject> riseSubjects = elements.stream().filter(rs -> {
            if ("N".equals(rs.children().get(0).text()) || "".equals(rs.children().get(0).text())) {
                return false;
            }
            return true;
        }).map(mapper).collect(Collectors.toList());

        return riseSubjects;
    }
}
