package com.example.demo.hutool;

import cn.hutool.core.date.ChineseDate;
import cn.hutool.core.date.DateUtil;
import org.junit.Assert;

public class ChineseDateTest {

    public static void main(String[] args) {
        ChineseDate date = new ChineseDate(DateUtil.parseDate("2020-01-25"));
        Assert.assertEquals(2020, date.getChineseYear());

        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals("一月", date.getChineseMonth());
        Assert.assertEquals("正月", date.getChineseMonthName());


        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals("初一", date.getChineseDay());

        Assert.assertEquals("庚子", date.getCyclical());
        Assert.assertEquals("鼠", date.getChineseZodiac());
        Assert.assertEquals("春节", date.getFestivals());
        Assert.assertEquals("庚子鼠年 正月初一", date.toString());

        date = new ChineseDate(DateUtil.parseDate("2020-01-14"));
        Assert.assertEquals("己亥猪年 腊月二十", date.toString());
        date = new ChineseDate(DateUtil.parseDate("2020-01-24"));
        Assert.assertEquals("己亥猪年 腊月三十", date.toString());

        Assert.assertEquals("2019-12-30", date.toStringNormal());

        date = new ChineseDate(DateUtil.parseDate("2049-02-12"));
        System.out.println(date);

        long i = 0x0a570;
        System.out.println(i);
    }

}
