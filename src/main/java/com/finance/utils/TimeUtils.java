package com.finance.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public static String getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return format.format(new Date());
    }
}
