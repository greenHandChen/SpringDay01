package com.zhang.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:DateUtils
 * Author:ZhangChunjia
 * Date:2019/7/18 10:16
 */
public class DateUtils {
    public String dateFromat(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
        return sdf.format(date);
    }
}
