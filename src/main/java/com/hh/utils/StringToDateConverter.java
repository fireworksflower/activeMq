package com.hh.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/5 9:28
 **/
public class StringToDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("请传入数据");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return format.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("String类型数据转换Date类型出现错误");

        }

    }
}
