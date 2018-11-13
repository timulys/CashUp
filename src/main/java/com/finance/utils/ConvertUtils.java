package com.finance.utils;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ConvertUtils {
    public static Element getElement(Document doc, String selectTag) {
        return doc.select(selectTag).first();
    }

}
