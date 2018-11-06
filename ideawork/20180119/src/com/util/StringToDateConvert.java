package com.util;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/19.
 */
public class StringToDateConvert implements Converter<String,Date> {
    private String datePattern;

    public StringToDateConvert() {
    }

    public StringToDateConvert(String datePattern) {
        this.datePattern = datePattern;
    }





    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(datePattern);
        simpleDateFormat.setLenient(false);
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw  new IllegalArgumentException("无效的日期模板");
        }
    }
}
