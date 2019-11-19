package com.oycc.utils;

import javafx.scene.input.DataFormat;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Description:
 * User: oycc
 * Date: 2019-11-19
 */
public class StringtoDate  implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("字符串转换成时间类型，不能为空");

        } else {
            SimpleDateFormat df=  new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = df.parse(s);
                return date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
