package com.finance.utils;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ElementUtils {
    public static Elements getElement(Document doc, String selectTag) {
        return doc.select(selectTag);
    }
}
