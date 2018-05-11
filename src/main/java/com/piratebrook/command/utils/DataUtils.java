package com.piratebrook.command.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

    public static String timeStr() {
        return timeStr(new Date());
    }

    public static String timeStr(Date date) {
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date.getTime());
        System.out.println("格式化结果1：" + time);
        return time;
    }
}
