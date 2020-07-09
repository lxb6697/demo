package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsSizespecClassGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecClassGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 11:05
 */
public class PddGoodsSizespecClassGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.sizespec.class.get
         * pdd.goods.sizespec.class.get尺码表分类查询
         * 更新时间：2020-03-04 11:13:00
         * ¥免费
         * 必须用户授权
         * 管理尺码表模板、创建尺码表模板需要使用分类管理
         */
        PddGoodsSizespecClassGetRequest request = new PddGoodsSizespecClassGetRequest();
        PddGoodsSizespecClassGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
        //{"response":{"error_code":1000000,"result":[{"children":[{"id":5,"name":"男装上衣"},{"id":6,"name":"男装下衣"},{"id":7,"name":"女装上衣"},{"id":8,"name":"女装下衣"}],"id":1,"name":"衣服"},{"children":[{"id":9,"name":"男鞋"}],"id":2,"name":"鞋类"},{"children":[{"id":10,"name":"文胸"}],"id":3,"name":"内衣"},{"children":[{"id":11,"name":"童鞋"}],"id":4,"name":"童鞋"}],"success":true}}
    }
}
