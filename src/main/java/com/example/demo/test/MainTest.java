package com.example.demo.test;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(13/10);

        String s = "200525-592951542982670";
        System.out.println(s.substring(s.indexOf("-") + 1));

        String sku = "30004447689|颜色分类:军绿色;尺码:XS";
        Long skuId = Long.valueOf(sku.substring(0,sku.indexOf("|")));
        System.out.println(skuId);
    }
}
