package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsListGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsListGetResponse;
import com.pdd.pop.sdk.http.PopClient;

public class PddGoodsListGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.goods.list.get（商品列表接口）
         * ¥免费
         * 必须用户授权
         * 商品列表查询
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.goods.list.get
         */
        PddGoodsListGetRequest request = new PddGoodsListGetRequest();
        request.setOuterId("str");
        request.setIsOnsale(0);
        request.setGoodsName("str");
        request.setPageSize(100);
        request.setPage(1);
        request.setOuterGoodsId("str");
        request.setCostTemplateId(0L);
        PddGoodsListGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));

    }
}